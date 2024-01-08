import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogOut {
    @FindBy(className = "oxd-userdropdown-name")
    WebElement btnUserProfile;
    @FindBy(className = "oxd-userdropdown-link")
    List<WebElement> linkSubItems;
    public LogOut(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void doLogOut(){
        btnUserProfile.click();
//        $$('.oxd-userdropdown-link')
//        check this
        linkSubItems.get(3).click();
    }
}
