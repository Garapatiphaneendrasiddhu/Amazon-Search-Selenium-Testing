package com.amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable (download from https://chromedriver.chromium.org/)
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium web\\chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Amazon India
            driver.get("https://www.amazon.in/");

            // Verify landing page title
            String title = driver.getTitle();
            System.out.println("Page Title: " + title);

            // Search for "mobile"
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
            driver.findElement(By.id("twotabsearchtextbox")).submit();

            // Select 4-star filter
            driver.findElement(By.xpath("//span[text()='4 stars & up']")).click();

            // Select price range (modify XPath as needed based on actual UI)
            driver.findElement(By.xpath("//span[text()='₹10,000 - ₹20,000']")).click();

            // Click on the first search result (demonstration, avoid actual purchase)
            // driver.findElement(By.xpath("(//div[@class='s-product-grid__item'])[1]")).click();

            System.out.println("Search complete (excluding adding to cart)");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
