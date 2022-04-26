import java.util.Scanner;
public class Pattern_1 {
    public static void main(String[]args){
        int i,j,r,s=1;
        System.out.println("enter the number of rows you want to print");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();

        s=r-1;
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            s--;
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        s=1;
        for(i=1;i<=r-1;i++)
        {
            for(j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            s++;
            for(j=1;j<=2*(r-j)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}