import java.util.Scanner;

public class ex0517_3 {
    public static void main(String[] args) {
        System.out.print("輸入一整數: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = recursion(n);
        System.out.println("階乘" + n + "為: " + ans);
        sc.close();
    }

    public static long recursion(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n *= recursion(n - 1);
        }
    }
}
