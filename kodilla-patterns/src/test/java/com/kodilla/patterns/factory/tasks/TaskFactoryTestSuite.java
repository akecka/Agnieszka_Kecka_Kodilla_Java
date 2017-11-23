package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("buy gifts", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("Done", shoppingTask.executeTask());

    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("painting bedroom", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("Done", paintingTask.executeTask());

    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("driving home", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("Done", drivingTask.executeTask());
    }
}
