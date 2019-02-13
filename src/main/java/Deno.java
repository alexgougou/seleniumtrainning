import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Deno {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/alex/Documents/tool/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //chrome后台运行
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testerhome.com/");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);//隐式等待
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));//显式等待

        ((ChromeDriver) driver).findElementByLinkText("登录").click();
        ((ChromeDriver) driver).findElementById("user_login").sendKeys("liuyi_8372@163.com");
        ((ChromeDriver) driver).findElementById("user_password").sendKeys("Ly3612729");
        ((ChromeDriver) driver).findElementByName("commit").click();
        Thread.sleep(5000);
        driver.quit();

    }
}
