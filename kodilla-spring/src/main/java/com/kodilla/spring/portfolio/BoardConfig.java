package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("task1")
    TaskList taskList;
    @Autowired
    @Qualifier("task2")
    TaskList taskListTwo;
    @Autowired
    @Qualifier("task3")
    TaskList taskListThree;

    @Bean(name = "task1")
    @Scope("prototype")
    public TaskList taskList() {
        return new TaskList();
    }

    @Bean(name = "task2")
    @Scope("prototype")
    public TaskList taskListTwo() {
        return new TaskList();
    }

    @Bean(name = "task3")
    @Scope("prototype")
    public TaskList taskListThree() {
        return new TaskList();
    }

    @Bean
    public Board board() {
        return new Board(taskList, taskListTwo, taskListThree);
    }
}
