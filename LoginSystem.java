
    import java.util.Scanner;

public class LoginSystem {
    private static final String EXPECTED_PASSWORD = "password123"; // Example expected password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        try {
            authenticateUser(enteredPassword);
            System.out.println("Login successful!");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: Incorrect password.");
        }

        scanner.close();
    }

    public static void authenticateUser(String enteredPassword) throws InvalidPasswordException {
        if (!enteredPassword.equals(EXPECTED_PASSWORD)) {
            throw new InvalidPasswordException();
        }
    }
}

class InvalidPasswordException extends Exception {
    // Exception for invalid password
}

