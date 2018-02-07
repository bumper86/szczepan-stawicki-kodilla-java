package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String toDo = "Element to do list";
        String inProgress = "Element in progress list";
        String done = "Element done to list";
        board.toDoList.tasks.add(toDo);
        board.inProgressList.tasks.add(inProgress);
        board.doneList.tasks.add(done);
        //Then
        Assert.assertEquals("Element to do list", board.toDoList.tasks.get(0));
        Assert.assertEquals("Element in progress list", board.inProgressList.tasks.get(0));
        Assert.assertEquals("Element done to list", board.doneList.tasks.get(0));
    }
}
