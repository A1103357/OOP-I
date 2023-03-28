import java.util.*;

class animal{
    String name;
    double height;
    int weight;
    double speed;

    void show(){
        System.out.println("姓名: "+name+" 身高: "+height+"m 體重: "+weight+"kg 速度: "+speed+" m/60s");
    }

    double distance(int m, double a){
        double d = m * a * speed;
        return d;
    }
    double distance(int m){
        double d = m * speed;
        return d;
    }
}

public class A1103357_0324_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        animal a, b, c, d;
        a = new animal();
        b = new animal();
        c = new animal();
        d = new animal();
        
        a.name="雪寶";
        a.height=1.1;
        a.weight=52;
        a.speed=100;

        b.name="驢子";
        b.height=1.5;
        b.weight=99;
        b.speed=200;

        c.name="安那";
        c.height=1.7;
        c.weight=48;
        c.speed=120;

        d.name="愛沙";
        d.height=1.7;
        d.weight=50;
        d.speed=120;

        a.show();
        b.show();
        c.show();
        d.show();

        System.out.println("請輸入雪寶的時間與加速度(若無加速度則輸入0): ");
        int aM = sc.nextInt();
        double aA = sc.nextDouble();
        System.out.println("請輸入驢子的時間與加速度(若無加速度則輸入0): ");
        int bM = sc.nextInt();
        double bA = sc.nextDouble();
        System.out.println("請輸入安那的時間與加速度(若無加速度則輸入0): ");
        int cM = sc.nextInt();
        double cA = sc.nextDouble();
        System.out.println("請輸入愛沙的時間與加速度(若無加速度則輸入0): ");
        int dM = sc.nextInt();
        double dA = sc.nextDouble();

        if(aA == 0){
            double aD = a.distance(aM);
            System.out.printf("雪寶奔跑的距離為%.1f%n", aD);
        }else{
            double aD = a.distance(aM, aA);
            System.out.printf("雪寶奔跑的距離為%.1f%n", aD);
        }

        if(bA == 0){
            double bD = b.distance(bM);
            System.out.printf("驢子奔跑的距離為%.1f%n", bD);
        }else{
            double bD = b.distance(bM, bA);
            System.out.printf("驢子奔跑的距離為%.1f%n", bD);
        }

        if(cA == 0){
            double cD = c.distance(cM);
            System.out.printf("安那奔跑的距離為%.1f%n", cD);
        }else{
            double cD = c.distance(cM, cA);
            System.out.printf("安那奔跑的距離為%.1f%n", cD);
        }

        if(dA == 0){
            double dD = d.distance(dM);
            System.out.printf("愛沙奔跑的距離為%.1f%n", dD);
        }else{
            double dD = d.distance(dM, dA);
            System.out.printf("愛沙奔跑的距離為%.1f%n", dD);
        }
        
    }
}