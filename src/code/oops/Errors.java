package code.oops;

public class Errors {
    public static void main(String[] args) {
        String[] array = {"0", "bcc", "15"};

        for (int i = 0; i < array.length; i++) {
            try {
                int num = Integer.parseInt(array[i]);

                if (num % 2 != 0) {
                    System.out.println(num + " is an odd number.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Caught NumberFormatException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }
}
