package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shop", "Carrot", 5.0 );
            case PAINTING:
                return new PaintingTask("Paint", "Blue", "House");
            case DRIVING:
                return new DrivingTask("Drive", "Warsaw", "Car");
                default:
                    return null;
        }
    }

}
