import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {
    @Test(priority = 1)
    public void doLoginExecution(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin", "admin123");
        Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown" +
                "-img")).isDisplayed());
    }

    @Test(priority = 2)
    public void doLogOut(){
        LogOut logOut = new LogOut(driver);
        logOut.doLogOut();
    }
}
