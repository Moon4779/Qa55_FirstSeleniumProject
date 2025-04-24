package fw;

import com.FirstSeleniumProgect.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper {
    private WebDriver driver;

    public ContactHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAddLink() {
        driver.findElement(By.linkText("Add Contact")).click();
    }

    public void fillContactForm(ContactData contact) {
        driver.findElement(By.id("Name")).sendKeys(ContactData.Name);
        driver.findElement(By.id("LastName")).sendKeys(ContactData.Last_Name);
        driver.findElement(By.id("Email")).sendKeys(ContactData.EMAIL);
    }

    public void clickOnSaveButton() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    public void deleteContact(String contactName) {
        // Найти контакт по имени и нажать кнопку удаления
        driver.findElement(By.xpath("//td[text()='" + contactName + "']/following-sibling::td/a[text()='Delete']")).click();
        // Подтвердить удаление, если появляется всплывающее окно
        driver.switchTo().alert().accept();
    }

    public void ClickOnAddLink() {

    }

    public boolean isContactAdded(String name) {
        return false;
    }

    public void deliteContact() {
    }
}
