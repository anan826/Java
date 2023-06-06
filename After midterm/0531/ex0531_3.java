import java.io.*;

/*2*/
public class ex0531_3 {
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
            while (data != null) {
                System.out.println("原資料為：" + data);
                String[] strSplit = data.split(" ");
                int cnt = strSplit.length;
                int sum = 0;
                for (int i = 0; i < cnt; i++) {
                    int num = Integer.parseInt(strSplit[i]);
                    sum += num;
                }
                System.out.println("此行數字總和為：" + sum);
                System.out.println("");
                data = br1.readLine();

            }
            br1.close();
        }
    }
}
