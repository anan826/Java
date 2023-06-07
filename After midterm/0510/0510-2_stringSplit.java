import java.util.Scanner;

/**
 * 這個程式用於讀取一堆整數並輸出它們的內容值。
 */
public class ex0510_2 {
    /**
     * 主函式，用於讀取一堆整數並輸出它們的內容值。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一堆整數(逗號區隔): ");
        String str = sc.nextLine();
        String[] strSplit = str.split(",");
        int cnt = strSplit.length;

        // 迴圈逐一輸出陣列的內容值
        for (int i = 0; i < cnt; i++) {
            System.out.println("陣列第" + i + "項之內容值為：" + strSplit[i]);
        }

        System.out.println("");
        sc.close();
    }
}
