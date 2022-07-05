import java.io.FileOutputStream;
import java.io.*;
public class FileOutDemo {
    public static void main(String[] args) {
        try{
        FileOutputStream fout = new FileOutputStream("hello.txt");

        String s="hello my nam is krutik vachhani";
        byte b[]=s.getBytes();
        fout.write(b);
        fout.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Success......");
    }
}
