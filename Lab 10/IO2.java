import java.io.*;

public class IO2{
    public static void main(String[] args) {
        File F=new File("hello.txt");
        try{
            FileWriter file=new FileWriter("hello.txt");
            file.write("hi i am krutik vachhani");
            file.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        }
    }