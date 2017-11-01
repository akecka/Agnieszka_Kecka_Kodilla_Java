package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MainMovie {
    public static void main(String[] args) {

        String listMovies = MovieStore.getMovies().entrySet().stream()
                .flatMap(MovieStore -> MovieStore.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(listMovies);
    }
}
