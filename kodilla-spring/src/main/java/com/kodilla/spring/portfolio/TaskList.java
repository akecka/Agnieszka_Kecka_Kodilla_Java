package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTasks(String task) {
        tasks.add(task);
    }

    public void showTasks() {
        tasks.stream()
                .forEach(System.out::println);
    }
}
