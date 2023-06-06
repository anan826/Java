public class ex1_09 {
    public static void main(String[] args) {
        int a = 0x3c; // 0011 1100
        int b = 0x0f; // 0000 1111
        int c = 0x03; // 0000 0011
        int d = 0x78; // 0111 1000
        int f = 0x03; // 0000 0011
        int g = 120; // 0111 1000
        int r;
        System.out.println("a/b的值 = " + a + "/" + b);
        System.out.println("c/d的值 = " + c + "/" + d);
        r = ~a; // NOT運算
        System.out.println("NOT運算: ~a = " + r);
        r = a & b; // AND運算
        System.out.println("AND運算: a & b = " + r);
        r = a | c; // OR運算
        System.out.println("OR運算: a | c = " + r);
        r = a ^ d; // XOR運算
        System.out.println("XOR運算: a ^ d = " + r);
        // 左移與右移位元運算子
        System.out.println("f/g的值 = " + f + "/" + g);
        System.out.println("左移運算: f<<1 = " + (f << 1));
        System.out.println("左移運算: f<<2 = " + (f << 2));
        System.out.println("右移運算: g>>1 = " + (g >> 1));
        System.out.println("右移運算: g>>2 = " + (g >> 2));
    }
}
