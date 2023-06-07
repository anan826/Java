import java.util.*;

/**
 * 這個程式用於讀取一堆整數，並計算它們的總和。
 */
public class ex0510_3 {
    /**
     * 主函式，用於讀取一堆整數並計算總和。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一堆整數(逗號區隔): ");
        String str = sc.nextLine();
        String[] strSplit = str.split(",");
        int cnt = strSplit.length;
        int sum = 0;

        // 迴圈逐一處理輸入的整數
        for (int i = 0; i < cnt; i++) {
            System.out.println("陣列第" + i + "項之內容值為：" + strSplit[i]);
            sum += Integer.parseInt(strSplit[i]); // 將字串轉換為整數並加總
        }

        System.out.printf("全部總和為: %d", sum); // 輸出總和
        System.out.println("");
        sc.close();
    }
}
