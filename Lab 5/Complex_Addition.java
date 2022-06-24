import java.lang.*;
public class Complex_Addition1{
    double real;
    double image;
    Complex_Addition1(){}
    Complex_Addition1(double real, double image)
    {
        this.real=real;
        this.image=image;
    }


    Complex_Addition1 addComp(Complex_Addition1 C1, Complex_Addition1 C2){
    Complex_Addition1 temp=new Complex_Addition1();
    temp.real=C1.real+C2.real;
    temp.image=C1.image+C2.image;
    return temp;
    }
}
public class Complex_Addition{
    public static void main(String[] args){

        Complex_Addition1 C1=new Complex_Addition1(2,6);
        Complex_Addition1 C2=new Complex_Addition1(4,2);
    
    temp=addComp(C1, C2);
    
    System.out.println(temp.real, temp.image); 
}
}