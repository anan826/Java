import java.io.*;

public class ex0524_7 {
    /* 4 */
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("請指定正確的檔案名稱參數");
            System.exit(0);
        }

        File f1 = new File(args[0]);

        if (f1.exists()) {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);

            File f2 = new File(args[1]);
            FileWriter fw = new FileWriter(f2);
            BufferedWriter bw = new BufferedWriter(fw);

            String data = br.readLine();
            while (data != null) {
                bw.write(data + "\n");
                data = br.readLine();
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();

        }

    }
}
