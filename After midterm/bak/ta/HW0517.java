import java.util.Scanner;

public class HW0517 {
    public static void main(String[] args) {
        System.out.print("輸入一整數: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        int[] arr = new int[strSplit.length];
        sc.close();
        for (int i = 0; i < strSplit.length; i++) {
            arr[i] = Integer.parseInt(strSplit[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int count = countOne(arr[i]);
            System.out.println(count);
        }

    }

    public static int countOne(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
