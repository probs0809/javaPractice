package filehandling;

import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws IOException  {
            FileWriter fw = new FileWriter(FileData.f);
            fw.write(FileData.str+"\n");
            fw.close();

            FileReader fr =new FileReader(FileData.f);
            int i;
            while ((i=fr.read())!=-1) {
                System.out.print((char)i);
            }
            fr.close();
    }
}