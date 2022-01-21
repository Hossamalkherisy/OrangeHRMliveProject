package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage {
    private WebDriver driver;
    private By getText=By.xpath("//*[@id=\"content\"]/div/div[1]/h1");
    private By iconeProfile=By.id("welcome");
    private By menu_pim=By.id("menu_pim_viewPimModule");
    private By signoutBtn=By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a");
    public DashboardPage(WebDriver driver) {
        this.driver=driver;
    }

    public String getGetText() {
        String text=driver.findElement(getText).getText();
        return text;
    }
    public void userSearch ()
    {
        WebElement menuAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        menuAdmin.click();
        WebElement textUserName = driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]"));
        WebElement buttonSearch = driver.findElement(By.xpath("//*[@id='searchBtn']"));
        textUserName.sendKeys("Admin");
        buttonSearch.click();
    }
    public void Employee_Information ()
    {
         driver.findElement(menu_pim).click();
        WebElement textUserName = driver.findElement(By.id("empsearch_employee_name_empName"));
        WebElement textUserNameId = driver.findElement(By.id("empsearch_id"));
        WebElement buttonSearch = driver.findElement(By.id("searchBtn"));
        textUserName.sendKeys("Admin A");
        textUserNameId.sendKeys("227");
        buttonSearch.click();
    }
    public void SingOut(){
        driver.findElement(iconeProfile).click();
        driver.findElement(signoutBtn).click();
    }
    public void test7_SignOut ()
    {
        WebElement linkWelcome = driver.findElement(By.id("welcome"));
        linkWelcome.click();

        //WebElement linkLogout = driver.findElement(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]"));
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]"))).click();



        System.out.println("7. Sign Out");
    }
}
