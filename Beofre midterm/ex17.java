import java.util.Scanner;

/*1*/
public class ex17 {
    public static void main(String[] args) {
        System.out.print("請輸入學生成績 : ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("error");
        } else {
            switch (score / 10) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("Failed");
                    break;

            }
        }
    }
}
