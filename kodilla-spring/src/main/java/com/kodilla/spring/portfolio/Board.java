package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Board {

    @Autowired
    @Qualifier("toDoList")
    public TaskList toDoList;
    @Autowired
    @Qualifier("toDoList")
    public TaskList inProgressList;
    @Autowired
    @Qualifier("toDoList")
    public TaskList doneList;

    @Autowired
    @Qualifier("toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return toDoList;
    }

    @Autowired
    @Qualifier("inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return inProgressList;
    }

    @Autowired
    @Qualifier("doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return doneList;
    }
}
