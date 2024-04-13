
    import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Read the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Perform division and handle the exception
        try {
            int result = divide(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }

    // Method to perform division
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}

