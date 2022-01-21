package Login;

import Bases.BaseTests;
import Pages.DashboardPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    public DashboardPage dashboardPage;

    @Test
    public void testLogin(){

        loginPage.setUserName("Admin");
        loginPage.setPassWord("admin123");
        dashboardPage=loginPage.clickOnBtn();
        Assert.assertEquals(dashboardPage.getGetText(),"Dashboard","Text From Dashbord incoorect");

    }
    @Test(dependsOnMethods = "testLogin")
    public void testAdmin(){

        dashboardPage.userSearch();
        Assert.assertEquals(dashboardPage.getGetText(),"System Users","Text From Dashbord incoorect");

    }
    @Test(dependsOnMethods = {"testLogin","testAdmin"})
    public void testPim(){

        dashboardPage.Employee_Information();
        Assert.assertEquals(dashboardPage.getGetText(),"Employee Information","Text From Dashbord incoorect");

    }
    @Test(dependsOnMethods = {"testLogin","testAdmin","testPim"})
    public void testSingOut(){

        dashboardPage.test7_SignOut();
        //Assert.assertEquals(dashboardPage.getGetText(),"System Users","Text From Dashbord incoorect");

    }

}
