package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // click on the ‘Login’ link

        clickOnElement(By.xpath("//a[@class='ico-login']"));

        // Verify the text ‘Welcome, Please Sign In!’
        clickOnElement(By.xpath("//div[@class='page-title']"));

        System.out.println("Test is verify");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on the ‘Login’ link

        clickOnElement(By.xpath("//a[@class='ico-login']"));


        //Enter valid username

        sendKeysToElement(By.xpath("//input[@class='email']"), "Testqa@gmail.com");


        //Enter valid password

        sendKeysToElement(By.xpath("//input[@class='password']"), "Test@123.");

        //Click on ‘LOGIN’ button

        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));

        //Verify the ‘Log out’ text is display

        getTextFromElement(By.xpath("//a[@class='ico-logout']"));


        System.out.println("Test Done");


    }

    @Test

    public void verifyTheErrorMessage() {

        //click on the ‘Login’ link

        clickOnElement(By.xpath("//a[@class='ico-login']"));

        //Enter invalid username

        sendKeysToElement(By.xpath("//input[@class='email']"), "wrong@gmai");


        //Enter invalid password

        sendKeysToElement(By.xpath("//input[@class='password']"), "123456");

        //Click on Login button

        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));


        //Verify the error message ‘Login was unsuccessful.
        //Please correct the errors and try again. No customer account found’

        String actualtest = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String expectedtest = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //validtion
        Assert.assertEquals(expectedtest, actualtest);

        System.out.println("Weel done");
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }
}
