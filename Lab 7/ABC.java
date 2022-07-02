import java.util.*;
import java.lang.*;

interface A{
    int a=10;

    void displayA();
}

interface A1 extends A{
    int b=10;

    void displayA1();
    
}

interface A2 extends A{
    int c=10;

     void displayA2();
}

interface A12 extends A1,A2{
    int d=10;

    void displayA12();
}

class B implements A12{
    public void displayA(){
        System.out.println(a);
    }

    public void displayA1(){
        System.out.println(b);
    }

    public void displayA2(){
        System.out.println(c);
    }

    public void displayA12(){
        System.out.println(d);
    }
}

public class ABC{
    public static void main(String[] args) {
        B b1=new B();

        b1.displayA();
        b1.displayA1();
        b1.displayA2();
        b1.displayA12();
    }
}