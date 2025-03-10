import java.util.Scanner;
public class GroupWork{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Using Math.max to find the larger number
        int maxNumber = Math.max(num1, num2);


        // Displaying the result
        System.out.println("The larger number is: " + maxNumber);

        // Displaying the result
        System.out.println("The larger number is: " + maxNumber);
        scanner.close();
    }
}

