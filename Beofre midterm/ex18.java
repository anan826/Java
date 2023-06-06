import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A出 1.剪刀 2.石頭 3.布");
        int firstMove = scan.nextInt();
        System.out.println("B出 1.剪刀 2.石頭 3.布");
        int secondMove = scan.nextInt();
        if (firstMove == secondMove) {
            System.out.println("TIES");
            /* 平手 */
        } else if (firstMove == 1 && secondMove == 2) {
            System.out.println("A lose, B win");
            /* A剪B石 */
        } else if (firstMove == 1 && secondMove == 3) {
            System.out.println("A win, B lose");
            /* A剪B布 */
        } else if (firstMove == 2 && secondMove == 1) {
            System.out.println("A win, B lose");
            /* A石B剪 */
        } else if (firstMove == 2 && secondMove == 3) {
            System.out.println("A lose, B win");
            /* A石B布 */
        } else if (firstMove == 3 && secondMove == 1) {
            System.out.println("A lose, B win");
            /* A布B剪 */
        } else if (firstMove == 3 && secondMove == 2) {
            System.out.println("A win, B lose");
            /* A布B石 */
        }
    }
}
