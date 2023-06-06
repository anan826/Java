import java.util.*;

public class ex0510_8 {
    /*  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入三個值: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        getMin(x, y, z);
        sc.close();
    }

    public static void getMin(int a, int b, int c) {
        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        System.out.print("最小值為: " + min);
    }
}
