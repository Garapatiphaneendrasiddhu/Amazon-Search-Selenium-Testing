# Selenium Amazon Web Scraper

## Project Overview

This project automates searching for mobile phones on **Amazon India** using **Selenium WebDriver** with **Java**. The script performs a search, applies product filters (4-star rating & price range ₹10,000 - ₹20,000), and extracts relevant product details.

## Features

- Automates **Amazon search functionality** for mobile phones.
- Applies **4-star rating filter** and **price range selection**.
- Uses **dynamic waits (WebDriverWait)** for reliable execution.
- Implements **XPath locators** for interacting with web elements.

## Technologies Used

- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Browser:** Chrome (with ChromeDriver)
- **Frameworks:** TestNG (if applicable)
- **Build Tool:** Maven (if applicable)

## Preview



## Prerequisites

Before running the script, ensure you have the following installed:

1. **Java (JDK 8 or later)**
2. **Selenium WebDriver**

## Installation Steps

1. **Clone this repository:**
   ```sh
   git clone https://github.com/your-repo/selenium-amazon-scraper.git
   ```
2. **Download and Install ChromeDriver:**
   - Visit [ChromeDriver](https://chromedriver.chromium.org/downloads)
   - Extract and place the executable in a known directory
3. **Set up dependencies:**
   - If using Maven, add Selenium dependencies to `pom.xml`:
     ```xml
     <dependency>
         <groupId>org.seleniumhq.selenium</groupId>
         <artifactId>selenium-java</artifactId>
         <version>4.8.0</version>
     </dependency>
     ```
4. **Update ChromeDriver path in the script:**
   ```java
   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
   ```
5. **Run the script:**
   ```sh
   mvn test  # If using Maven
   java -cp . Seleniumscript  # If running manually
   ```

## Expected Output

- The script will launch **Amazon India** in a browser.
- It will search for **"mobile"** and apply **filters**.
- The first few product details will be displayed (if implemented).

## Troubleshooting

- Ensure **ChromeDriver** is compatible with your **Google Chrome version**.
- If elements are not found, update **XPath locators** based on the latest Amazon UI.
- Use `driver.quit();` in a **finally block** to prevent browser sessions from staying open.

## License

This project is open-source and available for modification. Feel free to contribute!

