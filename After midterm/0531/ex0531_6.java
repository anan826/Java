class Car {
    int num;
    double gas;

    void setNum(int n) {
        num = n;
        System.out.println("將車號設為" + num);
    }

    void setGas(double m) {
        gas = m;
        System.out.println("將車號設為" + gas);
    }

    void show() {
        System.out.println("車號是：" + num);
        System.out.println("汽油量是：" + gas);
    }
}

public class ex0531_6 {
    /* 4 */
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setNum(1234);
        car1.setGas(20.5);

        car1.show();
    }
}
