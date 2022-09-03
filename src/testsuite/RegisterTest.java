package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {
    String BaseURL = "https://demo.nopcommerce.com/";

    @Before
    public void Setup() {
        openBrowser(BaseURL);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        //click on the ‘Register’ link

        clickOnElement(By.xpath("//a[@class='ico-register']"));

        //Verify the text ‘Register’

        getTextFromElement(By.xpath("//div[@class='page-title']"));


    }

    @Test

    public void userSholdRegisterAccountSuccessfully() {

        //click on the ‘Register’ link

        clickOnElement(By.xpath("//a[@class='ico-register']"));


        //Select gender radio button

        clickOnElement(By.xpath("//input[@id='gender-male']"));

        //Enter First name

        sendKeysToElement(By.xpath("//input[@id='FirstName']"), "Testing");


        //Enter Last name

        sendKeysToElement(By.xpath("//input[@id='LastName']"), "QA");

        // Select Day Month and Year


        //Enter Email address

        sendKeysToElement(By.xpath("//input[@id='Email']"), "qa123456@gmail.com");

        //Enter Password

        sendKeysToElement(By.xpath("//input[@id='Password']"), "Test@123.");

        //Enter Confirm password

        sendKeysToElement(By.xpath("//input[@id='ConfirmPassword']"), "Test@123.");

        //Click on REGISTER button

        clickOnElement(By.xpath("//button[@id='register-button']"));
        //Verify the text 'Your registration completed’

        getTextFromElement(By.xpath("//div[@class='result']"));


    }

    @After
    public void tearDown() {
        //closeBrowser();
    }


}
