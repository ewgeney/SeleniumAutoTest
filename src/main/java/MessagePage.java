import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessagePage {
    private WebDriver driver;

    public MessagePage(WebDriver driver) {
        this.driver = driver;
    }

    private By fieldRecipient = By.xpath("//*[@class=\"MultipleAddressesDesktop ComposeRecipients-MultipleAddressField ComposeRecipients-ToField tst-field-to\"]//*[@class=\"composeYabbles\"]");
    private By fieldTheme = By.xpath("//*[@class = \"composeTextField ComposeSubject-TextField\"]");
    private By fieldMessages = By.xpath("//*[@role=\"textbox\"]");
    private By sendButton = By.xpath("//*[@class = \"Button2 Button2_pin_circle-circle Button2_view_default Button2_size_l\"]");

    public MessagePage setFieldRecipient (String recipient){
        driver.findElement(fieldRecipient).sendKeys(recipient);
        return this;
    }
    public MessagePage setFieldTheme (String theme){
        driver.findElement(fieldTheme).sendKeys(theme);
        return this;
    }
    public MessagePage setFieldMessages (String messages){
        driver.findElement(fieldMessages).sendKeys(messages);
        return this;
    }

    public MailboxPage clickSendButton(){
        driver.findElement(sendButton).click();
        return new MailboxPage(driver);
    }
}
