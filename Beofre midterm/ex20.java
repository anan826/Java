import java.util.Scanner;

/*2*/
public class ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A出 1.剪刀 2.石頭 3.布");
        int firstMove = scan.nextInt();
        System.out.println("B出 1.剪刀 2.石頭 3.布");
        int secondMove = scan.nextInt();
        if (firstMove > 3 || firstMove < 1 || secondMove > 3 || secondMove < 1) {
            System.out.println("error");
        } else {
            if (secondMove - firstMove == 1 || firstMove - secondMove == -2) {
                System.out.println("A lose, B win");
            } else if (firstMove - secondMove == 1 || secondMove - firstMove == -2) {
                System.out.println("A win, B lose");
            } else {
                System.out.println("Tie");
            }
        }
    }
}
