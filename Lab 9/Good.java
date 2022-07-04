class Morning extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
        System.out.println("Good Morning");
        try{
        Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }
}

class Afternoon extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
        System.out.println("Good Afternoon");
        try{
        Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    } 
}
public class Good{
    public static void main(String[] args) {
        Morning M= new Morning();
        Afternoon N= new Afternoon();
        M.start();
        N.start();
    }
}