import java.util.*;

public class u211410658_1 {
    public static void main(String[] args) {
        System.out.print("飲料清單:1.礦泉水 2.茶 3.汽水 4.果汁，請選擇:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("價格為15元");
        } else if (choice == 2) {
            System.out.print("特價，");
            System.out.println("價格為20元");
        } else if (choice == 3) {
            System.out.println("價格為20元");
        } else if (choice == 4) {
            System.out.println("價格為30元");
        } else {
            System.out.println("未輸入正確的號碼!");
        }
    }
}