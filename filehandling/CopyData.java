package filehandling;

import java.io.*;

public class CopyData{
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("output2.txt");
        DataInputStream br = new DataInputStream(fr);
        FileOutputStream fw = new FileOutputStream("output.txt");
        DataOutputStream dos = new DataOutputStream(fw);
        int i;
        while((i=br.read())!=-1){
           dos.write((char)i);
        }

        fr.close();
        fw.close();
    }
}