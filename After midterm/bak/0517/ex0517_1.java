import java.util.*;

/**
 * 這個程式用於找出三個整數中的最小值。
 */
public class ex0517_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入三個值: ");
        int x = sc.nextInt(); // 讀取第一個整數
        int y = sc.nextInt(); // 讀取第二個整數
        int z = sc.nextInt(); // 讀取第三個整數
        int min = getMin(x, y, z); // 呼叫方法取得最小值
        System.out.println("最小值為: " + min); // 顯示最小值
        sc.close(); // 關閉輸入流
    }

    /**
     * 方法用於比較三個整數，找出其中的最小值。
     * 
     * @param a 第一個整數
     * @param b 第二個整數
     * @param c 第三個整數
     * @return 三個整數中的最小值
     */
    public static int getMin(int a, int b, int c) {
        if (a < b && a < c) { // 如果 a 比 b 和 c 都小
            return a; // 返回 a
        } else if (b < a && b < c) { // 如果 b 比 a 和 c 都小
            return b; // 返回 b
        } else { // 否則 c 最小
            return c; // 返回 c
        }
    }
}
