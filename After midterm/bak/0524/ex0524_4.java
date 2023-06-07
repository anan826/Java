import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* 這個程式用於讀取指定檔案的內容並輸出到控制台 */

public class ex0524_4 {
    /* 主程式進入點 */
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("請指定正確的檔案名稱參數");
            System.exit(0);
        }

        File f = new File(args[0]); // 建立檔案物件，指定要讀取的檔案路徑
        if (f.exists()) { // 檢查檔案是否存在
            FileReader fr = new FileReader(f); // 建立檔案讀取器物件
            BufferedReader br = new BufferedReader(fr); // 建立緩衝讀取器物件，用於讀取檔案內容

            String data;
            while ((data = br.readLine()) != null) { // 逐行讀取檔案內容，直到達到檔案末尾
                System.out.print(data); // 將讀取的內容輸出到控制台
            }

            br.close(); // 關閉緩衝讀取器
            fr.close(); // 關閉檔案讀取器
        }
    }
}
