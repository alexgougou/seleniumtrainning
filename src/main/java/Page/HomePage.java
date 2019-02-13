package Page;

import com.sun.tools.javadoc.JavaScriptScanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {
    @FindBy(partialLinkText = "登录")
    WebElement linklogin;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void goLogin(){
        linklogin.click();
        Reporter.log("点击登录",true);
    }
}
