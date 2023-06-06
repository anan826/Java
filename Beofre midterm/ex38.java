import java.util.*;

public class ex38 {
    // 0329 8
    public static void main(String[] args) {
        int i, a, x;
        Random scan = new Random();
        a = scan.nextInt(41) + 10;
        for (i = 1; i <= 6; i++) {
            if (i > 5) {
                System.out.print("You Lose !");
                System.out.println("答案是 :" + a);
                break;
            }
            System.out.print("第 " + i + " 回合" + "您猜的數字為 :");
            Scanner enter = new Scanner(System.in);
            x = enter.nextInt();
            if (a == x) {
                System.out.println("boom!猜對了");
                break;
            } else if (x > a) {
                System.out.println("太高了");
            } else if (x < a) {
                System.out.println("太小了");
            }
        }
    }
}
