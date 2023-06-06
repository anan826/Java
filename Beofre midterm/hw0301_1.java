import java.util.Scanner;

public class hw0301_1 {
    public static void main(String[] args) {
        System.out.println("輸入兩個數");
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        if (x > y) {
            System.out.println(x + "比較大");
        } else if (y > x) {
            System.out.println(y + "比較大");
        } else {
            System.out.println("兩個一樣大");
        }

    }

}
