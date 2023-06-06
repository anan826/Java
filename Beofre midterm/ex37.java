import java.util.Random;
import java.util.Scanner;

public class ex37 {
    // 0329 7 upload
    public static void main(String[] args) {
        int i, a, x;
        Random scan = new Random();
        a = scan.nextInt(10) + 1;
        for (i = 1; i <= 11; i++) {
            if (i > 10) {
                System.out.print("You Lose !");
                break;
            }
            System.out.print("第 " + i + " 回合" + "您猜的數字為 :");
            Scanner enter = new Scanner(System.in);
            x = enter.nextInt();
            if (a == x) {
                System.out.println("boom!猜對了");
                break;
            }

        }
    }
}
