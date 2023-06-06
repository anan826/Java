import java.util.Scanner;

/**
 * 這個程式使用函式呼叫來輸出指定行數的訊息。
 */
public class ex0510_6 {
    /**
     * 主函式，從使用者獲取行數和訊息並呼叫 printHello 方法。
     */
    public static void main(String[] args) {
        System.out.println(("以下使用函式呼叫 :"));
        Scanner sc = new Scanner(System.in);
        System.out.println(("輸出行數 :"));
        int n = sc.nextInt(); // 讀取輸出行數
        System.out.println(("輸出內容 :"));
        String msg = sc.next(); // 讀取輸出訊息
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " :");
            printHello(msg); // 呼叫方法輸出訊息
        }
        sc.close(); // 關閉輸入流
    }

    /**
     * 方法用於輸出指定的訊息。
     * 
     * @param name 訊息內容
     */
    public static void printHello(String name) {
        System.out.println("Hello " + name + " !!! "); // 輸出訊息
    }
}
