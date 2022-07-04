interface Odd extends Runnable{
    public void run();
}

interface Even extends Runnable{
    public void run1();
}

class OE implements Odd,Even{
    public void run(){
        for(int i=0;i<20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public void run1(){
        for(int i=0;i<20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

}

public class OddEven{
    public static void main(String[] args) {
        OE oe= new OE();
        oe.run();
        oe.run1();
        

        Thread t1=new Thread(oe);
        Thread t2=new Thread(oe);
        t1.start();
        t2.start();
    }
}