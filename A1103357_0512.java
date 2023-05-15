import java.util.Scanner;
import java.util.Random;

class DumplingSimulator {
    private int porkDumplings;
    private int beefDumplings;
    private int vegetableDumplings;

    public DumplingSimulator(int porkDumplings, int beefDumplings, int vegetableDumplings) {
        this.porkDumplings = porkDumplings;
        this.beefDumplings = beefDumplings;
        this.vegetableDumplings = vegetableDumplings;
    }

    public synchronized void serveCustomer(int customerCount) {
        for (int i = 0; i < customerCount; i++) {
            int dumplingCount = getRandomDumplingCount();
            String dumplingType = getRandomDumplingType();
            
            if (dumplingType.equals("pork")) {
                if (porkDumplings >= dumplingCount) {
                    porkDumplings -= dumplingCount;
                    System.out.println("顧客" + (i + 1) + " 購買了 " + dumplingCount +" 顆豬肉水餃");
                } else {
                    System.out.println("顧客" + (i + 1) + " 您好，豬肉水餃已售完，請選擇其他口味！");
                }
            } else if (dumplingType.equals("beef")) {
                if (beefDumplings >= dumplingCount) {
                    beefDumplings -= dumplingCount;
                    System.out.println("顧客" + (i + 1) + " 購買了 " + dumplingCount +" 顆牛肉水餃");
                } else {
                    System.out.println("顧客" + (i + 1) + " 您好，牛肉水餃已售完，請選擇其他口味！");
                }
            } else if (dumplingType.equals("vegetable")) {
                if (vegetableDumplings >= dumplingCount) {
                    vegetableDumplings -= dumplingCount;
                    System.out.println("顧客" + (i + 1) + " 購買了 " + dumplingCount +" 顆蔬菜水餃");
                } else {
                    System.out.println("顧客" + (i + 1) + " 您好，蔬菜水餃已售完，請選擇其他口味！");
                }
            }
            
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private int getRandomDumplingCount() {
        Random random = new Random();
        return random.nextInt(41) + 10; 
    }

    private String getRandomDumplingType() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                return "pork";
            case 1:
                return "beef";
            case 2:
                return "vegetable";
            default:
                return "";
        }
    }
}

public class A1103357_0512 {
    public static void main(String[] args) {
       
        DumplingSimulator simulator = new DumplingSimulator(5000, 3000, 1000);
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入同時光顧的顧客數目：");
        int customerCount = sc.nextInt();

        simulator.serveCustomer(customerCount);

    }
}
