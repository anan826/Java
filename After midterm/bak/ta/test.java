import java.util.*;

// 用空格分數字並比大小
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strSplit = str.split(" ");
        int[] arr = new int[strSplit.length];
        for (int i = 0; i < strSplit.length; i++) {
            arr[i] = Integer.parseInt(strSplit[i]);
        }
        sc.close();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
    }
}
