import java.util.*;

/*1*/
public class ex0503_2 {
    public static void main(String[] args) {
        System.out.print("請輸入骰子投擲次數 :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dice[] = new int[6];
        Random r = new Random();
        sc.close();
        for (int i = 1; i <= n; i++) {
            int d = r.nextInt(6) + 1;
            if (d == 1) {
                dice[0]++;
            } else if (d == 2) {
                dice[1]++;
            } else if (d == 3) {
                dice[2]++;
            } else if (d == 4) {
                dice[3]++;
            } else if (d == 5) {
                dice[4]++;
            } else {
                dice[5]++;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + "點出現" + dice[i] + "次");
        }
    }
}
