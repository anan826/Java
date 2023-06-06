import java.io.IOException;
import java.io.*;

/*1 */
public class ex0531_2 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("請指定正確的檔案名稱參數。");
            System.exit(0);
        }
        File f1 = new File(args[0]);
        if (f1.exists()) {
            FileReader fr1 = new FileReader(f1);
            BufferedReader br1 = new BufferedReader(fr1);
            String data = br1.readLine();
            System.out.println(data);
            int max = Integer.parseInt(data);
            int min = max;
            while ((data = br1.readLine()) != null) {
                System.out.println(data);
                int num = Integer.parseInt(data);
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
            }
            System.out.println("最大值是：" + max);
            System.out.println("最小值是：" + min);
            br1.close();
        }
    }
}
