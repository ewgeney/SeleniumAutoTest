import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailboxPage {
    private WebDriver driver;

    public MailboxPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class = \"mail-ComposeButton js-main-action-compose\"]")
    private WebElement newMailButton;

    public MessagePage clickNewMailButton() {
        newMailButton.click();
        return PageFactory.initElements(driver, MessagePage.class);
    }
    public int getCountMessages (String name){
        return driver.findElements(By.xpath(String.format("//*[@title=\"%s\"]", name))).size();
    }
}
