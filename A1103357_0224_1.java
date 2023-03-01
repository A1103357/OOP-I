import java.util.Scanner;

public class A1103357_0224_1 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("The input is even number.");
        }else{
            System.out.println("The input is odd number.");
        }
    }
}
