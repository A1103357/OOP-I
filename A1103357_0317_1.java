import java.util.*;

public class A1103357_0317_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入n值: ");
        int n = sc.nextInt();
        System.out.print("請輸入m值: ");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i = 0 ; i <= n-1 ; i++){
            for(int j = 0 ; j <= m-1 ; j++){
                arr[i][j] = (i+1)*(j+1);
            }
        }
        for(int [] a : arr){
            for(int b : a){
                System.out.print(b);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}