import java.util.*;

public class u211410658_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("請輸入三角形高度 :");
        int height = scan.nextInt();
        int i;
        for (i = 1; i <= height; i++) {
            for (int k = 1; k <= 14 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i % 2 == 0 && i != 2 * i - 1 && j != 2 * i - 1 && j != 1 && i != height) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
    }
}
