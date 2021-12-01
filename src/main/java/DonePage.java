import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonePage {
    private WebDriver driver;

    public DonePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class=\"ComposeDoneScreen-Title\"]/span")
    private WebElement doneMessage;

    public String getDoneMessage(){
        return doneMessage.getText();
    }
}
