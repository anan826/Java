import java.util.*;

/**
 * 這個程式用於計算階乘的第 n 項。
 */
public class ex0517_5 {
    public static void main(String[] args) {
        System.out.print("輸入一整數: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取使用者輸入的整數
        long ans = recursion(n); // 呼叫遞迴方法計算階乘的第 n 項的結果
        System.out.println("階乘第" + n + "項結果為: " + ans); // 顯示結果
        sc.close(); // 關閉輸入流
    }

    /**
     * 遞迴方法用於計算階乘的第 n 項。
     * @param n 要計算的項數
     * @return 第 n 項的結果
     */
    public static long recursion(int n) {
        long[] x = new long[n + 1]; // 建立一個陣列來保存階乘的結果
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                x[i] = i; // 第一項和第二項為 0 和 1
            } else {
                x[i] = i * x[i - 1]; // 從第三項起，每一項都是前一項乘以當前數字
            }
        }
        return x[n]; // 返回第 n 項的結果
    }
}
