# Student Management Application

A comprehensive Spring Boot web application for managing students, courses, and enrollments with secure authentication and role-based access control.

## Features

- **Student Management**: Add, view, edit, and manage student information
- **Course Management**: Create and manage courses with enrollment tracking
- **Enrollment System**: Students can enroll in courses and view enrollment details
- **Secure Authentication**: User login with Spring Security
- **Responsive Dashboard**: User-friendly interface with course and student statistics
- **Announcements & Reports**: View announcements and generate enrollment reports
- **Course Enrollment Tracking**: View enrolled students and enrollment details

## Tech Stack

- **Backend**: Spring Boot 4.0.3
- **Language**: Java 25
- **Database**: MySQL
- **ORM**: Spring Data JPA (Hibernate)
- **Security**: Spring Security
- **Templating**: Thymeleaf
- **Build Tool**: Maven
- **Frontend**: HTML, CSS, JavaScript

## Prerequisites

- Java 25 or higher
- Maven 3.6+
- MySQL Server 5.7+

## Installation & Setup

### 1. Clone the Repository
```bash
git clone <your-github-repo-url>
cd studentmanagementappProject
```

### 2. Database Setup

Create a MySQL database and user:
```sql
CREATE DATABASE studentmgt;
CREATE USER 'root'@'localhost' IDENTIFIED BY 'your_password';
GRANT ALL PRIVILEGES ON studentmgt.* TO 'root'@'localhost';
FLUSH PRIVILEGES;
```

### 3. Configure Application Properties

Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentmgt
spring.datasource.username=root
spring.datasource.password=your_password
```

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

```bash
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`

## Project Structure

```
src/
├── main/
│   ├── java/com/studentgroupproject/studentmanagementapp/
│   │   ├── StudentManagementApplication.java  (Main entry point)
│   │   ├── config/                            (Configuration classes)
│   │   ├── Controller/                        (Spring MVC controllers)
│   │   ├── dao/                               (Data Access Objects)
│   │   ├── dto/                               (Data Transfer Objects)
│   │   ├── exception/                         (Exception handling)
│   │   ├── model/                             (Entity models)
│   │   ├── repository/                        (Spring Data repositories)
│   │   └── service/                           (Business logic services)
│   └── resources/
│       ├── application.properties              (App configuration)
│       ├── logback-spring.xml                 (Logging configuration)
│       ├── static/                            (CSS, images, JS)
│       │   ├── css/                           (Stylesheets)
│       │   └── images/                        (Images)
│       └── templates/                         (Thymeleaf templates)
└── test/
    └── java/                                  (Unit tests)
```

## Available Pages/Endpoints

- `/login` - User login page
- `/dashboard` - Dashboard with statistics
- `/students` - Student management
- `/courses` - Course management and viewing
- `/enroll-course` - Course enrollment
- `/enrolled-students` - View enrolled students
- `/announcements` - View announcements
- `/reports` - Generate reports
- `/settings` - User settings

## Key Features

### Authentication
- Spring Security integration
- User login and session management
- Password security

### Student Management
- Add new students
- View all students
- Edit student information
- Delete students

### Course Management
- Create new courses
- View course details
- Edit course information
- Track course enrollments

### Enrollment System
- Enroll students in courses
- View enrollment history
- Track enrollment details

## Configuration Files

- `pom.xml` - Maven dependencies and build configuration
- `application.properties` - Spring Boot application configuration
- `logback-spring.xml` - Logging configuration

## Database Schema

The application uses Hibernate JPA for automatic schema generation. Key entities include:
- **Student**: Student information
- **Course**: Course details
- **Enrollment**: Student-Course relationships
- **User**: Authentication users

## Troubleshooting

### Database Connection Issues
- Ensure MySQL server is running
- Verify credentials in `application.properties`
- Check database name matches configuration

### Port Already in Use
- Change server port in `application.properties`:
  ```properties
  server.port=8081
  ```

### Build Failures
- Clear Maven cache: `mvn clean`
- Update dependencies: `mvn dependency:resolve`

## Contributing

1. Create a feature branch (`git checkout -b feature/AmazingFeature`)
2. Commit your changes (`git commit -m 'Add AmazingFeature'`)
3. Push to the branch (`git push origin feature/AmazingFeature`)
4. Open a Pull Request

## License

This project is open source and available under the MIT License.

## Contact & Support

For support and questions, please create an issue in the repository.

---

**Last Updated**: March 2026
