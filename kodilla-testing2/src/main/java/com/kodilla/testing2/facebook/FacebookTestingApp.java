package com.kodilla.testing2.facebook;

import com.kodilla.testing2.comfig.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement comboDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(comboDay);
        selectDay.selectByIndex(13);

        WebElement comboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(comboMonth);
        selectMonth.selectByVisibleText("lip");

        WebElement comboYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear= new Select(comboYear);
        selectYear.selectByValue("1986");
    }
}
