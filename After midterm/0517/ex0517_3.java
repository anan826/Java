import java.util.Scanner;

/**
 * 這個程式用於計算一個整數的階乘。
 */
public class ex0517_3 {
    public static void main(String[] args) {
        System.out.print("輸入一整數: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取使用者輸入的整數
        long ans = recursion(n); // 呼叫遞迴方法計算階乘的結果
        System.out.println("階乘" + n + "為: " + ans); // 顯示結果
        sc.close(); // 關閉輸入流
    }

    /**
     * 遞迴方法用於計算一個整數的階乘。
     * @param n 要計算階乘的整數
     * @return 階乘的結果
     */
    public static long recursion(int n) {
        if (n <= 1) {
            return 1; // 0的階乘和1的階乘都為1
        } else {
            return n *= recursion(n - 1); // 遞迴計算 n 的階乘
        }
    }
}
