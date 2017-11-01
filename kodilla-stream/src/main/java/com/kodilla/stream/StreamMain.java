package com.kodilla.stream;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultListOfForumUser = forum.getList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> 2017 - forumUser.getBirthDate().getYear() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdentifierOfUser, forumUser -> forumUser));

        System.out.println(theResultListOfForumUser.size());
                theResultListOfForumUser.entrySet().stream()
                        .map(entry -> entry.getKey() + ":" + entry.getValue())
                        .forEach(System.out:: println);
    }
}
/*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        String toDecorate = "My poem";
        String rep = "Joli";
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(toDecorate, (a) -> a.toUpperCase());//String::toUpperCase
        poemBeautifier.beautify(toDecorate, (a) -> "ABC" + a + "ABC");
        poemBeautifier.beautify(toDecorate, (a) -> a.replace(' ', '_'));
        poemBeautifier.beautify(toDecorate, (a) -> a.replace("My", rep));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/