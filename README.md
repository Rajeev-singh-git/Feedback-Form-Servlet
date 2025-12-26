# 🚀 Feedback Application – Java Servlet Crash Course (`feedback_app`)

A **dynamic Java web application** built using **pure Java Servlets** to collect user feedback.  
This project focuses on **Servlet fundamentals** and intentionally avoids Spring to build a strong understanding of how Java web applications work at the core level.

⚠️ **Not a Spring / Spring Boot application**

This project is intentionally built using raw Servlets and JSP to understand the mechanics that frameworks like **Spring MVC abstract away** (request handling, sessions, filters, dispatching, configuration).

---

## 🎯 What This Project Covers

- Servlet lifecycle and request handling

- Maven-based WAR project structure

- HTML form handling using `doPost`

- Request flow control using `RequestDispatcher` (server-side forward)

- Session Management
  
  - Custom cookies
  
  - HTTP Session (server-managed session with `JSESSIONID`)

- Authentication / access control using Servlet Filters

- Servlet configuration
  
  - `@WebServlet`
  
  - `web.xml`
  
  - `ServletConfig` vs `ServletContext`

- JSP-based frontend with EL

- Jakarta Servlet API usage (Tomcat 10+)

- Running Servlets on Apache Tomcat 10.1

---

## 🛠️ Tech Stack

- **Java**: 21 or 22

- **Maven**

- **Jakarta Servlet API**: 6.0

- **Apache Tomcat**: 10.1

- **JSP, HTML, Bootstrap**

- **IDE**: Eclipse (Enterprise Java)

📌 Tomcat 10+ uses `jakarta.servlet.*`, not `javax.servlet.*`.

---

## ▶️ How to Run

### 1️⃣ Prerequisites

- JDK 21 or 22

- Apache Maven

- Apache Tomcat 10.1

- Eclipse IDE (Enterprise Java)

---

### 2️⃣ Clone Repository

```md
git clone <repo-url>
```

---

### 3️⃣ Import into Eclipse

```java
File → Open Projects from File System → Select project → Finish
```

---

### 4️⃣ Maven Setup (if required)

Right-click project → **Maven → Update Project**

---

### 5️⃣ Configure Project Facets

- **Dynamic Web Module**: 6.0

- **Java**: 21 or 22

- **Runtime**: Apache Tomcat 10.1

---

## 🌐 Access Application

`http://localhost:8080/feedback_app/`

---

## ✨ Features

- Feedback form (Email, Phone, Message)

- Form submission handled via Servlet `doPost`

- Server-side MVC flow using `RequestDispatcher.forward()`

- Session tracking using:
  
  - Custom cookies
  
  - HTTP Session with container-managed `JSESSIONID`

- Authentication/authorization demonstration using Servlet Filters

- Centralized and per-servlet configuration via `web.xml` and annotations

---

## 🧠 Architectural Note

This project demonstrates **how web applications work before frameworks**:

```java
Browser → Filter  → Servlet (Controller)
                  → RequestDispatcher.forward() 
                  → JSP (View)
```


