package code.oops.assignment.ass_3;

public class p4 {
    public static void main(String[] args) {

        String[] numbers = {"10", "0", "invalid"};

        for (String number : numbers) {
            try {
                // Attempt to parse the string to an integer
                int parsedNumber = Integer.parseInt(number);

                // Attempt to perform division
                int result = 100 / parsedNumber;
                System.out.println("Result: " + result);

                // Multi-catch block to handle NumberFormatException and ArithmeticException
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
