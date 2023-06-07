import java.io.IOException;
import java.io.*;

/* 這個程式用於讀取指定檔案中的數字資料，找出最大值和最小值 */

public class ex0531_2 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) { // 檢查參數是否正確
            System.out.println("請指定正確的檔案名稱參數。");
            System.exit(0); // 結束程式
        }
        File f1 = new File(args[0]); // 創建檔案物件
        if (f1.exists()) { // 檢查檔案是否存在
            FileReader fr1 = new FileReader(f1); // 創建檔案讀取物件
            BufferedReader br1 = new BufferedReader(fr1); // 創建緩衝讀取器物件
            String data = br1.readLine(); // 讀取一行資料
            System.out.println(data); // 輸出第一行資料
            int max = Integer.parseInt(data); // 將第一行資料轉換為整數，設為最大值
            int min = max; // 設最小值為最大值
            while ((data = br1.readLine()) != null) { // 迴圈處理每一行資料
                System.out.println(data); // 輸出每一行資料
                int num = Integer.parseInt(data); // 將資料轉換為整數
                if (max < num) { // 比較找出最大值
                    max = num;
                }
                if (min > num) { // 比較找出最小值
                    min = num;
                }
            }
            System.out.println("最大值是：" + max); // 輸出最大值
            System.out.println("最小值是：" + min); // 輸出最小值
            br1.close(); // 關閉緩衝讀取器
        }
    }
}
