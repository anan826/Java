import java.io.*;

/* 這個程式用於從一個檔案中讀取內容並將其複製到另一個檔案中 */

public class ex0524_7 {
    /* 主程式進入點 */
    public static void main(String[] args) throws IOException {
        if (args.length != 2) { // 檢查指定的命令行參數數量是否正確
            System.out.println("請指定正確的檔案名稱參數");
            System.exit(0); // 結束程式執行
        }

        File f1 = new File(args[0]); // 創建源檔案物件，使用指定的檔案路徑

        if (f1.exists()) { // 檢查源檔案是否存在
            FileReader fr = new FileReader(f1); // 創建檔案讀取器物件
            BufferedReader br = new BufferedReader(fr); // 創建緩衝讀取器物件

            File f2 = new File(args[1]); // 創建目標檔案物件，使用指定的檔案路徑
            FileWriter fw = new FileWriter(f2); // 創建檔案寫入器物件
            BufferedWriter bw = new BufferedWriter(fw); // 創建緩衝寫入器物件

            String data = br.readLine(); // 讀取源檔案的一行資料
            while (data != null) { // 進行迴圈，直到讀取到最後一行
                bw.write(data + "\n"); // 將資料寫入目標檔案，並加入換行符號
                data = br.readLine(); // 讀取下一行資料
            }

            bw.close(); // 關閉緩衝寫入器
            fw.close(); // 關閉檔案寫入器
            br.close(); // 關閉緩衝讀取器
            fr.close(); // 關閉檔案讀取器
        }
    }
}
