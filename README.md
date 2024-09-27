# DataEntryApp

This is a simple data entry application built using **Spring Boot** and **Thymeleaf**. 
The application allows users to enter details such as **Name**, **Age**, **Title**, and **Hometown**. 
Upon form submission, the data is displayed on a confirmation page along with a list of all previously entered data.

## Features

- A form with inputs for **Name**, **Age**, **Title**, and **Hometown**.
- **Name** and **Title** are required fields. If these fields are not entered, the user will receive an error message.
- A **confirmation page** displays the entered information as well as previous entries.
- A button on the confirmation page allows the user to return to the form.

## Tech Stack

- **Backend**: Spring Boot (Java)
- **Frontend**: Thymeleaf for rendering HTML pages
- **Validation**: Spring Boot validation
- **CSS**: Basic styling for form and buttons
- **No Database**: The application uses an in-memory list to store previous entries, which means the data is lost when the application is stopped.

## How to Run the Application in teminal

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Sainath9999660/DataEntryApp.git
   cd DataEntryApp

2. Build and run the application(Make sure java and maven are installed and port 8080 is available
     ```bash
    mvn spring-boot:run

3. Access the application on http://localhost:8080/
4. Enter the data and test

## How to run the Application in ide
  Go to the cloned repository and then run the application. Access the application on http://localhost:8080/
