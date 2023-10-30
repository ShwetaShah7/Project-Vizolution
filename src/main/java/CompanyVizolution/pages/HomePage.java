package CompanyVizolution.pages;


import CompanyVizolution.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@class=\"cky-notice-btn-wrapper\"]/button[3]")
    WebElement cookieButton;


    @CacheLookup
    @FindBy(xpath = "//ul[@id='primary-menu']/li[5]/a")
    WebElement insights;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='primary-menu']/li[5]/ul/li[2]/a")
    WebElement aboutUs;



//*********************************

    public void acceptAllCookieButton() {
        Reporter.log("Accept All Cookies" + cookieButton.toString() + "<br>");
        clickOnElement(cookieButton);
    }

    public void selectMenu(String menu)  {
        Reporter.log("Mousehover on Menu-bar" + insights.toString() + "<br>");
        mouseHoverToElementAndClick(insights);
    }

    public void selectMenuItem(String menuItem) {
        Reporter.log("Select Item from Menu-bar" + aboutUs.toString() + "<br>");
       mouseHoverToElementAndClick(aboutUs);
    }



}