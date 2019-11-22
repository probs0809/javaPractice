package filehandling;

import java.io.*;
import java.sql.Date;

import filehandling.*;

public class BufferedExample{
    public static void main(String[] args) throws IOException, InterruptedException {
        
        FileWriter fw = new FileWriter(FileData.f); 
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(FileData.str+"\n");
        bw.close();
        fw.close();

        Thread.sleep(3000);
        
        FileReader fr = new FileReader(FileData.f);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s=br.readLine() )!= null){
            System.out.print(s);
        }
        System.out.print("\n"+new Date(FileData.f.lastModified())+"\n");
        br.close();
        fr.close();
    }
}