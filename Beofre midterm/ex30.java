import java.util.Scanner;

/*加 */
public class ex30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("請輸入三角形高度 :");
        int height = scan.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int k = 1; k <= 14 - i; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
