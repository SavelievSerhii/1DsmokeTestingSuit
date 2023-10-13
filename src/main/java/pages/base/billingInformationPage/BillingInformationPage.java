package pages.base.billingInformationPage;

import constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

public class BillingInformationPage extends BasePage {
    public BillingInformationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public BillingInformationPage(WebDriver driver) {
        super(driver);
    }

    /*************************************BILLING INFORMATION PAGE ELEMENTS**********************************/

    private final By customerDropDownMenu = By.xpath("//ul/li[@class='dropdown account-menu-item']");

    private final By myAccountLink = By.xpath("//a[@href='/products/secure/myaccount/']");

    private final By billingInformationLink = By.xpath("//a[@href='/products/secure/myaccount/profileinfo']");

    private final By billingInformationPageTitle = By.xpath("//h1[contains(.,'Manage Contact Information')]");

    private final By lastNameField = By.id("lastname");

    private final By saveChangesButton = By.xpath("//input[@value='Save Changes']");

    private final By cancelButton = By.xpath("//a[@href='/products/Secure/myaccount']");

    private final By successModalWindow = By.xpath("//h4[contains(.,'Success!')]");

    private final By backToMyAccountButton = By.xpath("//button[contains(.,'Back to My Account')]");

    private final By closeButton = By.xpath("//div[@class='modal-footer']//button[contains(.,'Close')]");

    private final By profilePageTitle = By.xpath("//h3[contains(.,'Your Profile')]");



    /*************************************BILLING INFORMATION PAGE MAIN LOGIC**********************************/
    public void getToBillingInformationPage() {
        hoverOverElement(driver.findElement(customerDropDownMenu));
        waitElementIsVisible(driver.findElement(myAccountLink));
        clickOnElementIfReady(driver.findElement(myAccountLink));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(billingInformationLink));
        clickOnElementIfReady(driver.findElement(billingInformationLink));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(billingInformationPageTitle));
        makePause(1500);
    }

    public void saveChangerPositive() {
        waitElementIsVisible(driver.findElement(lastNameField)).clear();
        waitElementIsVisible(driver.findElement(lastNameField)).sendKeys("qa correction");
        waitElementIsVisible(driver.findElement(saveChangesButton));
        clickOnElementIfReady(driver.findElement(saveChangesButton));
        waitElementIsVisible(driver.findElement(successModalWindow));
        waitElementIsVisible(driver.findElement(backToMyAccountButton));
        clickOnElementIfReady(driver.findElement(backToMyAccountButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(profilePageTitle));
        clickOnElementIfReady(driver.findElement(billingInformationLink));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(lastNameField)).clear();
        waitElementIsVisible(driver.findElement(lastNameField)).sendKeys("QA");
        waitElementIsVisible(driver.findElement(saveChangesButton));
        clickOnElementIfReady(driver.findElement(saveChangesButton));
        waitElementIsVisible(driver.findElement(successModalWindow));
        waitElementIsVisible(driver.findElement(closeButton));
        clickOnElementIfReady(driver.findElement(closeButton));
        waitElementIsVisible(driver.findElement(billingInformationPageTitle));
    }

    public String saveChangesNegativeScenarioRespond() {
        waitElementIsVisible(driver.findElement(lastNameField)).clear();
        waitElementIsVisible(driver.findElement(saveChangesButton));
        clickOnElementIfReady(driver.findElement(saveChangesButton));
        waitElementIsVisible(driver.findElement(lastNameField));
        clickOnElementIfReady(driver.findElement(lastNameField));
        makePause(3000);
        String cssValue = waitElementIsVisible(driver.findElement(lastNameField)).getCssValue("background-color");
        System.out.println(cssValue);
        return cssValue;
    }

    public void cancelButtonIsWorkable() {
        waitElementIsVisible(driver.findElement(cancelButton));
        clickOnElementIfReady(driver.findElement(cancelButton));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(profilePageTitle));
    }
}
