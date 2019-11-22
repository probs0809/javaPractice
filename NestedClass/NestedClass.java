package nestedclass;

class OuterClass{
    int x = 10;
    int y = 11;
    OuterClass(){
        System.out.println(x + y);
        InnerClass i = new InnerClass();
        i.Sum(x,y);
    }
    class InnerClass{
        void Sum(int x, int y){
            System.out.println(x + y);
        }
    }

    static class StaticInnerClass{
        void Sum(int x,int y){
            System.out.println(x + y);
        }
    }
}

public class NestedClass{
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass i = o.new InnerClass();
        OuterClass.StaticInnerClass oi = new OuterClass.StaticInnerClass();
        oi.Sum(9123, 123);
        i.Sum(100, 10000);
    }
}