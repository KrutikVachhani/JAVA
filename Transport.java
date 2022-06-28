abstract class Animal{

}

interface transport{
     String delivar="krutik";

     void delivar();
}

class Tiger extends Animal{

}

class Camel extends Animal{
    
}

class Deer implements transport{
    void deliver(){
      System.out.println("hello");
    }
}

class Donkey implements transport{
    void deliver(){
       System.out.println("world");
    }
}

public class Transport{
    public static void main(String[] args) {
        Deer d=new Deer();
        Donkey d1=new Donkey();

        d.deliver();
        d1.deliver();


    }
}