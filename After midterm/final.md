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



## Topics

這裏整理的內容以『主題』爲中心，方便查找過程使用。

### Random
Random 模組可以隨機產生數字。
使用Random模組中的nextInt函式從0到指定的數字（不包括指定數字）中隨機選取一個數字。
ex:
```
    //  Import All the Modules we need.
    import java.util.Scanner;
    import java.util.Random;

    int insert = new Scanner(System.in).nextInt();
    //  Detected number 6.
    Random rand = new Random();
    int randInt = rand.nextInt(insert);
    //  Random number from 0 to 5.
```
