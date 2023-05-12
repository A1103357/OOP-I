import java.util.*;
import java.util.Arrays;

class MyException extends Exception{
    MyException(String a){
        super(a);
    }
}

public class A1103357_0505{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int jackpot[] = {3,14,26,33,34,45};
        System.out.println("請輸入您的六個樂透號碼：(1-49) ");
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isEqual = Arrays.equals(jackpot, arr);

        if(isEqual){
            System.out.println("恭喜您中獎！");
        }else{
            System.out.println("笑死沒中");
        }

        for(int j = 0; j < 6; j++){
            try{
                if(arr[j] < 1 || arr[j] > 49){
                    throw new MyException("輸入值超出範圍！");
                }
            }catch(MyException e){
                System.out.println(e);
            }
        }
    }
}