import java.util.*;

/*3*/
public class ex0517_6 {
    public static void main(String[] args) {
        System.out.print("輸入一整數: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = recursion(n);
        System.out.println("費氏數列第" + n + "項結果為: " + ans);
        sc.close();
    }

    public static long recursion(int n) {
        long[] x = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                x[i] = i;
            } else {
                x[i] = x[i - 1] + x[i - 2];
            }
        }
        return x[n];
    }
    // public static long recursion(int n) {
    // long n1 = 0, n2 = 1;
    // long sum = 0;
    // if (n <= 2) {
    // return 1;
    // } else {
    // for (int i = 1; i < n; i++) {
    // sum = n1 + n2;
    // n1 = n2;
    // n2 = sum;
    // System.out.printf("n1 = %d, n2 = %d, sum = %d\n", n1, n2, sum);
    // }
    // return sum;
    // }
    // }
}