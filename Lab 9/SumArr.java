import java.util.*;

class Matrix implements Runnable{
    static int [][] a;
    static int row,col,y=0;
    public void readArray(int m,int n,Scanner sc){
        row=n;
        col=m;

        a=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    public void run(){
        int sum=0;
        for(int i=0;i<col;i++){
            sum=sum+a[y][i];
        }
        y++;
        System.out.println("Thred :"+Thread.currentThread().getId()+"sum :"+sum);
    }
}

public class SumArr{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of rws and coluns");
        int n=scan.nextInt();
        int m=scan.nextInt();
        Matrix m1=new Matrix();
        m1.readArray(n,m,scan);

        Matrix [] a1;
        a1=new Matrix[n];
        for(int i=0;i<n;i++){
            a1[i]=new Matrix();
            Thread t1=new Thread(a1[i]);
            t1.start();
        }
    }
}