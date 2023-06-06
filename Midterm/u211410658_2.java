import java.util.*;

public class u211410658_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 75;
        float waitTime;
        System.out.print("請輸入行車里程數(km) :");
        int km = sc.nextInt();
        float distance = (km - 1) * 2 * 5;
        System.out.print("請輸入停等時間(min) :");
        float time = sc.nextFloat();
        waitTime = time / (float) (2.5);
        float count = first + distance + (int) waitTime * 5;
        System.out.println("應付之車資為(元) " + (int) count);

    }
}
