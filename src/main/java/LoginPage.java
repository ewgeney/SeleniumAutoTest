import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(id = "passp-field-login")
    private WebElement fieldLogin;
    @FindBy(id = "passp:sign-in")
    private WebElement signInButton;

    public PasswordPage clickSignIn(){
        signInButton.click();
        return PageFactory.initElements(driver, PasswordPage.class);
    }
    public LoginPage setFieldLogin (String login){
        fieldLogin.sendKeys(login);
        return this;
    }
}
