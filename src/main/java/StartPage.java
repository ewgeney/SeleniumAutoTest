import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
    private WebDriver driver;

    public StartPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(xpath = "//div[@class=\"HeadBanner-ButtonsWrapper\"]/a[2]")
    private WebElement signInButton;

    public LoginPage clickSignIn(){
        signInButton.click();
        return PageFactory.initElements(driver, LoginPage.class);
    }
}
