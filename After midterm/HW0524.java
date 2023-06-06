import java.util.*;

public class HW0524 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入n個數字：");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("請輸入 " + n + " 個不同的數字：");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        int sum = 1;
        Arrays.sort(numbers);
        int min = numbers[0];
        for (int i = 0; i < n; i++) {
            sum *= numbers[i];
        }
        System.out.println("總共 :" + sum + "個");
        System.out.println("分別是 :");
        for (int i = min; i <= sum; i++) {
            System.out.print(i + " ");
        }

    }
}