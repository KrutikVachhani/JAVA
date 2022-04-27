import java.util.*;
class BankDetails{
    Scanner sc=new Scanner(System.in);
    String accountNo;
    String userName;
    String email;
    String accountType;
    long accountBalance;
    public void getAccountDetail()
    {
        System.out.println("enter accountNo :");
        accountNo=sc.next();
        System.out.println("enter userName :");
        userName=sc.next();
        System.out.println("enter your email :");
        email=sc.next();
        System.out.println("Account Type :");
        accountType=sc.next();
        System.out.println("enter Account Balance :");
        accountBalance=sc.nextLong();
    }
    public void displayAccountDetails()
    {
        System.out.print("Account No :");
        System.out.println(accountNo);
        System.out.print("Account Holder Name :");
        System.out.println(userName);
        System.out.print("Email :");
        System.out.println(email);
        System.out.print("Account Type :");
        System.out.println(accountType);
        System.out.print("Account Balance :");
        System.out.println(accountBalance);
    }
}
public class bank_account{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many account detail you enter :");
        int n=sc.nextInt();
        BankDetails C[]=new BankDetails[n];
        for(int i=0;i<C.length;i++){
        C[i]=new BankDetails();
        C[i].getAccountDetail();
        C[i].displayAccountDetails();
        }
    }
}