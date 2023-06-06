import java.util.Scanner;

/* */
public class ex1_15 {
    public static void main(String[] args) {
        System.out.print("請輸入學生成績 : ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("等第為A");
        } else if (score < 90 && score > 79) {
            System.out.println("等第為B");
        } else if (score < 80 && score > 69) {
            System.out.println("等第為C");
        } else if (score < 70 && score > 59) {
            System.out.println("等第為D");
        } else if (score < 60 && score >= 0) {
            System.out.println("等第為E");
        } else {
            System.out.println("輸入錯誤");
        }
    }
}
