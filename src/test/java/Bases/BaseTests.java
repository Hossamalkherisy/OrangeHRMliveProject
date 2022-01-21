package Bases;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    private ChromeDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver =new ChromeDriver();
        goHome();
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        loginPage=new LoginPage(driver);
    }
    public  void goHome(){
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



}
