import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the first parameter:");
        int parameterOne = inputScanner.nextInt();
        System.out.println("Enter the second parameter:");
        int parameterTwo = inputScanner.nextInt();

        try {
            // Calling the method containing the counting logic
            countNumbers(parameterOne, parameterTwo);

        } catch (InvalidParametersException exception) {
            System.out.println(exception.getMessage());
        } finally {
            // Close the Scanner to prevent resource leakage
            inputScanner.close();
        }
    }

    static void countNumbers(int parameterOne, int parameterTwo) throws InvalidParametersException {
        // Validate if parameterOne is GREATER than parameterTwo and throw the exception
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("The second parameter must be greater than the first.");
        }

        int count = parameterTwo - parameterOne;
        // Perform the loop to print numbers based on the 'count' variable
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}
