import java.io.*;
public class Demo {
    public static void main(String[] args) {
        File f1 = new File("hello.txt");

        System.out.println("fileName :"+ f1.getName());
        System.out.println("path :"+ f1.getPath());
        System.out.println("abs path :"+ f1.getAbsolutePath());
        System.out.println("Parent :"+ f1.getParent());
        System.out.println(f1.exists()?"exists" : "not exists");
        System.out.println(f1.canWrite()? "is writeable" : "is not writable");
        System.out.println(f1.canRead()? "is reasdable" : "is not readable");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.isAbsolute());
        System.out.println("last modified :"+ f1.lastModified());
        System.out.println("Fole Size :"+ f1.length());
    }
}