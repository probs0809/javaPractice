package filehandling;

import java.io.*;

public class FilesOutputStream {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileOutputStream fos = new FileOutputStream(FileData.f);
        //DataOutputStream dos = new DataOutputStream(fos); 
        DataInputStream dis = new DataInputStream(System.in); 
       
        //dos.writeBytes("Hello World");
        
        //dos.close();
        String condition = "hello";
        while (!condition.equals("stop")) {
            condition = dis.readLine();
            new DataOutputStream(System.out).write(condition.getBytes());
            fos.write(condition.getBytes());
            fos.flush();
        }

        dis.close();
        fos.close();

        

    }
}