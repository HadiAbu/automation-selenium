# Selenium + TestNG Automation Tests

This repository contains a collection of automated UI tests built using **Selenium WebDriver**, **TestNG**, and **Java**, managed with **Maven**.  
The tests cover common web application scenarios and serve as both a **practice project** and an **interview-ready portfolio** for QA automation roles.

---

## 🔹 Project Overview

- **Language:** Java 17  
- **Frameworks:** Selenium WebDriver, TestNG  
- **Build Tool:** Maven  
- **Driver Management:** WebDriverManager  
- **CI/CD Ready:** Compatible with Maven build pipelines

This project demonstrates essential automation concepts, including:

- Page navigation and title validation  
- Form input and login validation  
- Checkboxes, radio buttons, and dropdown handling  
- Table data validation  
- Alerts and popup handling  
- Mouse hover actions and tooltips  
- Reusable TestNG setup with `@BeforeClass` and `@AfterClass`  

---
## 🔹 Key Features Demonstrated
| Feature                    | Description                                    |
| -------------------------- | ---------------------------------------------- |
| Page Navigation            | Validate titles and URLs                       |
| Forms & Login              | Test login functionality with validations      |
| Checkboxes & Radio Buttons | Select and verify checkbox/radio button states |
| Dropdowns                  | Select options and verify selection            |
| Tables                     | Validate dynamic table data                    |
| Alerts & Popups            | Handle JS alerts and confirm dialogs           |
| Mouse Actions / Hover      | Hover over elements and validate tooltips      |


---

## 🔹 Prerequisites

- Java 17 or higher installed  
- Maven installed and configured in PATH  
- Chrome browser installed (WebDriverManager will handle drivers automatically)  

---

## 🔹 How to Run Tests

1. **Clone the repository:**
   
   git clone https://github.com/your-username/automation-selenium.git
   cd automation-selenium
 

2. **Run tests with Maven:**

   mvn clean test

3. **Run a specific TestNG suite (optional):**

   mvn test -DsuiteXmlFile=testng.xml
