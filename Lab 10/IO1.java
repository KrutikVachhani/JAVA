import java.io.*;

public class IO1{
    public static void main(String[] args) {
        File F=new File("hello.txt");
        try{
            F.createNewFile();
            System.out.println("file created successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
        }
    }