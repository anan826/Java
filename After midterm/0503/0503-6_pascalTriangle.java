import java.util.Scanner;

/**
 * 這個程式用於輸出巴斯卡三角形。
 */
public class ex0503_6 {
    /**
     * 主函式，用於輸出巴斯卡三角形。
     */
    public static void main(String[] args) {
        System.out.print("請輸入巴斯卡三角形的層數 : ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 使用者輸入巴斯卡三角形的層數
        int x[][] = new int[h][h]; // 用於存儲巴斯卡三角形的數字
        sc.close();

        // 填充巴斯卡三角形的數字
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    x[i][j] = 1; // 巴斯卡三角形的邊界數字都為 1
                } else {
                    x[i][j] = x[i - 1][j - 1] + x[i - 1][j]; // 其他位置的數字為上方兩個數字之和
                }
            }
        }

        // 輸出巴斯卡三角形
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", x[i][j]); // 格式化輸出數字，每個數字佔 3 個位置
            }
            System.out.println();
        }
        System.out.println();
    }
}
