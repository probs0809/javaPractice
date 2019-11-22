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
package exceptionhandling;

import java.util.ArrayList;

class StudentData{
    String sName;
    int rollNo;
    int sub1;
    int sub2;
    int sub3;

    StudentData(String sName, int rollNo, int sub1, int sub2, int sub3){
        this.sName = sName;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public String getName(){
        return this.sName;
    }

    public int getRollno(){
        return this.rollNo;
    }

    public int getSub1() throws Exception{
        if(this.sub1 > 40 || this.sub1 < 0){
            throw new Exception("Marks in appropriate");
        }
        return this.sub1;
    }

    public int getSub2() throws Exception{
        if(this.sub2 > 40 || this.sub2 < 0){
            throw new Exception("Marks in appropriate");
        }
        return this.sub2;
    }

    public int getSub3() throws Exception{
        if(this.sub3 > 40 || this.sub3 < 0){
            throw new Exception("Marks in appropriate");
        }
        return this.sub3;
    }
}

public class Main{
    public static void main(String[] args) {
        ArrayList<StudentData> stuData = new ArrayList<>();
        stuData.add(new StudentData("Prabodh", 50, 30, 30, 20));
        stuData.add(new StudentData("Prabodh2", 22, 30, 30, 20));
        stuData.add(new StudentData("Prabodh3", 23, 30, 30, 20));
        stuData.add(new StudentData("Prabodh4", 24, 30, 40, 20));//exception
        stuData.add(new StudentData("Prabodh5", 25, -1, 30, 20));//exception

        System.out.println("Stu Name    Roll No     Sub 1       sub 2       sub 3");
        for(int i = 0 ; i < stuData.size();i++){
            try{
                System.out.println(stuData.get(i).getName()+"        "+stuData.get(i).getRollno()+"     "+stuData.get(i).getSub1()+"       "+stuData.get(i).getSub2()+"       "+stuData.get(i).getSub3());
            }catch(Exception e){
                System.out.println("Marks should not be less then 0 or > the 40");
            }
        }

    }
}