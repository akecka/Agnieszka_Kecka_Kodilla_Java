package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        for (int n = 0; n < numbers.size(); n++){
            if (numbers.get(n) % 2 == 0) {
                evenNumbersList.add(numbers.get(n));
            }
        }
        return evenNumbersList;
    }
}
