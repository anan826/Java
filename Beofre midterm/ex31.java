import java.util.Scanner;

//0329 1
public class ex31 {
    public static void main(String[] args) {
        int i, j;
        System.out.print("請輸入平行四邊形高度:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            System.out.println("*****");
        }
        System.out.println();
    }
}
