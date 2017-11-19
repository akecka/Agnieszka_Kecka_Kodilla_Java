package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testAddTasks() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTasks("write an email");
        board.getInProgressList().addTasks("testing/debugging");
        board.getDoneList().addTasks("remove project field");
        //Then

        Assert.assertEquals("write an email", board.toDoList.getTasks().get(0));
        Assert.assertEquals("testing/debugging", board.inProgressList.getTasks().get(0));
        Assert.assertEquals("remove project field", board.doneList.getTasks().get(0));
    }
}
