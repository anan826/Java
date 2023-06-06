import java.util.Scanner;

/* */
public class ex1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入姓名 : ");
        String name = sc.next();

        System.out.print("請輸入性別(1.男、2.女) : ");
        int sex = sc.nextInt();

        if (sex == 1) {
            System.out.println("\n歡迎" + name + "先生" + "登入本系統!");
        } else {
            System.out.println("\n歡迎" + name + "女士" + "登入本系統!");
        }
    }
}
