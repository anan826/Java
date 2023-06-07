import java.util.Random;
import java.util.Scanner;

/**
 * 這個程式用於生成並輸出指定大小的二維陣列。
 */
public class ex0503_5 {
    /**
     * 主函式，用於生成並輸出二維陣列。
     */
    public static void main(String[] args) {
        System.out.print("請輸入二維陣列大小 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 使用者輸入陣列的行數
        int b = sc.nextInt(); // 使用者輸入陣列的列數
        Random r = new Random();
        int x[][] = new int[a][b]; // 用於存儲生成的陣列
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int rad = r.nextInt(10) + 1; // 生成 1 到 10 之間的隨機數
                x[i][j] = rad; // 將隨機數賦值給陣列元素
                System.out.printf("[%d][%d]=%3d\t", i, j, x[i][j]); // 格式化輸出陣列元素
            }
            System.out.println(""); // 換行輸出下一行陣列元素
        }
        sc.close();
    }
}
