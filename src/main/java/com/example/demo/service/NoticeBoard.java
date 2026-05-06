package com.example.demo.service;
import java.util.ArrayList;
import com.example.demo.model.Notice;
import com.example.demo.model.Category;



public class NoticeBoard {
    private int boardID;
    private String boardName;
    private ArrayList<Notice> notices;

    public NoticeBoard(int boardID, String boardName) {
        this.boardID = boardID;
        this.boardName = boardName;
        this.notices = new ArrayList<>();
    }

    public void addNotice(Notice n) {
        notices.add(n);
        notifyUsers();
    }

    public void removeNotice(int noticeID) {
        notices.removeIf(n -> n.getNoticeID() == noticeID);
    }

    public void getAllNotices() {
        for (Notice n : notices) {
            n.displayNotice();
        }
    }

    public void notifyUsers() {
        System.out.println("New notice added!");
    }

    public ArrayList<Notice> searchByTitle(String title) {
        ArrayList<Notice> result = new ArrayList<>();
        for (Notice n : notices) {
            if (n.getTitle().equalsIgnoreCase(title)) {
                result.add(n);
            }
        }
        return result;
    }
    public ArrayList<Notice> getNotices(){
        return notices;
    }
}