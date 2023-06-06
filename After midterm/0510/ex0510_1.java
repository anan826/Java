import java.util.*;

/**
 * 這個程式用於模擬發牌遊戲，隨機從一副撲克牌中選取一張牌並輸出。
 */
public class ex0510_1 {
    /**
     * 主函式，用於模擬發牌遊戲，隨機從一副撲克牌中選取一張牌並輸出。
     */
    public static void main(String[] args) {
        System.out.print("本次發牌 : ");
        char[] c1 = new char[] { 'S', 'H', 'D', 'C' }; // 花色：黑桃(Spades)、紅心(Hearts)、方塊(Diamonds)、梅花(Clubs)
        char[] c2 = new char[] { 'A', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K' }; // 牌號：A、2、3、...、9、10(X)、J、Q、K
        Random rnd = new Random();
        int p = rnd.nextInt(4); // 隨機選取花色陣列中的索引
        int n = rnd.nextInt(13); // 隨機選取牌號陣列中的索引
        System.out.println(c1[p] + " " + c2[n]); // 輸出隨機選取的花色和牌號組合
    }
}
