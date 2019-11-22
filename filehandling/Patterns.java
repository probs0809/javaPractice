package filehandling;

import java.io.*;

public class Patterns{
    public static void main(String[] args) throws IOException {
        FileOutputStream fw = new FileOutputStream("output.txt");
        DataOutputStream dos = new DataOutputStream(fw);
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j<=i; j++){
                dos.write(" *".getBytes(),0,2);
            }
            dos.write('\b');
            dos.write('\n');
        }
        
        fw.close();
    }
}