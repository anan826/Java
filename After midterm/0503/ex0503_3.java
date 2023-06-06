import java.util.*;

/*2*/
public class ex0503_3 {
    public static void main() {
        System.out.print("請輸入骰子投擲次數 :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dice[] = new int[6];
        Random r = new Random();
        for (int i = 1; i <= n; i++) {
            int d = r.nextInt(6) + 1;
            dice[d - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + "點" + dice[i] + "次");
        }
        sc.close();
    }
}
