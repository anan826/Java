import java.util.Scanner;

/*交4 */
public class ex29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("請輸入三角形高度 :");
        int height = scan.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int k = 1; k <= height - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
