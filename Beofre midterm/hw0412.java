import java.util.Scanner;

public class hw0412 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int i, j;
        i = enter.nextInt();
        String output = " ";
        while (i > 0) {
            j = i % 2;
            i = i / 2;
            output = j + output;
        }
        System.out.println("二進位數值為" + output);
    }
}
