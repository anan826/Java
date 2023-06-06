import java.io.*;

/*3 */
public class ex0524_6 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(args[0]);// 產生可供寫入的紀錄檔案
        BufferedWriter bw = new BufferedWriter(fw);// 產生可供寫入的緩衝器

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for (int i = 1; i <= 5; i++) {
            System.out.print("請輸入第" + i + "行字: ");
            bw.write(br.readLine() + "\n");// 寫入
        }

        bw.close();
        fw.close();
    }
}
