package test;

public class ExceptionHandling {

    public static void main(String args[]) throws Exception {
        try {
            SecondChallenge secondChallenge = new SecondChallenge();
            secondChallenge.probablyIWillThrowException(5, 0);

        } catch (Exception e) {

            System.out.println("Error: " + e);


        } finally {

            System.out.println("The answer is 42!");
        }
    }
}
