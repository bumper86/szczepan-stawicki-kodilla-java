package com.kodilla.testign2.crudapp;

import com.kodilla.testing2.comfig.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://sstawicki.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTest() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateElement = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateElement.click();
                });

        Thread.sleep(5000);

    }

    private boolean checkTaskExistsinTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("bumper6");
        driverTrello.findElement(By.id("password")).sendKeys("B1CVY3pc");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(5000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Aplication\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(5000);
        boolean breakIt = true;

        while (true) {
            breakIt = true;
            try {
                result = driverTrello.findElements(By.xpath("//span")).stream()
                        .filter(theSpan -> theSpan.getText().contains(taskName))
                        .collect(Collectors.toList())
                        .size() > 0;
            } catch (Exception e) {
                if(e.getMessage().contains("element is not attached")) {
                    breakIt = false;
                }
            } if (breakIt) {
                break;
            }
        }

        Thread.sleep(10000);
        driverTrello.close();

        return result;
    }

    public void  removeTaskFromCrudApp(String taskName) throws InterruptedException {
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement deleteElement = theForm.findElement(By.xpath(".// button[@data-task-delete-button]"));
                    deleteElement.click();
                });
        Thread.sleep(5000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        removeTaskFromCrudApp(taskName);
        assertTrue(checkTaskExistsinTrello(taskName));
    }
}

