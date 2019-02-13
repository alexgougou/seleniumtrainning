package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage {
    @FindBy(id = "user_login")
    WebElement inputusername;

    @FindBy(id = "user_password")
    WebElement inputpassword;

    @FindBy(name = "commit")
    WebElement commit;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void login(String username, String password){
        inputusername.clear();
        inputusername.sendKeys(username);
        Reporter.log("输入用户名",true);
        inputpassword.clear();
        inputpassword.sendKeys(password);
        Reporter.log("输入密码",true);
        commit.click();
        Reporter.log("点击登录",true);
    }

}
