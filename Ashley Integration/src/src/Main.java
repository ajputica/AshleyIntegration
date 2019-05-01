import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Call a method "concatenate" with 2 arguments
        String concatenated = concatenate("This string will be extended in a method.", "Extensiion.");

        //Using Random
        int randomFrom0To100 = new Random().nextInt(100);
        //Using Math
        double sqrtFromRandom = Math.sqrt((double) randomFrom0To100);

        //Using if-else
        if (sqrtFromRandom > 10) {
            System.out.println("Square is more than 10");
        } else {
            System.out.println("Square is not more than 10");
        }

        //Using trinary
        System.out.println("Square is " + (sqrtFromRandom > 10 ? "more" : "not more") + " than 10");

        int randomFrom0To10 = new Random().nextInt(10);
        switch (randomFrom0To10) {
            case 0:
                System.out.println("Number is 0");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Number is 1-3");
            default:
                System.out.println("Number is 4-9");
        }

        String first = new String("test");
        String second = new String("test");

        System.out.println("Comparing strings with == returns " + first == second + ", because they are different objects");
        System.out.println("Comparing strings with .equals returns " + first.equals(second) + ", because the content is the same");

        //Usage of +, -, *, /, %, ++, --, +=
        int sum = 1 + 2;
        int diff = 10 - 5;
        double mul = 1.1 * 2.2;
        double div = 2.5 / 0.5;
        int remaining = 13 % 10;
        int increment = ++sum;
        int decrement = --diff;
        sum += 5;

        //Usage of relational operators
        boolean gt = 5 > 10;
        boolean gte = 10 >= 10;
        boolean lt = 5 < 10;
        boolean lte = 10 <= 10;

        //Usage of conditional operators
        boolean trueAndFalse = true && false;
        boolean trueOrFalse = true || false;

        //operator precedence is folowing: unary increment/decrement, casting, multiplicative, additive, relational, equality, conditional.

        //Usage of loops:
        int remainaingIterations = 10;
        while (remainaingIterations > 0){
            remainaingIterations--;
            System.out.println("Looping iteration of while-loop");
        }

        for (int i = 0; i < 10; i++) {
            if(i ==7){
                //this loop will be fast-exited if on 7th iteration.
                break;
            }
            if(i == 3){
                //There will be no statement printed on 3rd iteration, remaining loop body of this iteration is skipped by continue statement.
                continue;
            }
            System.out.println("Looping iteration of for-loop");
        }
    }

    //Next line contains method header and parameters
    public static String concatenate(String first, String second) {
        return first + second;
    }
}