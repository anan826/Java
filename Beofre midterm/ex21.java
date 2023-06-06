import java.util.Scanner;

/*3*/
public class ex21 {
    /* 每小時20，24小時內150 */
    public static void main(String[] args) {
        System.out.print("輸入停車時數(整數): ");
        Scanner scan = new Scanner(System.in);
        int parkTime = scan.nextInt();
        int bill, hour;
        bill = (parkTime / 24) * 150;
        hour = parkTime %= 24;
        if (parkTime < 0) {
            System.out.println("error");
        } else if (parkTime * 20 < 150) {
            bill += hour * 20;
            System.out.println("停車費: " + bill + "元");
        } else {
            bill += 150;
            System.out.println("停車費: " + bill + "元");
        }
    }
}
