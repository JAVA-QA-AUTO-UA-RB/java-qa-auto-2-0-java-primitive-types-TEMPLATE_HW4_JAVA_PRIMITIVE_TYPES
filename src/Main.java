import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner _ = new Scanner(System.in);

        // 1. Ask the user for their favorite number and double it.
        System.out.println("Enter your favorite number:");
        _ favoriteNumber = _.nextInt(); // Replace _ with the correct type and variable
        _ doubledNumber = _ * 2; // Replace _ with the correct variable/type
        System.out.println("Your favorite number doubled is: " + _); // Use the correct variable here

        // 2. Ask for a decimal number and halve it.
        System.out.println("Enter a decimal (double) number:");
        _ decimalNumber = _.nextDouble(); // Replace _ with the correct type and variable
        _ halvedDecimal = _ / 2; // Replace _ with the correct variable/type
        System.out.println("Half of your decimal number is: " + _); // Use the correct variable here

        // 3. Get a character, convert it to its ASCII value, and display it.
        System.out.println("Enter a single character:");
        _ character = _.next().charAt(0); // Replace _ with the correct type and variable
        _ asciiValue = _; // Replace _ with the correct variable/type
        System.out.println("The ASCII value of " + _ + " is: " + _); // Use correct variables here

        // 4. Check if the user wants pizza by asking for a yes/no (true/false).
        System.out.println("Do you like pizza? (true/false):");
        _ likesPizza = _.nextBoolean(); // Replace _ with the correct type and variable
        System.out.println("It is " + _ + " that you like pizza!"); // Use the correct variable here

        // Thank the user for playing the game.
        System.out.println("Thanks for playing! You’ve learned about Java primitive types.");

        // Close the scanner
        _.close(); // Replace _ with the correct scanner variable
    }
}