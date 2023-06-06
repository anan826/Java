import java.util.*;

/*2 */
public class ex0517_4 {
    public static void main(String[] args) {
        System.out.print("輸入一整數: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = recursion(n);
        System.out.println("費氏數列第" + n + "項結果為: " + ans);
        sc.close();
    }

    public static long recursion(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return (recursion(n - 1) + recursion(n - 2));
        }
    }
}
