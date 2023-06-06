import java.util.Scanner;

public class hw0329 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        StringBuilder y = new StringBuilder(str);
        y.reverse();
        System.out.println(y);
        String z = new String(y);
        if (str.equals(z)) {
            System.out.println(str + "是回文");
        } else {
            System.out.println(str + "不是回文");
        }
    }
}
