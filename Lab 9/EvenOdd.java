import java.util.Scanner;

class Od implements Runnable{
    
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of Even number from 1 to ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
class Ev implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of odd number from  1 to ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}

public class EvenOdd{
    public static void main(String[] args) {

       
        Od o=new Od();
        Ev e=new Ev();
        Thread t1=new Thread(o);
        Thread t2=new Thread(e);
        t1.start();
        t2.start();
        
    }
}