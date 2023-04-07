import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTestSelenium {

    public static WebDriver driver;


    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "\\Resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        driver = new ChromeDriver();
        driver.get("https://chaldal.com/");

    }
}
