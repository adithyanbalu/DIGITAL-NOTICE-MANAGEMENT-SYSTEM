#  Digital Notice Management System

A full-stack web application built using **Spring Boot (Backend)** and **HTML, CSS, JavaScript (Frontend)** for managing college notices efficiently.

This project demonstrates **Object-Oriented Programming concepts**, **REST API communication**, and **file-based storage system**.


##  Features

###  Admin
- Add Notice
- Update Notice content
- Delete Notice
- View all notices

###  User
- View notices
- Filter by category
- Simple dashboard view

---

##  Technologies Used

### Backend:
- Java
- Spring Boot
- REST API
- ArrayList (In-memory storage)
- File Handling (FileWriter)
- Exception Handling


  ####  Class Description

- **User** → Basic user with login and view notice feature  
- **Admin** → Extends User, can add, update, and delete notices  
- **Notice** → Stores notice details like title, content, date, category  
- **NoticeBoard** → Manages all notices using ArrayList  
- **Category** → Represents notice category   
- **FileManager** → Handles saving notice data into file
 
- **NoticeController** → Handles API requests and connects frontend with backend  
 
  #### Path for each class in the repository :

  src/main/java/com/example/demo/controller : - NoticeController.java
  src/main/java/com/example/demo/model : - Admin.java
                                         - User.java
                                         - Category.java
                                         - Notice.java
  src/main/java/com/example/demo/service : - NoticeBoard.java
                                           - FileManager.java

### Frontend:
- HTML5
- CSS3 (Dark Theme UI)
- JavaScript (Fetch API)

  #### Path for UI code in the repository :
  src/main/resources/static : index.html


## 🔗 API Endpoints

- POST `/login` → Login
- POST `/addNotice` → Add notice
- GET `/getNotices` → View notices
- DELETE `/deleteNotice/{id}` → Delete notice
- PUT `/updateNotice/{id}` → Update notice
- GET `/search?title=` → Search notice


##  Architecture Flow

Frontend → Controller → NoticeBoard → FileManager → Response

---

##  File Storage

### File Name:
-notices.txt
In the File Manager Class , actual path is there . For Reference, the file notice.txt is inserted in the repository 

---

##  File Handling Logic

- Uses FileWriter in append mode
- Each notice stored as a new line
- Data persists even after server restart

---

##  OOP Concepts Used

- Encapsulation 
- Inheritance 
- Association 
- Aggregation 

---

##  Note
This project is developed for academic evaluation and demonstrates backend logic, frontend integration, and OOP principles.

This Digital Notice Management System is developed and successfully completed by **Group 12, CSE-A** as part of the academic curriculum.
- **ADITHYAN B**
- **ROBIN ANTONY**
- **MADHAV A**
- **ALI ADNAN THAHA**
