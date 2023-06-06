import java.util.*;

/*1*/
public class ex0510_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一堆整數(逗號區隔): ");
        String str = sc.nextLine();
        String[] strSplit = str.split(",");
        int cnt = strSplit.length;
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            System.out.println("陣列第" + i + "項之內容值為：" + strSplit[i]);
            sum += Integer.parseInt(strSplit[i]);
        }
        System.out.printf("全部總和為: %d", sum);
        System.out.println("");
        sc.close();
    }
}
