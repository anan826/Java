import java.io.*;

/* 這個程式用於從使用者輸入中讀取資料，並將其寫入到指定的檔案中 */

public class ex0524_6 {
    /* 主程式進入點 */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(args[0]);// 產生可供寫入的紀錄檔案
        BufferedWriter bw = new BufferedWriter(fw);// 產生可供寫入的緩衝器

        InputStreamReader isr = new InputStreamReader(System.in); // 建立輸入串流物件，用於讀取使用者輸入
        BufferedReader br = new BufferedReader(isr); // 建立緩衝讀取器物件，用於讀取使用者輸入的文字

        for (int i = 1; i <= 5; i++) { // 執行迴圈，讓使用者輸入5行文字
            System.out.print("請輸入第" + i + "行字: ");
            bw.write(br.readLine() + "\n"); // 從使用者讀取一行文字，並寫入到檔案中
        }

        bw.close(); // 關閉緩衝寫入器
        fw.close(); // 關閉檔案寫入器
    }
}
