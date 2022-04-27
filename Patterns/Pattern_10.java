import java.util.Scanner;
import java.lang.*;
public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUmber Of Lines ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            System.out.println(" ");
        }
    }
}
