import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*2 */
public class ex0524_4 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("請指定正確的檔案名稱參數");
            System.exit(0);
        }
        File f = new File(args[0]);
        if (f.exists()) {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                System.out.print(data);
            }

            br.close();
            fr.close();
        }
    }
}
