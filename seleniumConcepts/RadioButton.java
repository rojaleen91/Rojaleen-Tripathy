package seleniumConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("file:///C:\\Users\\nisum\\IdeaProjects\\Javastreams\\src\\main\\java\\seleniumConcepts/radio.html");
            driver.findElement(By.xpath("//input[@value='Banana']")).click();
        }

    }