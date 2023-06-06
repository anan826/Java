class Car {
    int num; // 車號
    double gas; // 汽油量

    void show() {
        System.out.println("車號是：" + num); // 輸出訊息：車號是：[num]
        System.out.println("汽油量是：" + gas); // 輸出訊息：汽油量是：[gas]
    }
}

public class ex0531_5 {
    /* 3 */
    public static void main(String[] args) {
        Car car1; // 建立 Car 物件的參考變數
        car1 = new Car(); // 創建 Car 物件並將其參考賦值給 car1
        car1.num = 1234; // 設定 car1 的車號為 1234
        car1.gas = 20.5; // 設定 car1 的汽油量為 20.5

        car1.show(); // 輸出 car1 的車號和汽油量
    }
}
