import java.util.*;

/*1 */
public class ex0517_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入三個值: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int min = getMin(x, y, z);
        System.out.println("最小值為: " + min);
        sc.close();
    }

    public static int getMin(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
