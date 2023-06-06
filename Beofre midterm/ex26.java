import java.util.Scanner;

/*交2 */
public class ex26 {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        System.out.println("Enter number range (2 integer) : ");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int j = first;
        int second = scan.nextInt();
        System.out.println("Enter multiple : ");
        int multiple = scan.nextInt();
        for (i = first; i <= second; i++) {
            if (i % multiple == 0) {
                sum += i;
            }
        }
        System.out.println(first + "~" + second + "之間，" + multiple + "的倍數相加總合為 : " + sum);
        while (i <= second) {
            if (i % multiple == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(first + "~" + second + "之間，" + multiple + "的倍數相加總合為 : " + sum);
        sum = 0;
        do {
            if (j % multiple == 0) {
                sum += j;
            }
            j++;
        } while (j <= second);
        System.out.println(first + "~" + second + "之間，" + multiple + "的倍數相加總合為 : " + sum);
    }
}
