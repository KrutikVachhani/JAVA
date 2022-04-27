import java.util.Scanner;
import java.io.Closeable;
import java.util.*;

class book{
    private String author_name;
    
    book(String author_name){
        this.author_name=author_name;
    }
    void display(){
        System.out.println("name of author : "+author_name);
    }
}
class book_publication extends book{
    private String title;
    
    book_publication(String title){
        super("");
        this.title=title;
    }
    void display(){
        System.out.println("book title : "+title);
    }
}
class paper_publication extends book{
    private String title;
    
    paper_publication(String title){
        super("");
        this.title=title;
    }
    void display(){
        System.out.println("page title : "+title);
    }
}

public class BookDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        book b1=new book("hello");
        book_publication b2=new book_publication("Arihant");
        paper_publication p1=new paper_publication("Index");
        b1.display();
        b2.display();
        p1.display();
        sc.close();
    }
}