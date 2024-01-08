import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {
    @Test
    public void doLogin(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin", "admin123");
    }
}
