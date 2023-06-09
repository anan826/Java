# Final Exam

## Table of Contents.
本文件將以兩個方面爲核心，進行整理。
Topics 段落以主題爲核心，使使用者方便查找；
Dates 段落以日期爲核心，大略說明檔案內容。

[Topics](##Topics)

[Dates](##Dates)

## Dates

### 0503

1. 隨機骰骰子：運用random中nextInt 的方式隨機作出1~6的數字。
    > 記得：nextInt中的數字並不包括在內。
2. 骰子點數加總：  除了使用Random外，加上了for迴圈對數字進行篩選。
3. 骰子點數加總：  同前一題，區別在於骰子的加總記錄用點數本身作爲array的索引值。
4. 99懲罰表：   使用兩層的array把所有的值儲存在內，做一個99乘法表。
5. 隨機陣列：    將隨機的值輸入值雙層的array。
6. 巴斯卡三角形：  運用for迴圈寫出巴斯卡三角形。
7. 發牌模擬：    運用Random及array進行發牌的模擬。

### 0510

1. 發牌模擬：同0503第7題，只是換一種寫法。
2. 字串分割：使用字串分割的方式將內容印出來。
3. 字串加總：在字串分割的基礎上將數字給加總起來。
4. 函式使用：從一個主函式變成擁有子函式。
5. 函式使用：同前一題，只是做了些改變。
6. 多行列印：使用子函式將多行字串進行讀取。
7. 兩數比較：使用void函式進行兩數比較。
8. 三數比較：使用void函式進行三數比較。

### 0517

1. 三數比較：使用int函式進行三個數字的比較。
2. 三數比較：同前一題，只是不放入參數進入子函式。
3. 階層計算：使用遞迴函式進行階層計算。
4. 費氏數列：使用遞迴函式進行費氏數列的計算。
5. 階層計算：使用For迴圈進行階層計算。
 > 在這題內放入的部分並不是要計算的數字，而是預計要進行幾層。
6. 費氏數列：同第四題，區別在於計算的方式改用for迴圈進行。
7. 檔案讀取：將題目內指定的檔案進行讀取。

### 0524

1. 逐字讀取：從檔案讀取爲基礎，加入了檢查的機制；同時，運用了while迴圈進行每字的讀取。
2. 逐列讀取：從上題爲基礎，將逐字讀取變成逐行讀取。
3. 命令列讀取：基於上題爲基礎，將原先固定的讀取檔案變成可由終端進行操作。
4. 檔案存在偵測：基於上題，如果輸入的方式並不正確，會有相應的處理。
5. 檔案寫入：運用fileWriter將資料寫入檔案。
6. 指定檔案寫入：使用命令列輸入的方式指定檔案後輸入。
7. 複製檔案：使用命令列偵測兩個檔案，進行檔案複製。

### 0531
1. 數字加總：將檔案內的前十行數字進行加總。
2. 數字比較：讀取檔案，比較檔案內的數字何者最大。
3. 數字加總：將檔案內的數字進行加總。
4. 類型賦值：創建新的物件，並予以賦值。
5. 物件函式：在物件中寫入函式，使得物件可以進行函式操作。
6. 物件更值：透過撰寫物件中的函式，將值進行更改。
7. 類型統整：將前幾題進行整合，有檢查、有更改。

## Topics

這裏整理的內容以『主題』爲中心，方便查找過程使用。

### Random
Random 模組可以隨機產生數字。
使用Random模組中的nextInt函式從0到指定的數字（不包括指定數字）中隨機選取一個數字。
ex:
```java
    //  Import All the Modules we need.
    import java.util.Scanner;
    import java.util.Random;

    int insert = new Scanner(System.in).nextInt();
    //  Detected number 6.
    Random rand = new Random();
    int randInt = rand.nextInt(insert);
    //  Random number from 0 to 5.
```

### Class
Class 類型讓使用者可以更有效率、有系統性的進行操作。
```java
class Car
{
    int num;
    double gas;
    void show()
    {
        //...;
    }
}

public static void main(String[] args)
{
    Car car1 = new Car();//  Create an Object.
    car1.num = 8888;//  Change the Value in the object.
    car1.show();//  Call the function you've wrote in the class.
}
```

