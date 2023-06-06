import java.util.Scanner;

public class ex1_06b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score, x, xs = 0, sum = 0, tmp = 0;

        System.out.print("請輸入計算機概論及學分數 => ");
        score = sc.nextInt();
        x = sc.nextInt();
        sum += score * x;
        tmp += score;
        xs += x;

        System.out.print("請輸入程式設計及學分數 => ");
        score = sc.nextInt();
        x = sc.nextInt();
        sum += score * x;
        tmp += score;
        xs += x;

        System.out.print("請輸入微積分及學分數 => ");
        score = sc.nextInt();
        x = sc.nextInt();
        sum += score * x;
        tmp += score;
        xs += x;

        System.out.print("請輸入國文及學分數 => ");
        score = sc.nextInt();
        x = sc.nextInt();
        sum += score * x;
        tmp += score;
        xs += x;

        System.out.print("請輸入英文及學分數 => ");
        score = sc.nextInt();
        x = sc.nextInt();
        sum += score * x;
        tmp += score;
        xs += x;

        System.out.println("學分數 :" + xs);
        System.out.println("\n加權後之總分為 :" + sum + "分");
        System.out.println("加權後之總平均為 :" + (float) tmp / 5);
    }

}