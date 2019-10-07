
class ClassOne {
    void display(){
        System.out.println("Hello World from ClassOne");
    }
}

class ClassTwo{
    void display(){
        System.out.println("Hello World from ClassTwo");
    }
}

public class OverR{
    public static void main(String[] args) {
        ClassTwo c = new ClassTwo();
        c.display();
    }
}