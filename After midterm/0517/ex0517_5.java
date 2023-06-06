import java.util.*;

public class ex0517_5 {
    public static void main(String[] args) {
        System.out.print("輸入一整數: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = recursion(n);
        System.out.println("階乘第" + n + "項結果為: " + ans);
        sc.close();
    }

    public static long recursion(int n) {
        long[] x = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                x[i] = i;
            } else {
                x[i] = i * x[i - 1];
            }
        }
        return x[n];
    }

}
