# NopCommerce Automation Project

![Selenium](https://img.shields.io/badge/Selenium-4.18.1-blue?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-3.9.0-red?style=for-the-badge)
![TestNG](https://img.shields.io/badge/TestNG-7.9.0-green?style=for-the-badge)

---

## 🚀 Project Overview

This project is an **end-to-end automation framework** for the [NopCommerce Demo Website](https://demo.nopcommerce.com/) using **Selenium WebDriver**, **Java**, **Maven**, and **TestNG**.  
It automates critical e-commerce functionalities including **login**, **product search**, **adding to cart**, and **validation checks**.

**Timeline:** December 2025 – Present

---

## 📂 Project Structure

```
src/test/java
 ├── base
 │    └── BaseTest.java          # WebDriver setup and teardown
 ├── pages
 │    ├── LoginPage.java         # Login page actions
 │    ├── SearchPage.java        # Product search actions
 │    └── CartPage.java          # Add to cart & validations
 └── tests
      └── NopCommerceTest.java   # End-to-end TestNG test cases
```

---

## 🔹 Features

- Login automation
- Product search and selection
- Add to cart and validate quantity
- Page Object Model (POM) design for maintainable code
- TestNG integration for structured test execution
- Assertions for reliable validation

---

## 🛠️ Technologies Used

| Technology         | Version       |
| ------------------ | ------------- |
| Selenium WebDriver | 4.18.1        |
| Java               | 17            |
| Maven              | 3.9.0         |
| TestNG             | 7.9.0         |
| WebDriverManager   | 5.6.3         |
| Browser            | Google Chrome |

---

## ⚡ Getting Started

### Prerequisites

- Java JDK 17+
- Maven 3+
- Eclipse IDE (or IntelliJ IDEA)
- Google Chrome

### Setup Steps

1. Clone the repository:

```bash
git clone https://github.com/yourusername/NopCommerceAutomation.git
```

2. Navigate to the project directory:

```bash
cd NopCommerceAutomation
```

3. Run Maven to download dependencies:

```bash
mvn clean install
```

4. Execute TestNG tests:

```bash
mvn test
```

---

## 📝 Sample Test Flow

1. Open the NopCommerce demo website
2. Login with valid credentials
3. Search for a product (e.g., MacBook)
4. Add the product to the cart
5. Validate the cart quantity
6. End the test

---

## 📌 Key Learnings

- Building **robust automation framework** with Maven + TestNG
- Implementing **Page Object Model** for scalable test code
- Writing reusable Selenium actions for maintainability
- Using **Assertions** for verification and validation
- Understanding real-world **e-commerce workflows**

---

## 📬 Contact / Support

For issues or suggestions, contact:  
**Name:** Sami Alam  
**Email:** samialam5671@gmail.com

---
