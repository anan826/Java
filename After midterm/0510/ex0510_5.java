/**
 * 這個程式使用函式呼叫來輸出指定次數的訊息。
 */
public class ex0510_5 {
    /**
     * 主函式，使用函式呼叫來輸出 "Hello Java !!!" 訊息 10 次。
     */
    public static void main(String[] args) {
        System.out.println(("以下使用函式呼叫 :"));
        for (int i = 1; i <= 10; i++) {
            printHello();
        }
    }

    /**
     * 方法用於輸出 "Hello Java !!!" 訊息。
     */
    public static void printHello() {
        System.out.println("Hello Java !!! "); // 輸出訊息
    }
}
