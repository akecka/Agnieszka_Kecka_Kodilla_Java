package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String makeClass) {
        switch (makeClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("buy gifts", "bike", 1);
            case PAINTINGTASK:
                return new PaintingTask("painting bedroom", "pink", "bedroom");
            case DRIVINGTASK:
                return new DrivingTask("driving home", "home", "Ford Ka");
            default:
                return null;
        }
    }
}
