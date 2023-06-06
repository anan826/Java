import java.util.Scanner;

public class ex1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("你輸入" + n + "是偶數");
        } else {
            System.out.println("你輸入" + n + "是奇數");
        }

    }
}
