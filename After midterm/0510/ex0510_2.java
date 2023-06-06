import java.util.Scanner;

public class ex0510_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一堆整數(逗號區隔): ");
        String str = sc.nextLine();
        String[] strSplit = str.split(",");
        int cnt = strSplit.length;
        for (int i = 0; i < cnt; i++) {
            System.out.println("陣列第" + i + "項之內容值為：" + strSplit[i]);
        }
        System.out.println("");
        sc.close();
    }
}
