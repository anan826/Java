import java.util.Random;

public class ex34 {
    // 0329 4
    public static void main(String[] args) {
        int i;
        Random r = new Random();
        for (i = 1; i <= 10; i++) {
            int ans = r.nextInt(10) + 1;
            System.out.println("The " + i + " fortune number is ...  " + ans + " !!");
        }
    }
}
