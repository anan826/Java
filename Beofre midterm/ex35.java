import java.util.*;

// 0329 5
public class ex35 {
    public static void main(String[] args) {
        int i;
        Random r = new Random();
        for (i = 1; i <= 10; i++) {
            int ans = r.nextInt(6) + 5;
            System.out.println("The " + i + " fortune number is ...  " + ans + " !!");
        }
    }
}
