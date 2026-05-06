package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.demo.model.*;
import com.example.demo.service.*;

@RestController
@CrossOrigin(origins = "*")
public class NoticeController {

    NoticeBoard board = new NoticeBoard(1, "College Board");
    FileManager fileManager = new FileManager();

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, Object> data) {

        String username = String.valueOf(data.get("username")).trim();
        String password = String.valueOf(data.get("password")).trim();

        System.out.println("LOGIN ATTEMPT -> " + username + " / " + password);

        Map<String, String> res = new HashMap<>();

        if (username.equals("admin") && password.equals("1234")) {
            res.put("role", "admin");
        } 
        else if (username.equals("student") && password.equals("pass")) {
            res.put("role", "user");
        } 
        else {
            res.put("role", "invalid");
        }

        return res;
    }

    
    @PostMapping("/addNotice")
    public String addNotice(@RequestBody Map<String, String> data) {

        try {
            int id = Integer.parseInt(data.get("id"));

            String title = data.get("title");
            String date = data.get("date");
            String content = data.get("content");
            String categoryName = data.get("category");

            Category cat = new Category(1, categoryName);

            Notice notice = new Notice(id, title, date, content, cat);

            board.addNotice(notice);

           
            System.out.println("NEW NOTICE ADDED:");
            notice.displayNotice();

            fileManager.saveFile(notice);

            return "Added Successfully";
        } 
        catch (Exception e) {
            e.printStackTrace();
            return "Error Adding Notice";
        }
    }

   
    @GetMapping("/getNotices")
    public List<Map<String, Object>> getNotices() {

        List<Map<String, Object>> list = new ArrayList<>();

        System.out.println("FETCHING ALL NOTICES...");

        for (Notice n : board.getNotices()) {

            
            n.displayNotice();

            Map<String, Object> m = new HashMap<>();
            m.put("noticeID", n.getNoticeID());
            m.put("title", n.getTitle());
            m.put("date", n.getDate());
            m.put("content", n.getContent());
            m.put("category", n.getCategoryName());

            list.add(m);
        }

        return list;
    }

    
    @DeleteMapping("/deleteNotice/{id}")
    public String deleteNotice(@PathVariable int id) {

        System.out.println("DELETING NOTICE ID: " + id);

        board.removeNotice(id);
        fileManager.deleteFile(id);

        return "Deleted Successfully";
    }


    @PutMapping("/updateNotice/{id}")
    public String updateNotice(@PathVariable int id, @RequestBody Map<String, String> data) {

        System.out.println("UPDATING NOTICE ID: " + id);

        for (Notice n : board.getNotices()) {
            if (n.getNoticeID() == id) {
                n.updateContent(data.get("content"));

                
                System.out.println("UPDATED NOTICE:");
                n.displayNotice();
            }
        }

        return "Updated Successfully";
    }

    @GetMapping("/search")
    public List<Map<String, Object>> search(@RequestParam String title) {

        System.out.println("SEARCHING FOR: " + title);

        List<Map<String, Object>> list = new ArrayList<>();

        for (Notice n : board.searchByTitle(title)) {

            n.displayNotice();

            Map<String, Object> m = new HashMap<>();
            m.put("noticeID", n.getNoticeID());
            m.put("title", n.getTitle());
            m.put("date", n.getDate());
            m.put("content", n.getContent());
            m.put("category", n.getCategoryName());

            list.add(m);
        }

        return list;
    }
}