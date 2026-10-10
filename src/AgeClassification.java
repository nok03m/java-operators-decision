import java.util.Scanner;

public class AgeClassification {
    /*
     * Challenge 1
     * The system must categorize users by age to define their
     * profile permissions and associated data retention.
     */
    public static final int MAX_CHILD_AGE = 11;
    public static final int MAX_TEEN_AGE = 17;
    public static final int MAX_ADULT_AGE = 64;

    public static void main(String[] args) {
        int userAge = -1;
        boolean isValidInput = false;
        String msg = "";

        System.out.print("Enter your age: ");
        try(Scanner scanner = new Scanner(System.in);) {
            userAge = Integer.parseInt(scanner.nextLine().trim());
            isValidInput = true;
        } catch (NumberFormatException e) {
            msg = "The value you entered is invalid";
        }

        if (isValidInput) {
            if (userAge < 0) {
                // Negatives are invalid
                msg = "Negative values are not allowed.";
            } else if(userAge <= MAX_CHILD_AGE) {
                msg = "'Child' category (requires an account guardian)";
            } else if(userAge <= MAX_TEEN_AGE) {
                msg = "'Teen' category (access restricted to community forums)";
            } else if(userAge <= MAX_ADULT_AGE) {
                msg = "'Adult' category (access to standard features)";
            } else {
                // When a person is 65 or older
                msg = "'Seniors' category (access via an adapted interface)";
            }
        }

        System.out.println(msg);
    }
}