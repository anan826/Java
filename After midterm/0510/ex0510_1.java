import java.util.*;

public class ex0510_1 {
    public static void main(String[] args) {
        System.out.print("本次發牌 : ");
        char[] c1 = new char[] { 'S', 'H', 'D', 'C' };
        char[] c2 = new char[] { 'A', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K' };
        Random rnd = new Random();
        int p = rnd.nextInt(4);
        int n = rnd.nextInt(13);
        // System.out.printf("%c %c", c1[rnd.nextInt(4)], c2[rnd.nextInt(13)]);
        System.out.println(c1[p] + " " + c2[n]);
    }
}