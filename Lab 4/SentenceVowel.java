import java.lang.*;
import java.util.Scanner;
public class SentenceVowel{
    public static void main(String[] args) {
    int vowel=0;
    int consonant=0;
    System.out.println("enter Sentence");
    Scanner sc=new Scanner(System.in);
    String sentence=sc.nextLine();
    sentence=sentence.toLowerCase();
    for(int i=0;i<sentence.length();i++)
    {
        char ch=sentence.charAt(i);
        if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
        {
            vowel++;
        }
        else{
            consonant++;
        }
    }
    System.out.println("Vowels :"+vowel);
    System.out.println("Consonsnt :"+consonant);
    sc.close();
}
}