import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*1 */
public class ex0524_2 {
    public static void main(String[] args) throws IOException {
        File f = new File("text1.txt");
        if (f.exists()) {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String data = br.readLine();
            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }

            br.close();
            fr.close();
        }

    }
}
