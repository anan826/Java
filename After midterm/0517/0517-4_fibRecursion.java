import java.util.*;

/**
 * 這個程式用於計算費氏數列的第 n 項。
 */
public class ex0517_4 {
    public static void main(String[] args) {
        System.out.print("輸入一整數: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取使用者輸入的整數
        long ans = recursion(n); // 呼叫遞迴方法計算費氏數列的第 n 項的結果
        System.out.println("費氏數列第" + n + "項結果為: " + ans); // 顯示結果
        sc.close(); // 關閉輸入流
    }

    /**
     * 遞迴方法用於計算費氏數列的第 n 項。
     * @param n 要計算的項數
     * @return 第 n 項的結果
     */
    public static long recursion(int n) {
        if (n <= 2) {
            return 1; // 第一項和第二項都為 1
        } else {
            return (recursion(n - 1) + recursion(n - 2)); // 第 n 項為前兩項的和
        }
    }
}
