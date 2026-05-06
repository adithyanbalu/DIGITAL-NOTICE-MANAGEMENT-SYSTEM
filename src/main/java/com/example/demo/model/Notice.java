package com.example.demo.model;

public class Notice{
    private int noticeID;
    private String title;
    private String date;
    private String content;
    private Category category;

    public Notice(int noticeID, String title, String date, String content, Category category) {
        this.noticeID = noticeID;
        this.title = title;
        this.date = date;
        this.content = content;
        this.category = category;
    }

    public int getNoticeID() {
        return noticeID;
    }

    public String getTitle() {
        return title;
    }

    public void updateContent(String content) {
        this.content = content;
    }
    public void displayNotice() {
        System.out.println("ID: " + noticeID);
        System.out.println("Title: " + title);
        System.out.println("Date: " + date);
        System.out.println("Content: " + content);
        System.out.println("Category: " + category.getCategoryName());
        System.out.println("------------------------");
    }
    public String getCategoryName() {
        return category.getCategoryName();
    }
    public String getDate() { 
        return date; 
    }
    public String getContent() { 
        return content; 
    }
}