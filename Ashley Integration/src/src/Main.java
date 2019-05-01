import java.util.Scanner;

// AshleyPanem
// This is a cohesive program that entails a big combination of my programming exercises and coding. 
// variable is a name for a location in memory
// scope is a variable is only accessible in the method where it was declared
public class Main {

  public static void main(String[] args) {
    System.out.println("" +
        "Java build-in data types: \n" +
        "byte: 8-bit signed \n" +
        "short: 16-bit signed \n" +
        "int: 32-bit signed \n" +
        "long: 64-bit signed \n" +
        "float: 32-bit IEEE 754 floating point \n" +
        "double: 64-bit IEEE 754 floating point \n" +
        "boolean: bit value true/false \n" +
        "char: 16-bit unicode \n" +
        "Object: base class for any  other data type, instances held in heap\n" +
        "String : immutable character string\n"
    );

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name in:");
    System.out.println("Greetings, " + sc.nextLine());

    //Usage of variables
    boolean isMale = true;
    int age = 19;
    double weight = 73.5;
    String name = "Mike";
    System.out.println("Defined body measurments of " + name + " with variables, " + (isMale ? "male, " : "female, ") + age + "years old, weighting " + weight);

    System.out.println("Variable is a location to store some data associated with given name. Data can be referenced by name instead of memory address");
    System.out.println(
        "Scope is context of the code execution, where some variable names are defined and reachable. " +
            "Variables defined in one scope could not be reached from other independend scope"
    );

    // Value of final variable could not be changed during program execution.
    final String passportId = "ABCD1235";
    // Following line will not work
    // passportId = "FAKE1234"

    //// casting is when you assign a larger type to a smaller type
    //Only close data types could be casted
    int weightFullKgs = (int) weight;
    // Following line will not work
    // int weightFromString = (int)"FAKE1234";

    System.out.println(
        "This text is written \n as single String, \r but separated with escape sequences."
        );
    }
}