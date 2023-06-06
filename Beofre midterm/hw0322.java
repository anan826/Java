import java.util.Scanner;

public class hw0322 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("輸入文字 :");
        String x = scan.nextLine();
        StringBuffer y = new StringBuffer();
        y.append(x);
        y.reverse();
        System.out.println(y);
    }

}
