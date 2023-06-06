import java.util.Random;
import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class u211410658_5 {
    public static void main(String[] args) {
        int tmp, i, k, a, b, tmp2;
        int X[] = new int[10];
        int Y[] = new int[10];
        Scanner sc = new Scanner(System.in);
        Random scan = new Random();
        System.out.print("請輸入數字範圍 =>");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("陣列內容為:");
        for (i = 0; i <= 9; i++) {
            k = scan.nextInt(b - a) + a;
            System.out.print(k);
            System.out.print(" ");
            X[i] = k;
        }
        Y = X;
        System.out.print(" ");
        tmp = X[0];
        tmp2 = Y[0];

        for (i = 0; i < 10; i++) {
            if (tmp < X[i]) {
                tmp = X[i];
            }

        }
        for (a = 0; a <= 9; a++) {
            if (tmp2 > Y[a]) {
                tmp2 = Y[a];
            }

        }
        System.out.println(" ");
        System.out.println("最大值：" + tmp);
        System.out.println("最小值：" + tmp2);
    }
}
