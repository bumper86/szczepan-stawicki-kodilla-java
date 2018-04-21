package com.kodilla.patterns2.observer.homework;

public class MentorUser implements Observer {
    private final String name;
    private int updateCount;

    public MentorUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(CourseTask courseTask) {
        System.out.println(name + ": new student finished his homework in task: " + courseTask.getTaskName()
        + "\n" + "You have " + courseTask.getUsers().size() + " tasks to verify");
        updateCount++;
    }

}
