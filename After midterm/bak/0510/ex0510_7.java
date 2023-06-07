import java.util.Scanner;

/**
 * 這個程式用於比較兩個整數並輸出最小值。
 */
public class ex0510_7 {
    /**
     * 主函式，從使用者獲取兩個整數並呼叫 getMin 方法。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("第一個輸入值為: ");
        int x = sc.nextInt(); // 讀取第一個整數
        System.out.print("第二個輸入值為: ");
        int y = sc.nextInt(); // 讀取第二個整數
        getMin(x, y); // 呼叫方法找出最小值並輸出
        sc.close(); // 關閉輸入流
    }

    /**
     * 方法用於比較兩個整數，找出其中的最小值並輸出。
     * 
     * @param a 第一個整數
     * @param b 第二個整數
     */
    public static void getMin(int a, int b) {
        int min;
        if (a > b) { // 如果 a 大於 b
            min = b; // 將 b 設為最小值
        } else { // 否則 a 最小
            min = a; // 將 a 設為最小值
        }
        System.out.print("最小值為: " + min); // 輸出最小值
    }
}
