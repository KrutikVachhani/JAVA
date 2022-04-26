import java.util.Scanner;
public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number Of Lines ");
        int n = 5;
        for (int i = n; i >0; i--) {
            for (int j = 5; j<i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

    }
}
