import java.util.Scanner;

public class ex1_04 {
    public static void main(String[] args) {
        System.out.println("請輸入兩個數 :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res;
        int num3 = num1 * num1;
        int num4 = num2 * num2;
        res = num1 * num1 + num2 * num2;
        System.out.println(num1 + "和" + num2 + "的平方和等於 " + res);
    }
}
