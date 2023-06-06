import java.util.*;

public class ex0503_1 {
    public static void main(String[] args) {
        System.out.print("請輸入骰子投擲次數 :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        for (int i = 1; i <= n; i++) {
            int d = r.nextInt(6) + 1;
            System.out.println("第" + i + "次投擲為" + d);
        }
        sc.close();
    }
}