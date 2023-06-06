import java.io.*;

/**
 * 這個程式用於讀取並顯示指定檔案（test1.txt）的內容。
 */
/* 4 */
public class ex0517_7 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test1.txt"); // 開啟可供讀取的紀錄檔案
            BufferedReader br = new BufferedReader(fr); // 產生可供讀取的緩衝器

            int data = br.read(); // 一次讀取一個字元，並得此字元之ASCII碼
            while (data != -1) {
                System.out.print((char) data); // 將字元轉換為對應的字元值並顯示
                data = br.read(); // 一次讀取一個字元
            }

            br.close(); // 關閉緩衝讀取器
            fr.close(); // 關閉檔案讀取器
        } catch (IOException e) {
            System.out.println("輸入錯誤。");
        }
    }
}
