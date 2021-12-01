import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    private WebDriver driver;
    String login, password;

    @Before
    public void setUp() throws MalformedURLException {
        FileInputStream stream;
        Properties property = new Properties();

        try {
            stream = new FileInputStream("src/main/resources/config.properties");
            property.load(stream);
            login = property.getProperty("login");
            password = property.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.yandex.ru/");
    }

    @Test
    public void countMessages() {
        StartPage startPage = PageFactory.initElements(driver, StartPage.class);
        LoginPage loginPage = startPage.clickSignIn();
        loginPage.setFieldLogin(login);
        PasswordPage passPage = loginPage.clickSignIn();
        passPage.setFieldPassword(password);
        MailboxPage messagesPage = passPage.clickSignIn();
        int count = messagesPage.getCountMessages("Simbirsoft Тестовое задание");
        MessagePage newMailPage = messagesPage.clickNewMailButton();
        newMailPage.setFieldRecipient("repinseleniumtest@yandex.ru");
        newMailPage.setFieldTheme("Simbirsoft Тестовое задание. Репин");
        newMailPage.setFieldMessages(""+count);
        DonePage donePage = newMailPage.clickSendButton();
        Assert.assertEquals(donePage.getDoneMessage(), "Письмо отправлено");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
