import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private By fieldLogin = By.id("passp-field-login");
    private By signInButton = By.id("passp:sign-in");

    public PasswordPage clickSignIn(){
        driver.findElement(signInButton).click();
        return new PasswordPage(driver);
    }
    public LoginPage setFieldLogin (String login){
        driver.findElement(fieldLogin).sendKeys(login);
        return this;
    }
}
