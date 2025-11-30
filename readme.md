# 🏥 Hospital Management System – Doctor Portal
![Java](https://img.shields.io/badge/Java-blue?style=for-the-badge&logo=java&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-green?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-blue?style=for-the-badge&logo=mysql&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-orange?style=for-the-badge&logo=netbeans&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-purple?style=for-the-badge&logo=java&logoColor=white)

A secure, desktop-based **Hospital Management System (Doctor Portal)** built using **Java (Swing)** and **MySQL**.

This system centralizes a doctor's professional activities, allowing them to efficiently manage their **personal profile**, handle **patient appointments**, and organize their **academic research papers**—all within a single, intuitive interface. It is architected using robust **Object-Oriented Programming (OOP)** principles.

-----

## 🚀 Features Overview

### **1. Doctor Profile Management**

  * **Dynamic Loading:** Profile details are dynamically loaded upon login via the Doctor ID.
  * **Comprehensive View:** Displays essential information like profile picture, name, specialization, and qualifications.
  * **Data Persistence:** Allows doctors to update their personal and professional details, storing changes securely in the MySQL database.

### **2. Appointment Management**

  * **Integrated Scheduling:** Features a built-in calendar view for visual planning.
  * **CRUD Operations:** Doctors can easily **Add**, **Edit**, and **Delete** scheduled appointments.
  * **Patient Details:** Shows critical patient information (Name, ID, Contact) for each appointment.
  * **Real-Time Updates:** On-spot changes are efficiently updated in the database, ensuring accurate daily scheduling.

### **3. Research Paper Management**

  * **Document Upload:** Provides functionality to upload new academic research papers (e.g., PDF files).
  * **Paper Log:** Maintains a list of all submitted papers associated with the doctor's account.
  * **Management:** Allows doctors to view and delete submitted papers as needed.

-----

## 🛠️ Tech Stack & Architecture

| Technology | Purpose |
| :--- | :--- |
| **Java (Swing, AWT)** | Desktop GUI Development / Core Application Logic |
| **JDBC** | Standard API for Database Connectivity |
| **MySQL** | Backend Relational Data Storage |
| **NetBeans IDE** | Development Environment and Project Management |
| **OOP Concepts** | Architectural Foundation for maintainability and scalability |

-----

## 📦 Folder Structure

```
HospitalManagementSystem/
   ├── DoctorPortalProject/     (NetBeans Project Folder)
        ├── src/              (All Java Source Files)
        └── lib/              (MySQL Connector JAR file)
   ├── doctor database/
        └─gargi.sql          (SQL Database Export File)
   ├──  README.md              (This Documentation)
```

-----

## 🗄️ Database (MySQL)

The database structure is included in the export file: **/doctor database/gargi.sql**.

It contains the following tables:

  * **`Doctor`**: Stores doctor profiles and credentials.
  * **`Patient`**: Stores registered patient details.
  * **`Appointment`**: Manages scheduling data, linked to Doctor and Patient IDs.
  * **`Research`**: Logs research paper metadata (title, file path, date).

*Note: No sensitive MySQL username/password is included in the repository, making it safe for platforms like GitHub.*

-----

## 🔧 How to Run the Project

### **1. Import MySQL Database**

1.  Open MySQL Workbench (or your preferred client).
2.  Execute the following command to create the required database:
    ```sql
    CREATE DATABASE gargi;
    ```
3.  Import the file **gargi.sql** from the project's `doctor database` folder into the newly created `gargi` database.

### **2. Update Database Connection in Java**

Locate the `DBConnection.java` or `dbconfig.properties` file in the source code. Update the credentials to match your local MySQL setup:

```java
// dbconfig.properties or DBConnection.java
String url = "jdbc:mysql://localhost:3306/gargi";
String user = "root";          // <-- Change to your MySQL username
String password = "";          // <-- Enter your MySQL password
```

### **3. Run the Program**

1.  Open **NetBeans IDE**.
2.  Select **Open Project** and choose the `DoctorPortalProject` folder.
3.  Ensure the `mysql-connector-java.jar` file is correctly added to the project's **Libraries** (usually found in the `lib` folder).
4.  Run the main application by executing the class: `dashboard.login_doc.java`.

-----

## 🧠 OOP Concepts Applied

The system's architecture is built upon the four pillars of OOP:

  * **Encapsulation:** Data security is maintained by declaring all variables as `private` and controlling access via public `getter` and `setter` methods.
  * **Abstraction:** The system is separated into distinct layers: **UI (Swing forms)**, **Model (data objects)**, and **Database (DBConnection class)**, hiding complex internal details.
  * **Inheritance:** Base classes (e.g., `User` or `Person`) are extended by specific classes (e.g., `Doctor` or `Patient`) to reuse properties and methods.
  * **Polymorphism:** Method overriding is used to implement different behaviors for similar actions, such as handling data loading logic for different entity types (Doctors vs. Appointments).

-----

## ✨ Future Improvements

  * Implement a separate **Patient Login Portal** to view appointments and records.
  * Develop a dedicated **Admin Dashboard** for system-wide management.
  * Integrate an **Online Appointment System** accessible via web or mobile interface.
  * Add **Real-time Notifications** for new appointments or profile updates.

-----

## 🤝 Contributing

We welcome contributions to improve the system.

For major changes or new features, please open an issue first to discuss the proposed improvements. You can then submit a pull request with your changes.
