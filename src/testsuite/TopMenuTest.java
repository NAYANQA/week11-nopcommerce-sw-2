package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String BasURL = "https://demo.nopcommerce.com/";

    @Before

    public void setUp(){

        openBrowser(BasURL);

    }

    @Test

    public void userShouldNavigateToComputerPageSuccessfully(){

        //* click on the ‘Computers’ Tab

        clickOnElement(By.linkText("Computers"));

        //* Verify the text ‘Computers’

        getTextFromElement(By.xpath("//div[@class='page-title']"));

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        //* click on the ‘Electronics’ Tab
     /*   WebElement ClickElectronics = driver.findElement(By.linkText("Electronics"));
        ClickElectronics.click();*/

        clickOnElement(By.linkText("Electronics"));



        //* Verify the text ‘Electronics’

       /* WebElement VerifyElectronics = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyElectronics.getText();*/
        getTextFromElement(By.xpath("//div[@class='page-title']"));

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        //* click on the ‘Apparel’ Tab

       /* WebElement ClickApparel = driver.findElement(By.linkText("Apparel"));
        ClickApparel.click();*/
        clickOnElement(By.linkText("Apparel"));

        //* Verify the text ‘Apparel’

        /*WebElement VerifyApparel = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyApparel.getText();*/
        getTextFromElement(By.xpath("//div[@class='page-title']"));


    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        //* click on the ‘Digital downloads’ Tab

       /* WebElement ClickDigitaldownloads = driver.findElement(By.linkText("Digital downloads"));
        ClickDigitaldownloads.click();*/

        clickOnElement(By.linkText("Digital downloads"));

        //* Verify the text ‘Digital downloads’

        /*WebElement VerifyDigitaldownloads = driver.findElement(By.xpath("//div[@class='page-title']"));
        VerifyDigitaldownloads.getText();*/
        getTextFromElement(By.xpath("//div[@class='page-title']"));



    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        //* click on the ‘Books’ Tab

        clickOnElement(By.linkText("Books"));

        //* Verify the text ‘Books’

        getTextFromElement(By.xpath("//div[@class='page-title']"));


    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

        //* click on the ‘Jewelry’ Tab

        clickOnElement(By.linkText("Jewelry"));

        //* Verify the text ‘Jewelry’

        getTextFromElement(By.xpath("//div[@class='page-title']"));

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

        //* click on the ‘Gift Cards’ Tab

        clickOnElement(By.linkText("Gift Cards"));

        //* Verify the text ‘Gift Cards’

        getTextFromElement(By.xpath("//div[@class='page-title']"));

    }
    @After
    public void tearDown() {
        //closeBrowser();
    }





}
