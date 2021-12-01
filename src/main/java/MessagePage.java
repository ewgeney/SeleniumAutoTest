import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {
    private WebDriver driver;

    public MessagePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class=\"ComposeRecipients-TopRow\"]//div[@class=\"composeYabbles\"]")
    private WebElement fieldRecipient;
    @FindBy(xpath = "//*[@class = \"composeTextField ComposeSubject-TextField\"]")
    private WebElement fieldTheme;
    @FindBy(xpath = "//*[@role=\"textbox\"]")
    private WebElement fieldMessages;
    @FindBy(xpath = "//*[@class=\"ComposeSendButton-Text\"]/../..")
    private WebElement sendButton;

    public MessagePage setFieldRecipient (String recipient){
        fieldRecipient.sendKeys(recipient);
        return this;
    }
    public MessagePage setFieldTheme (String theme){
        fieldTheme.sendKeys(theme);
        return this;
    }
    public MessagePage setFieldMessages (String messages){
        fieldMessages.sendKeys(messages);
        return this;
    }

    public DonePage clickSendButton(){
        sendButton.click();
        return PageFactory.initElements(driver, DonePage.class);
    }
}
