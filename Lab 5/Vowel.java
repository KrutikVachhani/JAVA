import java.util.*;
public class Vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("enter string");
        //String s = sc.nextLine();
        String s="";

        int count=0,total_count=0;
        char ch;
        while(true)
        {
            System.out.println("enter string");
            s = sc.nextLine();
            
            s=s.toLowerCase();
            if(s.equals("quit")){
                break;
            }
            count=0;
            for(int i=0;i<s.length();i++)
            {
                ch=s.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u')
                {
                    count++;
                }
            }
            System.out.println(count);
            total_count=total_count+count;
        }   
    System.out.println("total vowels :"+total_count);
    }
}