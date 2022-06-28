abstract class Vegetable{
    String color;
}

class potato extends Vegetable{
    String color="cream";

    public String toString(){
        return color;
    }

}

class tometo extends Vegetable{
    String color="red";

    public String toString(){
        return color;
    }
}

class bringle extends Vegetable{
    String color="purple";

    public String toString(){
        return color;
    }
}
public class Veg{
    public static void main(String[] args) {
        potato p=new potato();
        tometo t=new tometo();
        bringle b=new bringle();

        System.out.println(p.toString());
        System.out.println(t.toString());
        System.out.println(b.toString());
    }
}