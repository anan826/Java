import java.util.Random;

/**
 * 這個程式用於模擬發牌遊戲，從一副撲克牌中隨機選取一張牌並輸出。
 */
public class ex0503_7 {
    /**
     * 主函式，用於模擬發牌遊戲，從一副撲克牌中隨機選取一張牌並輸出。
     */
    public static void main(String[] args) {
        System.out.print("本次發牌 : ");
        char[] c1 = new char[] { 'S', 'H', 'D', 'C' }; // 花色：黑桃(Spades)、紅心(Hearts)、方塊(Diamonds)、梅花(Clubs)
        char[] c2 = new char[] { 'A', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K' }; // 牌號：A、2、3、...、9、10(X)、J、Q、K
        Random rnd = new Random();
        System.out.printf("%c %c", c1[rnd.nextInt(4)], c2[rnd.nextInt(13)]); // 隨機選取一個花色和一個牌號並輸出
    }
}
