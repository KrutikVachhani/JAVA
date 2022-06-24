import java.util.*;
public class Array_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}