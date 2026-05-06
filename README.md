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

  #### Classes we included:
  - User : Represents a general user of the system. It contains basic attributes like userID, name, and password. It provides login functionality and allows users to view notices through the NoticeBoard.
  - Admin : Admin is a specialized type of User (inheritance). It has additional privileges such as adding, updating, and deleting notices. Admin interacts with NoticeBoard and Notice objects to manage system data.
  - Notice : Represents a notice entity in the system. It contains details like noticeID, title, date, content, and category. It supports updating content and displaying notice details.
  - NoticeBoard : Acts as the core service layer that manages all notices using an ArrayList. It provides functionalities like adding notices, removing notices, searching notices by title, and displaying all notices.
  - Category : Represents the category of a notice. Each notice is associated with a category . It contains categoryID and categoryName.
  - File Manager : Handles file operations for persistent storage. It saves notice data into a text file using FileWriter and simulates deletion of notices from storage.
 
  - NoticeController Class :Acts as the REST controller that connects frontend and backend. It handles HTTP requests such as login, add notice, delete notice, update notice, and search notice, and communicates with service classes.

  #### Path for each class in the repository :

  src/

### Frontend:
- HTML5
- CSS3 (Dark Theme UI)
- JavaScript (Fetch API)


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
