import java.io.*;

/* 這個程式用於從指定的檔案中讀取前 10 行數字資料，並計算它們的總和 */

public class ex0531_1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./test2.txt"); // 創建檔案物件，指定檔案路徑
        FileReader fr1 = new FileReader(f1); // 創建檔案讀取物件
        BufferedReader br1 = new BufferedReader(fr1); // 創建緩衝讀取器物件
        String data; // 用於儲存每一行資料的變數
        int sum = 0; // 用於計算總和的變數
        for (int i = 0; i < 10; i++) { // 迴圈處理前 10 行資料
            data = br1.readLine(); // 讀取一行資料
            int num = Integer.parseInt(data); // 將資料轉換為整數
            System.out.println(num); // 輸出該數字
            sum += num; // 加入總和計算
        }
        System.out.println("總和為：" + sum); // 輸出總和
        br1.close(); // 關閉緩衝讀取器
    }
}
