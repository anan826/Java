public class ex0503_4 {

    /**
     * 這個程式用於生成並輸出九九乘法表。
     */
    public static void main(String[] args) {
        int x[][] = new int[9][9]; // 用於存儲九九乘法表的結果
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                x[i][j] = (i + 1) * (j + 1); // 計算九九乘法表中每個位置的結果
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%d*%d=%2d\t", (i + 1), (j + 1), x[i][j]); // 格式化輸出九九乘法表的每個位置
            }
            System.out.println(""); // 換行輸出下一行
        }
    }
}
