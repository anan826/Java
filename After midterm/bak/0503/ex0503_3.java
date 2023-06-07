import java.util.*;

public class ex0503_3 {
    /**
     * 這個程式用於模擬骰子投擲並計算每個點數出現的次數。
     */
    public static void main() {
        System.out.print("請輸入骰子投擲次數 :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取骰子投擲次數
        int dice[] = new int[6]; // 用於統計每個點數出現的次數的陣列
        Random r = new Random();
        for (int i = 1; i <= n; i++) {
            int d = r.nextInt(6) + 1; // 隨機生成骰子的點數
            dice[d - 1]++; // 將對應點數的次數加1
        }
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + "點" + dice[i] + "次"); // 輸出每個點數出現的次數
        }
        sc.close();
    }
}
