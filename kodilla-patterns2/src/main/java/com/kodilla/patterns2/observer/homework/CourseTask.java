package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class CourseTask implements Observable {
    private final List<Observer> observers;
    private final List<StudentUser> users;
    private final String taskName;

    public CourseTask(String taskName) {
        users = new ArrayList<>();
        observers = new ArrayList<>();
        this.taskName = taskName;
    }

    public void addStudent(StudentUser studentUser){
        users.add(studentUser);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getTaskName() {
        return taskName;
    }

    public List<StudentUser> getUsers() {
        return users;
    }
}
