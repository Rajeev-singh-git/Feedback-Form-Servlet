# 🚀 Feedback Application – Java Servlet Crash Course (`feedback_app`)

A **dynamic Java web application** built using **pure Java Servlets** to collect user feedback.  
This project is based on the **Servlet Crash Course video** and focuses on **core Servlet concepts**.

⚠️ **Not a Spring / Spring Boot application**

---

## 🎯 What This Project Covers

- Java Servlet basics
- Maven web application structure
- HTML form handling using `doPost`
- Session Management
  - Cookies
  - HTTP Session
- Servlet configuration
  - `@WebServlet`
  - `web.xml`
  - `ServletConfig` & `ServletContext`
- JSP-based frontend
- Running Jakarta Servlets on Tomcat 10.1

---

## 🛠️ Tech Stack

- **Java**: 21 or 22
- **Maven**
- **Jakarta Servlet API**: 6.0
- **Apache Tomcat**: 10.1
- **JSP, HTML, Bootstrap**
- **IDE**: Eclipse (Enterprise Java)

---


---

## ▶️ How to Run

### 1️⃣ Prerequisites

- JDK 21 or 22  
- Apache Maven  
- Apache Tomcat 10.1  
- Eclipse IDE (Enterprise Java)

📌 Tomcat 10+ uses **jakarta.servlet**, not `javax.servlet`.

---

### 2️⃣ Clone Repository

```bash
git clone <repo-url>
```

###  3️⃣ Import into Eclipse

File → Open Projects from File System → Select project → Finish

### 4️⃣ Maven Setup (if required)

Right-click project → Maven → Update Project

### 5️⃣ Configure Project Facets

- Dynamic Web Module: 6.0
- Java: 21 or 22
- Runtime: Apache Tomcat 10.1


## 🌐 Access App

http://localhost:8080/feedback_app/

✨ Features

Feedback form (Email, Contact, Message)

Form processing via Servlet doPost

Session tracking using Cookies & HTTP Session

Servlet configuration using annotations and web.xml

