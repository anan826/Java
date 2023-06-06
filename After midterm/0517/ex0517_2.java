import java.util.*;

public class ex0517_2 {
    public static int x, y, z;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入三個值: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        int min = getMin();
        System.out.println("最小值為: " + min);
        sc.close();
    }

    public static int getMin() {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else {
            return z;
        }
    }
}
