import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex0524_1 {
    public static void main(String[] args) throws IOException {
        File f = new File("test1.txt");
        if (f.exists()) {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            int data = br.read();
            while (data != -1) {
                System.out.print((char) data);
                data = br.read();
            }

            br.close();
            fr.close();
        }
    }
}
