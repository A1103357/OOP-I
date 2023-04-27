import java.util.Scanner;

public class A1103357_0421_2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a date (YYYY/MM/DD or MM/DD/YYYY):");
        String input = scanner.nextLine();

        int year = 0;
        int month = 0;
        int day = 0;

        String[] tokens = input.split("/");
        if (tokens.length == 3) {
            try {
                year = Integer.parseInt(tokens[0]);
                month = Integer.parseInt(tokens[1]);
                day = Integer.parseInt(tokens[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format.");
                return;
            }
        } else if (tokens.length == 2) {
            try {
                year = Integer.parseInt(tokens[2]);
                month = Integer.parseInt(tokens[0]);
                day = Integer.parseInt(tokens[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format.");
                return;
            }
        } else {
            System.out.println("Invalid input format.");
            return;
        }

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
