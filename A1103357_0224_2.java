import java.util.Scanner;

public class A1103357_0224_2 {
    public static void main(String[] args) {
        System.out.print("Please enter temperature(℃ ): ");
        Scanner sc = new Scanner(System.in);
        float C = sc.nextFloat();
        float F = (C*9/5) + 32;
        System.out.printf("%.2f ℃ = %.2f ℉%n", C, F);
    }
}