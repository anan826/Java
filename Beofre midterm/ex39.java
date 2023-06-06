import java.util.Scanner;

/*1*/
public class ex39 {
    public static void main(String[] args) {
        int X[] = new int[10];
        int i, j;
        for (i = 0; i <= 9; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入第" + (i + 1) + "個整數 ：");
            X[i] = sc.nextInt();
        }
        for (j = 1; j <= 10; j++) {
            System.out.println("第" + j + "個整數為 ：" + X[j - 1]);
        }
    }
}
