import java.util.Scanner;
public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of lines ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
               
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i );
            }
            System.out.println(" ");
        }
    }
}