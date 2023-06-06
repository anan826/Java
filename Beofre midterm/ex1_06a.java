import java.util.Scanner;

public class ex1_06a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score, sum = 0;

        System.out.print("請輸入計算機概論(3學分) => ");
        score = sc.nextInt();
        sum += score * 3;

        System.out.print("請輸入程式設計(3學分) => ");
        score = sc.nextInt();
        sum += score * 3;

        System.out.print("請輸入微積分(3學分) => ");
        score = sc.nextInt();
        sum += score * 3;

        System.out.print("請輸入國文(2學分) => ");
        score = sc.nextInt();
        sum += score * 2;

        System.out.print("請輸入英文(2學分) => ");
        score = sc.nextInt();
        sum += score * 2;

        System.out.println("\n加權後之總分為 :" + sum + "分");

    }

}
