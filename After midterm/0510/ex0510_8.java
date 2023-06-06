import java.util.*;

/**
 * 這個程式用於找出三個整數中的最小值並輸出。
 */
public class ex0510_8 {
    /**
     * 主函式，從使用者獲取三個整數並呼叫 getMin 方法。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入三個值: ");
        int x = sc.nextInt(); // 讀取第一個整數
        int y = sc.nextInt(); // 讀取第二個整數
        int z = sc.nextInt(); // 讀取第三個整數
        getMin(x, y, z); // 呼叫方法找出最小值並輸出
        sc.close(); // 關閉輸入流
    }

    /**
     * 方法用於比較三個整數，找出其中的最小值並輸出。
     * 
     * @param a 第一個整數
     * @param b 第二個整數
     * @param c 第三個整數
     */
    public static void getMin(int a, int b, int c) {
        int min;
        if (a < b && a < c) { // 如果 a 比 b 和 c 都小
            min = a; // 將 a 設為最小值
        } else if (b < a && b < c) { // 如果 b 比 a 和 c 都小
            min = b; // 將 b 設為最小值
        } else { // 否則 c 最小
            min = c; // 將 c 設為最小值
        }
        System.out.print("最小值為: " + min); // 輸出最小值
    }
}
