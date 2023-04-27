import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1103357_0421_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your email address:");
        String email = scanner.nextLine();

        if (validateEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }

    private static boolean validateEmail(String email) {
        String emailRegex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
