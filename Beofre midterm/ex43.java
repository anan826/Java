import java.util.*;

/*4 */
public class ex43 {
    public static void main(String[] args) {
        int tmp, max, i, k;

        Scanner enter = new Scanner(System.in);
        int X[] = new int[10];
        // int X[] = { 30, 20, 50, 10, 70, 40, 100, 80, 90, 60 };
        for (k = 0; k < 10; k++) {
            System.out.print("Enter " + (k + 1) + " integer ：");
            X[k] = enter.nextInt();
        }
        tmp = X[0];
        max = X[1];
        for (i = 2; i < 10; i++) {
            if (i % 2 == 0 && X[i] > tmp) {
                tmp = X[i];
            } else if (i % 2 == 1 && X[i] > max) {
                max = X[i];
            }
        }
        System.out.println("最大值：" + tmp);
        System.out.println("最大值：" + max);
    }
}
