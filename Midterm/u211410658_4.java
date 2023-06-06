import java.util.Scanner;

public class u211410658_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, p, tmp;
        System.out.println("請輸入數字範圍:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("請輸入數字倍數");
        p = sc.nextInt();
        if (b < a) {
            tmp = a;
            b = tmp;
            a = b;
        }
        int sum = 0;
        for (c = a; c < b + 1; c++) {
            if (c % p != 0) {
                if (sum == 0) {
                    System.out.print(c);
                } else {
                    System.out.print("+" + c);
                }
                sum += c;

            }

        }
        System.out.println("");
        System.out.println(a + "~" + b + "之間，非" + p + "的倍數相加總和為:" + sum);
    }
}
