import java.util.*;

/*2*/
public class ex40 {
    public static void main(String[] args) {
        int X[] = new int[10];
        // int Y[] = new int[10];
        int i, j, k;
        for (i = 0; i <= 9; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入第" + (i + 1) + "個整數 ：");
            X[i] = sc.nextInt();
        }
        // 第一種
        // for (k = 0; k < 10; k++) {
        // Y[k] = X[k];
        // }

        // 第二種
        // int [] Y;
        // Y = X;
        // Y如不龐大的話
        int[] Y = new int[10];
        System.arraycopy(X, 0, Y, 0, X.length);
        for (j = 0; j < 10; j++) {
            System.out.println("陣列Y中第 " + j + "項，Y[" + (j + 1) + "]為：" + Y[j]);
        }
    }
}