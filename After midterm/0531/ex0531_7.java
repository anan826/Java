class Car {
    int num; // 車號
    double gas; // 汽油量

    int getNum() {
        System.out.println("調查車號"); // 輸出訊息：調查車號
        return num; // 返回車號
    }

    double getGas() {
        System.out.println("調查汽油量"); // 輸出訊息：調查汽油量
        return gas; // 返回汽油量
    }

    void setNumGas(int n, double g) {
        num = n; // 設定車號
        gas = g; // 設定汽油量
        System.err.println("將車號設為" + num + "將汽油量設為" + gas); // 輸出訊息：將車號設為[num]，將汽油量設為[gas]
    }

    void show() {
        System.out.println("車號是：" + num); // 輸出訊息：車號是：[num]
        System.out.println("汽油量是：" + gas); // 輸出訊息：汽油量是：[gas]
    }
}

public class ex0531_7 {
    /* 4 */
    public static void main(String[] args) {
        Car car1 = new Car(); // 創建 Car 物件
        car1.setNumGas(1234, 20.5); // 設定車號為 1234，汽油量為 20.5
        int number = car1.getNum(); // 獲取車號
        double gasoline = car1.getGas(); // 獲取汽油量
        System.out.println("調查樣品車時得知"); // 輸出訊息：調查樣品車時得知
        System.out.println("車號是" + number + "，汽油量是" + gasoline); // 輸出訊息：車號是[num]，汽油量是[gasoline]
        car1.show(); // 輸出車號和汽油量
    }
}
