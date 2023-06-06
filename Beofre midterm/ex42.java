import java.util.*;

public class ex42 {
    /* 3 */
    public static void main(String[] args) {
        int tmp, i, k;

        Scanner enter = new Scanner(System.in);
        int X[] = new int[10];
        // int X[] = { 30, 20, 50, 10, 70, 40, 100, 80, 90, 60 };
        for (k = 0; k < 10; k++) {
            System.out.print("Enter " + (k + 1) + " integer ：");
            X[k] = enter.nextInt();
        }
        tmp = X[0];
        for (i = 1; i <= X.length; i++) {
            if (tmp < X[i]) {
                tmp = X[i];
            }
        }
        System.out.println("最大值：" + tmp);
    }
}
