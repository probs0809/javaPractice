package filehandling;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputOutput {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream(FileData.f);
        FileInputStream fis2 = new FileInputStream("output2.txt");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("system.out"));
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        int i;
        while ((i=sis.read()) != -1) {
            dos.write(i);

            System.out.print((char)i);
        }
        fis1.close();
        fis2.close();

    }
}