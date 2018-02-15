package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements  Task{
    final String taskName;
    final String where;
    final String using;
    private boolean taskStatus;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving taks");
        taskStatus = true;
    }

    @Override
    public boolean isTaskExecuted() {
        if (taskStatus) {
            return true;
        } else {return false;}
    }
}
