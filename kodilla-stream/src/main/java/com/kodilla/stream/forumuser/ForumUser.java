package com.kodilla.stream.forumuser;
import java.time.LocalDate;

public final class ForumUser {
    private final int identifierOfUser;
    private final String nameOfUser;
    private char gender;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(char gender,int identifierOfUser, String nameOfUser, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfPosts) {
        this.gender = gender;
        this.identifierOfUser = identifierOfUser;
        this.nameOfUser = nameOfUser;
        this.birthDate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public char gender(){
        return gender;
    }

    public int getIdentifierOfUser() {
        return identifierOfUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public char getGender() {
        return gender;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifierOfUser=" + identifierOfUser +
                ", nameOfUser='" + nameOfUser + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
