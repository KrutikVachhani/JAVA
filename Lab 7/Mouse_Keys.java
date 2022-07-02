import java.lang.*;
import java.util.*;

interface EventListener{
    void performEvent();
}

interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
} 

interface KeyListener extends EventListener{
    void KeyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener,KeyListener{
    public void mouseClicked(){
        System.out.println("Clicked");
    }
    public void mousePressed(){
        System.out.println("pressed");
    }
    public void mouseReleased(){
        System.out.println("Released");
    }
    public void mouseMoved(){
        System.out.println("Moved");
    }
    public void mouseDragged(){
        System.out.println("Dragged");
    }
    public void KeyPressed(){
        System.out.println("Pressed");
    }
    public void keyReleased(){
        System.out.println("Released");
    }
    public void performEvent(){
        System.out.println("Event");
    }
}
public class Mouse_Keys{
    public static void main(String[] args) {
        EventDemo E=new EventDemo();
        E.KeyPressed();
        E.keyReleased();
        E.mouseClicked();
        E.mouseDragged();
        E.mousePressed();
        E.mouseMoved();
        E.mouseReleased();
        E.performEvent();
    }
}