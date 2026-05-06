package com.example.demo.model;
import com.example.demo.model.User;
import com.example.demo.service.NoticeBoard;

public class Admin extends User {

    public Admin(int userID, String name, String password) {
        super(userID, name, password);
    }

    public void addNotice(NoticeBoard board, Notice n) {
        board.addNotice(n);
    }

    public void deleteNotice(NoticeBoard board, int noticeID) {
        board.removeNotice(noticeID);
    }

    public void updateNotice(Notice n, String content) {
        n.updateContent(content);
    }
}
