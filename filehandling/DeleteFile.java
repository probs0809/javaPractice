package filehandling;

import java.io.*;
public class DeleteFile{
    public static void main(String[] args) {
        new File("toBeDeleted").renameTo(new File("NewFile"));
    }
}