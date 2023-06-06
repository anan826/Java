public class ex25 {
    /* 交1 */
    public static void main(String[] args) {
        int i, sum_i = 0;
        int x = 1, sum_x = 0;
        int y = 1, sum_y = 0;
        // 方法一 for
        for (i = 1; i <= 100; i += 2) {
            sum_i += i;
        }
        System.out.println("1~100奇數加總合為:" + sum_i);
        // 方法二 while
        while (x <= 100) {
            sum_x += x;
            x += 2;
        }
        System.out.println("1~10奇數加總合為:" + sum_x);
        // 方法三 do while
        do {
            sum_y += y;
            y += 2;
        } while (y <= 100);
        System.out.println("1~100奇數加總合為:" + sum_y);
    }
}
