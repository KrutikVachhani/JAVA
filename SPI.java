import java.util.Scanner;

class A{
    int[] id_no;
    int no_of_subject;
    int[] subject_code;
    int[] subject_credit;
    int[] grade_obtained;
    double[] spi;

public void SPI(){
    subject_code=new int[no_of_subject];
    subject_credit=new int[no_of_subject];
    grade_obtained=new int[no_of_subject];
}
public void getdetails(){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<this.no_of_subject;i++)
    {
        System.out.println("enter details of subject");
        System.out.println("enter code");
        this.subject_code[i]=sc.nextInt();
        System.out.println("enter credit");
        this.subject_credit[i]=sc.nextInt();
        System.out.println("enter subject grade");
        this.grade_obtained[i]=sc.nextInt();
    }
}
public void calculate_spi(){
    int i;
    int grade;
    int credit;
    for(i=0;i<this.no_of_subject;i++)
    {
        grade=this.subject_credit[i]*this.grade_obtained[i];
        credit+=this.subject_credit[i];
    }
    this.spi=(double)grade/credit;
    
}
void display(){
    calculate_spi();
    System.out.println(spi);
}
public class SPI{
    public static void main(String[] args) {
        int count=Integer.parseInt(args[0]);
        int i=0;
        Scanner sc=new Scanner(System.in);
        int id_no,no_of_subject;
        for(i=0;i<count;i++){
            System.out.println("enter id");
            id_no=sc.nextInt();
            System.out.println("enter number of subject");
            no_of_subject=sc.nextInt();
            A=new SPI(id_no,no_of_subject);
            A.getdetails();
            A.display();
        }
    }
}
}