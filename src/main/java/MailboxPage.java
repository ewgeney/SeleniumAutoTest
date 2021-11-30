import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailboxPage {
    private WebDriver driver;

    public MailboxPage(WebDriver driver) {
        this.driver = driver;
    }

    private By newMailButton = By.xpath("//*[@class = \"mail-ComposeButton js-main-action-compose\"]");

    public MessagePage clickNewMailButton() {
        driver.findElement(newMailButton).click();
        return new MessagePage(driver);
    }
    public int getCountMessages (String name){
        return driver.findElements(By.xpath(String.format("//*[@title=\"%s\"]", name))).size();
    }
}
