package com.example.demo.model;
import com.example.demo.service.NoticeBoard;
public class User {
    protected int userID;
    protected String name;
    protected String password;

    public User(int userID, String name, String password) {
        this.userID = userID;
        this.name = name;
        this.password = password;
    }

    public boolean login(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }

    public void viewNotice(NoticeBoard board) {
        board.getAllNotices();
    }
}
