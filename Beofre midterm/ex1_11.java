import java.util.Scanner;

public class ex1_11 {
    public static void main(String[] args) {
        System.out.print("請輸入一西元年分: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("西元" + year + "為閏年");
        } else {
            System.out.println("西元" + year + "不為閏年");
        }
    }
}
