import java.util.Scanner;

/*巴斯卡三角形 */
/*4*/
public class ex0503_6 {
    public static void main(String[] args) {
        System.out.print("請輸入巴斯卡三角形的層數 : ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int x[][] = new int[h][h];
        sc.close();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    x[i][j] = 1;
                } else {
                    x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", x[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
