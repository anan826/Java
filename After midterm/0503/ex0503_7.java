import java.util.Random;

public class ex0503_7 {
    /* 5 */
    public static void main(String[] args) {
        System.out.print("本次發牌 : ");
        char[] c1 = new char[] { 'S', 'H', 'D', 'C' };
        char[] c2 = new char[] { 'A', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K' };
        Random rnd = new Random();
        System.out.printf("%c %c", c1[rnd.nextInt(4)], c2[rnd.nextInt(13)]);
    }
}
