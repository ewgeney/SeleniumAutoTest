import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://passport.yandex.ru/auth/welcome?from=mail&origin=hostroot_homer_auth_L_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1");
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void countMessages() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setFieldLogin("repinseleniumtest");
        PasswordPage passPage = loginPage.clickSignIn();
        passPage.setFieldPassword("rep1ns1len1umtest");
        MailboxPage messagesPage = passPage.clickSignIn();
        int count = messagesPage.getCountMessages("Simbirsoft Тестовое задание");
        MessagePage newMailPage = messagesPage.clickNewMailButton();
        newMailPage.setFieldRecipient("repinseleniumtest@yandex.ru");
        newMailPage.setFieldTheme("Simbirsoft Тестовое задание. Репин");
        newMailPage.setFieldMessages(""+count);
        newMailPage.clickSendButton();
    }
}
