package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverTask {
    private final String username;
    private int update;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(HomeworkTask homeworkTask) {
        System.out.println(username + ": New task in queue " + homeworkTask.getName() + "\n" +
                " (total: " + homeworkTask.getMessages().size() + " tasks)");
        update++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdate() {
        return update;
    }
}
