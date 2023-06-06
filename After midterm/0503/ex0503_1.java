import java.util.*;

public class ex0503_1 {
    /**
     * 這個程式用於模擬骰子的投擲結果。
     */
    public static void main(String[] args) {
        System.out.print("請輸入骰子投擲次數 :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取骰子投擲次數
        Random r = new Random();
        for (int i = 1; i <= n; i++) {
            int d = r.nextInt(6) + 1; // 隨機生成1到6之間的整數作為骰子的點數
            System.out.println("第" + i + "次投擲為" + d); // 輸出每次投擲的結果
        }
        sc.close(); // 關閉掃描器
    }
}
