import java.util.Scanner;

/*2*/
public class ex0510_6 {
    public static void main(String[] args) {
        System.out.println(("以下使用函式呼叫 :"));
        Scanner sc = new Scanner(System.in);
        System.out.println(("輸出行數 :"));
        int n = sc.nextInt();
        System.out.println(("輸出內容 :"));
        String msg = sc.next();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " :");
            printHello(msg);
        }
        sc.close();
    }

    public static void printHello(String name) {
        System.out.println("Hello " + name + " !!! ");
    }
}
