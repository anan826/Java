import java.util.Scanner;

/* */
public class ex1_16 {
    public static void main(String[] args) {
        System.out.print("請輸入學生成績 : ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("輸入錯誤");
        } else if (score >= 90) {
            System.out.println("等第為A");
        } else if (score >= 80) {
            System.out.println("等第為B");
        } else if (score >= 70) {
            System.out.println("等第為C");
        } else if (score >= 60) {
            System.out.println("等第為D");
        } else if (score >= 0) {
            System.out.println("等第為E");
        }
    }
}
