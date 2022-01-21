package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userName=By.id("txtUsername");
    private By passWord=By.id("txtPassword");
    private By loginBtn=By.id("btnLogin");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUserName(String name){
        driver.findElement(userName).sendKeys(name);
    }
    public void setPassWord(String pass){
        driver.findElement(passWord).sendKeys(pass);
    }
    public DashboardPage clickOnBtn(){
        driver.findElement(loginBtn).click();
        return new DashboardPage(driver);
    }



}
