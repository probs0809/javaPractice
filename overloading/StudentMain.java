 /*
        - NO FUCKS GIVEN 
        - DON'T THANK ME, JUST BUY ME BUDWEISER 
        - I DON'T KNOW WHY THIS CODE WORKS, BUT IT WORKS
          /\
         /  \        AUTHOR: 'MAYEKAR PRABODH BHALCHANDRA'
        /    \       Email : prabodhmayekar@gmail.com
       /      \      INSTA : blind_coder_0809
      /        \     Facebook : 'Prabodh Mayekar'
     /__________\    GITHUB: probs0809
*/
 import java.util.*;

class StudentData{
    private int stuID;
    private String stuName;
    private int stuAge;
    StudentData(){
        stuID = 100;
        stuName = "New Student";
        stuAge = 18;
    }
    StudentData(int stuID, String stuName, int stuAge){
        this.stuID = stuID;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }
    public int getStuID() {
        return stuID;
    }
    public void setStuID(int stuID) {
        this.stuID = stuID;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public int getStuAge() {
        return stuAge;
    }
    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }


}

public class StudentMain{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        StudentData myobj = new StudentData();
        System.out.println("Student Name is: "+myobj.getStuName());
        System.out.println("Student Age is: "+myobj.getStuAge());
        System.out.println("Student ID is: "+myobj.getStuID());
        
        System.out.println("Enter The Age: ");
        int age = s.nextInt();
        System.out.println("Enter The Name: ");
        String name = s.next();
        System.out.println("Enter The ID: ");
        int id = s.nextInt();

        
        
        StudentData myobj2 = new StudentData(id, name, age);
        System.out.println("Student Name is: "+myobj2.getStuName());
        System.out.println("Student Age is: "+myobj2.getStuAge());
        System.out.println("Student ID is: "+myobj2.getStuID()); 
    }
}