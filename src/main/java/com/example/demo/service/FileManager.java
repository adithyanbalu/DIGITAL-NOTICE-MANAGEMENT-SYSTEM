package com.example.demo.service;
import java.io.FileWriter;
import java.io.IOException;
import com.example.demo.model.Notice;
public class FileManager {

    public void saveFile(Notice n) {
        try{
            FileWriter fw = new FileWriter("C:\\Users\\Adithyan B\\Documents\\notices.txt",true);
            fw.write("ID: " + n.getNoticeID() + "\n");
            fw.write("Title: " + n.getTitle() + "\n");
            fw.write("Content: " + n.getContent() + "\n");
            fw.write("----------------------\n");
            fw.close();

        }catch(IOException e){
            System.out.println("Error saving file");

        }
    }

    public void deleteFile(int noticeID) {
        System.out.println("Deleting file for notice ID: " + noticeID);
    }
}