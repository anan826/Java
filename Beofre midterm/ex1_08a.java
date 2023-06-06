public class ex1_08a {
    public static void main(String[] args) {
        int a, b = 0;
        a = 10;
        ++a;
        System.out.println("a的值為" + a + "。");
        System.out.println("b的值為" + b + "。\n");

        a = 10;
        b = ++a;
        System.out.println("a的值為" + a + "。");
        System.out.println("b的值為" + b + "。\n");

        a = 10;
        b = --a;
        System.out.println("a的值為" + a + "。");
        System.out.println("b的值為" + b + "。\n");
    }
}
