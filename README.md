# ReportGenerator
# Report Generator Application
This repository contains a simple **report generator web application** built using the following technologies:

- **Spring MVC**: Provides the web framework for handling HTTP requests and responses.
- **Spring Data JPA**: Simplifies database operations by providing a CRUD API.
- **MySQL**: The database system where report data is stored.
- **JSTL (JavaServer Pages Standard Tag Library)**: Used for rendering dynamic content in JSP views.
- **Bootstrap**: Enhances the application's user interface.
- **HTML**: The markup language for creating web pages.
- **Tomcat Server**: The web server that hosts our application.

## Application Features

1. **Plan Information**:
   - Users can input plan names, plan status, gender, start date, and end date.
   - The application stores this information in the MySQL database.

2. **Search Option**:
   - Users can search for specific plan details based on their input criteria.
   - The application retrieves relevant data from the database.

3. **Report Generation**:
   - Based on user input, the application generates reports.
   - Report data is fetched from the database and presented to the user.

## Project Structure

- `src/main/java`: Contains Java source code.
  - `com.example.reportgenerator`: Your application package.
    - `controller`: Spring MVC controllers.
    - `model`: Entity classes (e.g., `Plan`).
    - `repository`: Spring Data JPA repositories (e.g., `PlanRepository`).
    - `service`: Business logic (e.g., `PlanService`).
- `src/main/resources`: Configuration files.
  - `application.properties`: Database configuration.
  - `static`: Static resources (CSS, JS).
  - `templates`: JSP views (e.g., `customer-form.jsp`, `list-customers.jsp`).

## Getting Started

1. Clone this repository.
2. Set up your MySQL database and update `application.properties`.
3. Run the application using Tomcat or your preferred server.
4. Access the application via the provided URL.
