import java.util.Random;
import java.util.Scanner;

/*3*/
public class ex0503_5 {
    public static void main(String[] args) {
        System.out.print("請輸入二為陣列大小 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Random r = new Random();
        int x[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int rad = r.nextInt(10) + 1;
                x[i][j] = rad;
                System.out.printf("[%d][%d]=%3d\t", i, j, x[i][j]);
            }
            System.out.println("");
        }
        sc.close();

    }
}
