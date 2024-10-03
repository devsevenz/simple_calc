import java.util.Scanner;
import java.util.InputMismatchException;

public class ABANTE_P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;
        double input1 = 0;
        double input2 = 0;
        double result;
        String choice;
        String operation;



        // loop
        while (gameRunning) {
            boolean validInput = false;

            //to get valid inout
            while (!validInput) {
                try {
                    System.out.println("Please enter the first number: ");
                    input1 = scanner.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("ERROR! Please enter a valid whole or decimal number.");
                    scanner.next();
                }
            }
            // Reset
            validInput = false;

            // to get valid input of 2nd number
            while (!validInput) {
                try {
                    System.out.println("Please enter the second number: ");
                    input2 = scanner.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("ERROR! Please enter a valid whole or decimal number.");
                    scanner.next(); // Clear invalid input
                }
            }


            System.out.println("Choose an operator (+, -, *, /) or type the operation: ");
            operation = scanner.next().toLowerCase();

            //process
            switch (operation) {
                case "+":
                case "addition":
                    result = input1 + input2;
                    break;
                case "-":
                case "subtraction":
                    result = input1 - input2;
                    break;
                case "*":
                case "multiplication":
                    result = input1 * input2;
                    break;
                case "/":
                case "division":
                    if (input2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                        continue;
                    }
                    result = input1 / input2;
                    break;
                default:
                    System.out.println("Invalid operator! Please enter one of +, -, *, /.");
                    continue;
            }
            System.out.println("The result is: " + result);

            //loop
            System.out.print("Would you like to perform another operation? (y/n): ");
            choice = scanner.next().toLowerCase();

            if (!choice.equals("y")) {
                gameRunning = false;
            }
        }
        System.out.println("Thank You!");
    }
}

