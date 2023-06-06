import java.util.*;

// 0329 6 upload
public class ex36 {
    public static void main(String[] args) {
        int i, x, first, next;
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("輸入個數:");
        x = scan.nextInt();
        System.out.print("輸入範圍:");
        first = scan.nextInt();
        next = scan.nextInt();
        for (i = 1; i <= x; i++) {
            int ans = r.nextInt(next - first + 1) + first;
            System.out.println("The " + i + " fortune number is ...  " + ans + " !!");
        }
    }
}
