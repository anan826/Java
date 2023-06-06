import java.util.*;

public class ex0503_2 {
    /**
     * 這個程式用於模擬骰子投擲並計算每個點數出現的次數。
     */
    public static void main(String[] args) {
        System.out.print("請輸入骰子投擲次數 :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取骰子投擲次數
        int dice[] = new int[6]; // 用於統計每個點數出現的次數的陣列
        Random r = new Random();
        sc.close(); // 關閉掃描器
        for (int i = 1; i <= n; i++) {
            int d = r.nextInt(6) + 1; // 隨機生成骰子的點數
            if (d == 1) {
                dice[0]++; // 若骰子點數為1，則將dice[0]加1
            } else if (d == 2) {
                dice[1]++; // 若骰子點數為2，則將dice[1]加1
            } else if (d == 3) {
                dice[2]++; // 若骰子點數為3，則將dice[2]加1
            } else if (d == 4) {
                dice[3]++; // 若骰子點數為4，則將dice[3]加1
            } else if (d == 5) {
                dice[4]++; // 若骰子點數為5，則將dice[4]加1
            } else {
                dice[5]++; // 若骰子點數為6，則將dice[5]加1
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + "點出現" + dice[i] + "次"); // 輸出每個點數出現的次數
        }
    }
}
