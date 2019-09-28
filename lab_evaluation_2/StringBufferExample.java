

public class StringBufferExample{
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello This is Prabodh");
        System.out.println("Initial String = "+s);

    
        //function 1
        s.insert(6,"World ");
        System.out.println("1. insert(6,\"World\") = "+s);

        //function 2
        
        System.out.println("2. CharAt(5) = " + s.charAt(6));

        //function 3
        System.out.println("3. indexOf(\"This\") = " + s.indexOf("This"));

        //function 4
        s.deleteCharAt(12);
        System.out.println("4. deleteCharAt(12) = "+s);

        //function 5
        s.delete(0, 10);
        System.out.println("5. delete(0, 10) = "+s);
    }
}