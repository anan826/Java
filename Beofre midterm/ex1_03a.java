public class ex1_03a {
    public static void main(String[] args) {
        System.out.println("請輸入兩個數 :");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res;

        res = num1 + num2;
        System.out.println("\n兩數相加:" + num1 + " + " + num2 + " = " + res);
        res = num1 - num2;
        System.out.println("兩數相乘:" + num1 + " - " + num2 + " = " + res);
        res = num1 * num2;
        System.out.println("兩數相乘:" + num1 + " * " + num2 + " = " + res);
    }
}
