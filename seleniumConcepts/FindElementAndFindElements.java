package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class FindElementAndFindElements {
            public static void main (String[] args){

            WebDriver driver;
            // declaration and instantiation of objects/variables
            System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
            driver = new ChromeDriver();
            //Launch chrome browser
            driver.get("https://www.google.com/");
            //FindElement()
                WebElement link = driver.findElement(By.linkText("Gmail"));
                System.out.println(link.getText());
                //FindElements()
                List<WebElement> linklist = driver.findElements(By.tagName("a"));
                for (int i = 0; i < linklist.size(); i++) {
                    System.out.println(linklist.get(i).getText());
                }
        }
    }

