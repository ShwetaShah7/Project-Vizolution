package CompanyVizolution.pages;


import CompanyVizolution.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class AboutUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(AboutUsPage.class.getName());

    public AboutUsPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Our Story']")
    WebElement verifyAboutUsPage;

    @CacheLookup
    @FindBy (xpath = "//div[11]//div[2]//div[1]//div[1]//div[4]//a[1]")
    WebElement learnMoreButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class=\"second-container\"]/ul/li[5]/a")
    WebElement verifyFive9Website;

//    ***********************

    public String verifyOurStoryTitle() {
        Reporter.log("Verify About us Page Title 'Our Story'" + verifyAboutUsPage.toString() + "<br>");
        return getTextFromElement(verifyAboutUsPage);
    }

    public void slider() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)");

    }

    public void clickOnLearnMoreButton() {
        Reporter.log("Click on Learn more Button" + learnMoreButton.toString() + "<br>");
        clickOnElement(learnMoreButton);
    }

}