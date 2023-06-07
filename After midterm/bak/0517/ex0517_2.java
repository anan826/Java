import java.util.*;

/**
 * 這個程式用於找出三個整數中的最小值。
 */
public class ex0517_2 {
    public static int x, y, z;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入三個值: ");
        x = sc.nextInt(); // 讀取第一個整數
        y = sc.nextInt(); // 讀取第二個整數
        z = sc.nextInt(); // 讀取第三個整數
        int min = getMin(); // 呼叫方法取得最小值
        System.out.println("最小值為: " + min); // 顯示最小值
        sc.close(); // 關閉輸入流
    }

    /**
     * 方法用於比較三個整數，找出其中的最小值。
     * @return 三個整數中的最小值
     */
    public static int getMin() {
        if (x < y && x < z) { // 如果 x 比 y 和 z 都小
            return x; // 返回 x
        } else if (y < x && y < z) { // 如果 y 比 x 和 z 都小
            return y; // 返回 y
        } else { // 否則 z 最小
            return z; // 返回 z
        }
    }
}
