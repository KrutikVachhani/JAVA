import java.util.Scanner;

class Member{
    String Name;
    int Age;
    long PhoneNo;
    String Address;
    long Salary;

    Member(String Name,int Age,long PhoneNo,String Address,long Salary){
        this.Name=Name;
        this.Age=Age;
        this.PhoneNo=PhoneNo;
        this.Address=Address;
        this.Salary=Salary;
    }

    void Mdisplay(){
        System.out.println("Name :"+Name);
        System.out.println("Age :"+Age);
        System.out.println("PhoneNo :"+PhoneNo);
        System.out.println("Address :"+Address);
        System.out.println("Salary :"+Salary);
    }
}
 class Employee extends Member{
    String Specialization;

    Employee(String Name,int Age,long PhoneNo,String Address,long Salary,String Specialization){
        super(Name,Age,PhoneNo,Address,Salary);
        this.Specialization=Specialization;
    }

    void display(){
        Mdisplay();
        System.out.println("Specialization :"+Specialization);
    }
}
 class Manager extends Member{
    String Department;

    Manager(String Name,int Age,long PhoneNo,String Address,long Salary,String Department){
        super(Name,Age,PhoneNo,Address,Salary);
        this.Department=Department;
    }

    void display(){
        Mdisplay();
        System.out.println("Department :"+Department);
    }
}

public class MemberDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee E1=new Employee("krutik",18,5984,"rajkot",25000,"dbms");
        Manager M1=new Manager("kevin",17,39742,"morbi",30000,"java");
        E1.display();
        M1.display();
        sc.close();
    }
}