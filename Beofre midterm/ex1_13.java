import java.util.Scanner;

public class ex1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入兩個數字 : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x <= y) {
            System.out.println(y + "除以" + x + "等於" + (float) y / x);
        } else {
            System.out.println(x + "除以" + y + "等於" + (float) x / y);
        }

    }
}
