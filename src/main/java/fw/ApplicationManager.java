package fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {
    private WebDriver driver;
    private final String browser;
    private ContactHelper contactHelper;
    private UserHelper userHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");
        contactHelper = new ContactHelper(driver);
        userHelper = new UserHelper(driver);

    }

    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public ContactHelper getContact() {
        return contactHelper;
    }

    public UserHelper getUser() {
        return userHelper;
    }

    public Object getHome() {
        return null;
    }
}
