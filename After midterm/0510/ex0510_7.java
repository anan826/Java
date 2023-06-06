import java.util.Scanner;

/*3 */
public class ex0510_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("第一個輸入值為: ");
        int x = sc.nextInt();
        System.out.print("第二個輸入值為: ");
        int y = sc.nextInt();
        getMin(x, y);
        sc.close();
    }

    public static void getMin(int a, int b) {
        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        System.out.print("最小值為: " + min);
    }
}
