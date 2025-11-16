# 🎓 Student Manager – Spring Boot CRUD Application

A simple and clean **Student Management System** built using  
**Java 17, Spring Boot 3, PostgreSQL, Hibernate, and Thymeleaf**.  
This project demonstrates a complete CRUD (Create, Read, Update, Delete) flow with a responsive UI using Bootstrap.

---

## 🚀 Features

- ➕ Add New Student
- ✏️ Edit Student Details
- ❌ Delete Student
- 📄 List All Students
- 🎨 Clean and responsive UI (Bootstrap)

---

## 🛠️ Tech Stack

| Technology | Purpose |
|-----------|----------|
| **Java 17** | Main programming language |
| **Spring Boot 3** | Backend framework |
| **Spring Data JPA** | ORM & database operations |
| **Hibernate** | JPA implementation |
| **PostgreSQL 18** | Database |
| **Thymeleaf** | HTML template engine |
| **Bootstrap 5** | Styling and responsive UI |

---

## 🏗️ Project Structure

```
student-crud/
 ├── src/main/java/com/mukesh/studentapp/
 │      ├── controller/
 │      ├── model/
 │      ├── repository/
 │      └── service/
 ├── src/main/resources/templates/
 │      ├── index.html
 │      ├── student_form.html
 ├── src/main/resources/application.properties
 └── pom.xml
```

---

## ⚙️ Database Configuration

Inside `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=studuser
spring.datasource.password=studpass
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

Make sure PostgreSQL is running on port **5432**  
and your user has proper permissions:

```sql
GRANT ALL PRIVILEGES ON DATABASE studentdb TO studuser;
GRANT ALL PRIVILEGES ON SCHEMA public TO studuser;
ALTER USER studuser WITH SUPERUSER;
```

---

## ▶️ How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/YOUR_USERNAME/student-crud.git
   ```
2. Open in IntelliJ
3. Run `StudentCrudApplication.java`
4. Open browser:  
   👉 http://localhost:8080

---

## 📸 Screenshots

### Home Page
(Add screenshot here)

---

## 📦 Future Enhancements

- 🔐 Add login & authentication
- 🔍 Implement search and filters
- 📊 Add dashboard and analytics

---

## 👨‍💻 Author

**Mukesh S M**  
💼 B.Tech AI & DS  
🔥 Passionate about full-stack development & AI

---

⭐ If you like this project, give the repo a **star**!
