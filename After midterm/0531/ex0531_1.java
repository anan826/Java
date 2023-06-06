import java.io.*;

public class ex0531_1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./test2.txt");
        FileReader fr1 = new FileReader(f1);
        BufferedReader br1 = new BufferedReader(fr1);
        String data;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            data = br1.readLine();
            int num = Integer.parseInt(data);
            System.out.println(num);
            sum += num;
        }
        System.out.println("總和為：" + sum);
        br1.close();
    }
}
