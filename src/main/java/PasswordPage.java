import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage {
    private WebDriver driver;

    public PasswordPage(WebDriver driver){
        this.driver=driver;
    }

    private By fieldPassword = By.id("passp-field-passwd");
    private By signInButton = By.id("passp:sign-in");

    public MailboxPage clickSignIn(){
        driver.findElement(signInButton).click();
        return new MailboxPage(driver);
    }
    public PasswordPage setFieldPassword (String password){
        driver.findElement(fieldPassword).sendKeys(password);
        return this;
    }
}

