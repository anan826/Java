class Car {
    int num; // 車號
    double gas; // 汽油量

    void setNum(int n) {
        num = n; // 設定車號
        System.out.println("將車號設為" + num); // 輸出訊息：將車號設為[num]
    }

    void setGas(double m) {
        gas = m; // 設定汽油量
        System.out.println("將車號設為" + gas); // 輸出訊息：將車號設為[gas]
    }

    void show() {
        System.out.println("車號是：" + num); // 輸出訊息：車號是：[num]
        System.out.println("汽油量是：" + gas); // 輸出訊息：汽油量是：[gas]
    }
}

public class ex0531_6 {
    /* 4 */
    public static void main(String[] args) {
        Car car1 = new Car(); // 創建 Car 物件
        car1.setNum(1234); // 設定車號為 1234
        car1.setGas(20.5); // 設定汽油量為 20.5

        car1.show(); // 輸出車號和汽油量
    }
}
