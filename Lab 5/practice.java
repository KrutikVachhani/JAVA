
public class practice{

    static int count=0;
        public practice(){
            count++;
        }
    public static void main(String[] args) {
        
        
        practice p1=new practice();
        practice p2=new practice();
        practice p3=new practice();
        practice p4=new practice();
        practice p5=new practice();
        //int O=Obj.count;
        System.out.println(practice.count);
    }
    
}