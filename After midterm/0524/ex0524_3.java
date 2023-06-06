import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//java ex0524_3.java test1.txt
public class ex0524_3 {
    public static void main(String[] args) throws IOException {
        File f = new File(args[0]);
        if (f.exists()) {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

            br.close();
            fr.close();
        }
    }
}
