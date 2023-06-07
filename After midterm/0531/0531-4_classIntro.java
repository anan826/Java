// 這段程式碼用於展示汽車的車號和汽油量

class Car {
    int num; // 車號
    double gas; // 汽油量
}

public class ex0531_4 {
    public static void main(String[] args) {
        Car car1; // 宣告 Car 物件的參考變數 car1
        car1 = new Car(); // 創建 Car 物件並將其參考賦值給 car1
        car1.num = 1234; // 設定 car1 的車號為 1234
        car1.gas = 20.5; // 設定 car1 的汽油量為 20.5
        System.out.println("車號是：" + car1.num); // 輸出 car1 的車號
        System.out.println("汽油量是：" + car1.gas); // 輸出 car1 的汽油量
    }
}
