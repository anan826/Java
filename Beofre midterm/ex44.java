import java.util.Arrays;

/*5 */
public class ex44 {
    public static void main(String[] args) {
        int tmp, i, j;
        int X[] = { 30, 20, 50, 10, 70, 40, 100, 80, 90, 60 };
        for (i = 0; i <= 9; i++) {
            for (j = 0; j <= 9; j++) {
                if (X[j] > X[i]) {
                    tmp = X[j];
                    X[j] = X[i];
                    X[i] = tmp;
                }
            }
            System.out.println("第" + (i + 1) + "個回合：" + Arrays.toString(X));
        }

    }
}
