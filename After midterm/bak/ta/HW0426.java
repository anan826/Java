import java.util.Scanner;

public class HW0426 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        StringBuffer array = new StringBuffer();
        sc.close();
        for (int i = 0; i < x.length(); i++) {
            char y = x.charAt(i);
            if (Character.isLowerCase(y)) {
                array.append((Character.toUpperCase(y)));
            } else if (Character.isUpperCase(y)) {
                array.append((Character.toLowerCase(y)));
            }
        }
        System.out.println(array);
    }
}