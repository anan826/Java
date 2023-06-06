import java.io.*;

/*4 */
public class ex0517_7 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test1.txt"); // 開啟可供讀取的紀錄檔案
            BufferedReader br = new BufferedReader(fr); // 產生可供讀取的緩衝器

            int data = br.read(); // 一次讀取一個字元，並得此字元之ASCII碼
            while (data != -1) {
                System.out.print((char) data);
                data = br.read();// 一次讀取一個字元
            }

            // String data = br.readLine();
            // while (data != null) {
            // System.out.println(data);
            // data = br.readLine();
            // }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("輸入錯誤。");
        }
    }
}
