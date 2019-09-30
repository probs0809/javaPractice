class ClassOne{
    void hello(){
        System.out.print("Hello");
    }
}

class ClassTwo extends ClassOne{
    void world(){
        System.out.println(" World");
    }
}

public class SingleLevel{
    public static void main(String[] args) {
        ClassTwo c = new ClassTwo();
        c.hello();
        c.world();
    }
}