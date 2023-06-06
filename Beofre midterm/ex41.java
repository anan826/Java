public class ex41 {
    public static void main(String[] args) {
        int X[] = { 30, 20, 50, 10, 70, 40, 100, 80, 90, 60 };
        int tmp, i;
        tmp = X[0];
        for (i = 1; i < 10; i++) {
            if (tmp < X[i]) {
                tmp = X[i];
            }
        }
        System.out.println("最大值：" + tmp);
    }
}