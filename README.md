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
<img width="1365" height="650" alt="image" src="https://github.com/user-attachments/assets/a0d91967-5035-4436-9a3a-f38216f6e6c6" />
<img width="1364" height="648" alt="image" src="https://github.com/user-attachments/assets/c9c68cbb-7bdf-4d58-8862-eee79ced26e0" />
<img width="1366" height="647" alt="image" src="https://github.com/user-attachments/assets/69631c27-8b6e-4948-8db2-2cc608674d11" />
<img width="1011" height="105" alt="image" src="https://github.com/user-attachments/assets/1e35b27a-42d2-4ac2-bba7-f8a768e46039" />
<img width="1362" height="646" alt="image" src="https://github.com/user-attachments/assets/6d998178-776c-4ddc-8512-1552ec99c078" />
<img width="1364" height="647" alt="image" src="https://github.com/user-attachments/assets/f471a607-4dbe-4da9-9077-00db2e060c57" />
<img width="1366" height="646" alt="image" src="https://github.com/user-attachments/assets/96f062b8-ac0d-4026-b672-7a3c9b9614a4" />
<img width="1054" height="166" alt="image" src="https://github.com/user-attachments/assets/30b0f6c5-c103-496a-9979-1d7c87d2e70e" />


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
