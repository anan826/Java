import java.util.Scanner;

public class ex1_05 {
    public static void main(String[] args) {
        int x, sum, num1, num2;
        System.out.println("兩人相距距離");
        Scanner distance = new Scanner(System.in);
        x = distance.nextInt();
        System.out.println("A君每秒向東走(公尺) :");
        num1 = distance.nextInt();
        System.out.println("B君每秒向西走(公尺) :");
        num2 = distance.nextInt();
        /* System.out.println(num1 + num2 + x); */
        System.out.println((float) x / (num1 + num2));
    }
}
