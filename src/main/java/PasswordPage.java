import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {
    private WebDriver driver;

    public PasswordPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(id = "passp-field-passwd")
    private WebElement fieldPassword;
    @FindBy(id = "passp:sign-in")
    private WebElement signInButton;

    public MailboxPage clickSignIn(){
        signInButton.click();
        return PageFactory.initElements(driver, MailboxPage.class);
    }
    public PasswordPage setFieldPassword (String password){
        fieldPassword.sendKeys(password);
        return this;
    }
}

