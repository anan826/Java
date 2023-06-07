import java.io.*;

/* 這個程式用於讀取指定檔案中的數字資料，並計算每一行數字的總和 */
/*2*/
public class ex0531_3 {
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
            while (data != null) { // 迴圈處理每一行資料
                System.out.println("原資料為：" + data); // 輸出原始資料
                String[] strSplit = data.split(" "); // 使用空格拆分字串
                int cnt = strSplit.length; // 取得拆分後的元素個數
                int sum = 0; // 初始化總和
                for (int i = 0; i < cnt; i++) { // 迴圈計算總和
                    int num = Integer.parseInt(strSplit[i]); // 將字串轉換為整數
                    sum += num; // 累加總和
                }
                System.out.println("此行數字總和為：" + sum); // 輸出數字總和
                System.out.println("");
                data = br1.readLine(); // 讀取下一行資料
            }
            br1.close(); // 關閉緩衝讀取器
        }
    }
}
