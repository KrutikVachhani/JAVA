import java.util.*;

public class Que2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pr=new PriorityQueue<>((a, b) -> b-a);
        //pr.add(1);
        //pr.add(2);
        //pr.add(3);
        //pr.add(4);
        //pr.add(5);
        //pr.add(6);
        //pr.add(7);
        //pr.add(8);
        //pr.add(9);
        //pr.add(10);

        for(int i=10;i>0;i--){
            pr.add(i);
        }
        //pr.add(9);
        //pr.add(8);
        //pr.add(2);
        //pr.add(4);
        //pr.add(5);
        //pr.add(4);
        //pr.add(6);
        //pr.add(0);
        //pr.add(1);


        while(pr.size()>0){
        System.out.println(pr.remove());
        }

    }
}