import java.util.Scanner;

public class hw0222_1 {
    public static void main(String[] args) {
        /* 體重 */
        System.out.print("請輸入體重");
        Scanner sc = new Scanner(System.in);
        Float weight = sc.nextFloat();
        /* 身高 */
        System.out.print("請輸入身高(米)");
        Float height = sc.nextFloat();
        /* 計算BMI */
        float BMI;
        BMI = weight / (height * height);

        System.out.println("身高 =" + height + "\n體重 = " + weight + "\nBMI= " + BMI);

    }
}
