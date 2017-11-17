package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testAddTasks() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        TaskList taskList = context.getBean(TaskList.class);
        //When
        TaskList toDoList = new TaskList();
        toDoList.addTasks("project/task file");
        TaskList inProgressList = new TaskList();
        inProgressList.addTasks("testing/debugging");
        TaskList doneList = new TaskList();
        doneList.addTasks("remove project field");
        //Then
        toDoList.showTasks();
        inProgressList.showTasks();
        doneList.showTasks();
    }
}
