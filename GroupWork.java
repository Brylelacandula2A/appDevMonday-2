import java.util.Scanner;
public class GroupWork{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
<<<<<<< Updated upstream

        // Calling methods from Calculator.java
        System.out.println("Sum: " + Calculator.add(num1, num2));  // Group 1's method
=======
        
        // Using Math.max to find the larger number
        int maxNumber = Math.max(num1, num2);

        // Displaying the result
        System.out.println("The larger number is: " + maxNumber);
>>>>>>> Stashed changes

        System.out.println("Squared " + Calculator.square(num1)); //Group 6's method

        System.out.println("Difference: " + Calculator.subtract(num1, num2));  // Group 2's method

        System.out.println("Are numbers equal? " + Calculator.isEqual(num1, num2));  // Group 10's method
        scanner.close();
    }
}

