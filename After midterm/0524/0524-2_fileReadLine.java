import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*這個程式用於讀取並顯示指定檔案（text1.txt）的內容。*/
public class ex0524_2 {
    public static void main(String[] args) throws IOException {
        File f = new File("text1.txt"); // 建立檔案物件，指定要讀取的檔案名稱
        if (f.exists()) { // 檢查檔案是否存在
            FileReader fr = new FileReader(f); // 建立檔案讀取器物件
            BufferedReader br = new BufferedReader(fr); // 建立緩衝讀取器物件，用於讀取檔案內容

            String data = br.readLine(); // 讀取檔案的一行內容
            while (data != null) { // 當還有內容可讀取時
                System.out.println(data); // 顯示讀取到的內容
                data = br.readLine(); // 讀取下一行內容
            }

            br.close(); // 關閉緩衝讀取器
            fr.close(); // 關閉檔案讀取器
        }
    }
}
