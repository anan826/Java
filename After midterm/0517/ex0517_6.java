import java.util.*;

/**
 * 這個程式用於計算費氏數列的第 n 項。
 */
/* 3 */
public class ex0517_6 {
    public static void main(String[] args) {
        System.out.print("輸入一整數: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取使用者輸入的整數
        long ans = recursion(n); // 呼叫遞迴方法計算費氏數列第 n 項的結果
        System.out.println("費氏數列第" + n + "項結果為: " + ans); // 顯示結果
        sc.close(); // 關閉輸入流
    }

    /**
     * 遞迴方法用於計算費氏數列的第 n 項。
     * 
     * @param n 要計算的項數
     * @return 第 n 項的結果
     */
    public static long recursion(int n) {
        long[] x = new long[n + 1]; // 建立一個陣列來保存費氏數列的結果
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                x[i] = i; // 前兩項為 0 和 1
            } else {
                x[i] = x[i - 1] + x[i - 2]; // 從第三項起，每一項都是前兩項的和
            }
        }
        return x[n]; // 返回第 n 項的結果
    }
    // public static long recursion(int n) {
    // long n1 = 0, n2 = 1;
    // long sum = 0;
    // if (n <= 2) {
    // return 1;
    // } else {
    // for (int i = 1; i < n; i++) {
    // sum = n1 + n2;
    // n1 = n2;
    // n2 = sum;
    // System.out.printf("n1 = %d, n2 = %d, sum = %d\n", n1, n2, sum);
    // }
    // return sum;
    // }
    // }
}
