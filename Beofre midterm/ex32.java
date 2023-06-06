import java.util.Scanner;

public class ex32 {
    // 0329 2 upload
    public static void main(String[] args) {
        int i, j, k;
        System.out.print("請輸入平行四邊形高度:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print("請輸入平行四邊形寬度:");
        int z = scan.nextInt();

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= z; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
