package Testcases;

import Page.HomePage;
import Page.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Testng {
    static WebDriver driver;
    @BeforeClass
    public void before(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/alex/Documents/tool/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void after(){
        driver.quit();
    }

    @Test
    public void loginPo(){
        driver.get("https://testerhome.com/");
        HomePage homePage = new HomePage(driver);
        homePage.goLogin();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("liuyi_8372@163.com","Ly3612729");
        driver.findElement(By.className("dropdown-toggle")).click();
        Assert.assertTrue(driver.findElement(By.className("dropdown-menu")).getText().contains("alex_lau"));

    }
    @Test
    public void scroll(){
        driver.get("https://testerhome.com/");
        WebElement element = driver.findElement(By.cssSelector(".home-icons"));
        String js = "arguments[0].scrollIntoView(true)";
        ((JavascriptExecutor)driver).executeScript(js,element);
    }

    @Test
    public void scrollTest(){
        driver.get("https://testerhome.com/");
        String js = "document.documentElement.scrollTop=500";
        ((JavascriptExecutor)driver).executeScript(js);
    }

}
