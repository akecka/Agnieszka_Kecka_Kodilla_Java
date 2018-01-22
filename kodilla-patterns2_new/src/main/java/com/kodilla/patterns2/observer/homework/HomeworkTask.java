package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTask implements ObservableTask {
    private final List<ObserverTask> observersTasks;
    private final List<String> messages;
    private final String name;

    public HomeworkTask(String name) {
        observersTasks = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        messages.add(task);
        notifyObservers();
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserverTask(ObserverTask observerTask) {
        observersTasks.add(observerTask);
    }

    @Override
    public void notifyObservers() {
        for (ObserverTask observerTask : observersTasks) {
            observerTask.update(this);
        }
    }

    @Override
    public void removeObserverTask(ObserverTask observerTask) {
        observersTasks.remove(observerTask);
    }
}
