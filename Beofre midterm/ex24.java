public class ex24 {
    public static void main(String[] args) {
        int i, sum_i = 0;
        int x = 0, sum_x = 0;
        int y = 0, sum_y = 0;
        // 方法一 for
        for (i = 1; i <= 100; i++) {
            sum_i += i;
        }
        System.out.println("1~100相加總合為:" + sum_i);
        // 方法二 while
        while (x < 101) {
            sum_x += x;
            x++;
        }
        System.out.println("1~100相加總合為:" + sum_x);
        // 方法三 do while
        do {
            sum_y += y;
            y++;
        } while (y < 101);
        System.out.println("1~100相加總合為:" + sum_y);
    }

}
