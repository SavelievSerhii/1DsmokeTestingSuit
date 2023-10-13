package pages.base.comparisonsPage;

import constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.util.List;
import java.util.Objects;

public class ComparisonsPage extends BasePage {
    public ComparisonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public ComparisonsPage(WebDriver driver) {
        super(driver);
    }

    /*************************************COMPARISONS PAGE ELEMENTS**********************************/

    //NAVIGATION

    private final By customerDropDownMenu = By.xpath("//ul/li[@class='dropdown account-menu-item']");

    private final By comparisonsLink = By.xpath("//ul[@class='dropdown-menu account-dropdown-list']//a[@href='/products/compare/']");

    private final By compareProductLink = By.xpath("//span[contains(.,'Compare product')]");

    public final By productNameSign = By.xpath("//h1[@class='pageName marg0']");



    //MODAL WINDOW ON PDP
    private final By successModalWindowTitle = By.xpath("//h4[contains(.,'Success')]");

    private final By errorModalWindowTitle = By.xpath("//h4[contains(.,'Error')]");

    private final By okButton = By.xpath("//div[@class='modal-content']//div[3]//button[2]");

    private final By viewComparisons = By.xpath("//button[contains(.,'View Comparisons')]");

    private final By reachLimitErrorMessage = By.xpath("//div[@class='modal-body']//div[contains(.,'The compare cart already has the maximum number of items allowed')]");



    //COMPARISONS CART
    private final By comparisonsPageTitle = By.xpath("//h1[contains(.,'Comparisons')]");

    private final By firstINARowLink = By.xpath("//table[@class='table table-hover table-nonfluid']//tbody[1]//tr[4]//td[1]//a[1]");

    private final By shareLink = By.xpath("//button[@title='Share this list using a link']");

    private final By shareEmail = By.xpath("//button[@title='Share this list via email']");

    private final By removeLink = By.xpath("//div[@class='table-responsive comparison-table']//table[1]//tbody[1]//tr[1]//td[1]//a[1]");

    private final By dropDownMenuCounter = By.xpath("//div[@class='container-fluid constrained-width']//div[2]//ul[1]//li[4]/ul[1]//li[6]//a//span//span");



    //SHARE MODAL WINDOW

    private final By closeButtonShareModalWindow = By.xpath("//div[@id='linkModal']//div[1]//div[1]//div[3]//button");

    private final By linkToShare = By.id("share_link");

    private final By sendEmailShareModalWindowButton = By.xpath("//input[@value='Send Email']");

    private final By emailToField = By.id("emailTo");

    private final By emailErrorSign = By.id("emailTo-error");

    private final By captchaWarningMessagePopUpWindow = By.id("bootboxBody");



    /*************************************COMPARISONS PAGE MAIN LOGIC**********************************/

    public void getToComparisonsPage() {
        hoverOverElement(driver.findElement(customerDropDownMenu));
        waitElementIsVisible(driver.findElement(comparisonsLink));
        clickOnElementIfReady(driver.findElement(comparisonsLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(comparisonsPageTitle));
    }

    public void addProductToComparisons() {
        waitElementIsVisible(driver.findElement(compareProductLink));
        clickOnElementIfReady(driver.findElement(compareProductLink));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(successModalWindowTitle));
        waitElementIsVisible(driver.findElement(okButton));
        clickOnElementIfReady(driver.findElement(okButton));
        waitForJSToBeLoaded();
    }

    public void addTheSameProductToComparisons() {
        waitElementIsVisible(driver.findElement(compareProductLink));
        clickOnElementIfReady(driver.findElement(compareProductLink));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(errorModalWindowTitle));
        waitElementIsVisible(driver.findElement(okButton));
        clickOnElementIfReady(driver.findElement(okButton));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(compareProductLink));
        clickOnElementIfReady(driver.findElement(compareProductLink));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(viewComparisons));
        clickOnElementIfReady(driver.findElement(viewComparisons));
        waitElementIsVisible(driver.findElement(comparisonsPageTitle));
    }

    public void checkComparisonsCapacityLimit() {
        waitElementIsVisible(driver.findElement(compareProductLink));
        clickOnElementIfReady(driver.findElement(compareProductLink));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(reachLimitErrorMessage));

        waitElementIsVisible(driver.findElement(viewComparisons));
        clickOnElementIfReady(driver.findElement(viewComparisons));
        waitElementIsVisible(driver.findElement(comparisonsPageTitle));
    }

    public String checkLinkIsWorkable() {
        String linkText = waitElementIsVisible(driver.findElement(firstINARowLink)).getText();
        waitElementIsVisible(driver.findElement(firstINARowLink));
        clickOnElementIfReady(driver.findElement(firstINARowLink));
        waitForJSToBeLoaded();
        return linkText;
    }

    public String checkShareFunctionality() {
        waitElementIsVisible(driver.findElement(shareLink));
        clickOnElementIfReady(driver.findElement(shareLink));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(closeButtonShareModalWindow));
        clickOnElementIfReady(driver.findElement(closeButtonShareModalWindow));

//        waitElementIsVisible(driver.findElement(shareLink));
//        clickOnElementIfReady(driver.findElement(shareLink));
//        waitForJSToBeLoaded();
//        String linkText = clickOnElementIfReady(driver.findElement(linkToShare)).getText();
//        driver.get(linkText);
//        driver.navigate().back();
//        waitElementIsVisible(driver.findElement(comparisonsPageTitle));

        waitElementIsVisible(driver.findElement(shareEmail));
        clickOnElementIfReady(driver.findElement(shareEmail));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(sendEmailShareModalWindowButton));
        clickOnElementIfReady(driver.findElement(sendEmailShareModalWindowButton));
        String cssValue = waitElementIsVisible(driver.findElement(emailToField)).getCssValue("background-color");
        waitElementIsVisible(driver.findElement(emailErrorSign));

        waitElementIsVisible(driver.findElement(emailToField)).sendKeys("automationtest@test.com");
        waitElementIsVisible(driver.findElement(sendEmailShareModalWindowButton));
        clickOnElementIfReady(driver.findElement(sendEmailShareModalWindowButton));
        waitElementIsVisible(driver.findElement(captchaWarningMessagePopUpWindow));
        return cssValue;
    }

    public void removeProductFromComparisons() {
        hoverOverElement(driver.findElement(customerDropDownMenu));
        String text = waitElementIsVisible(driver.findElement(dropDownMenuCounter)).getText();
        int counter = Integer.parseInt(text);

        if (counter == 0) System.out.println("'Comparisons' is empty.");
        else System.out.println("The cart called 'Comparisons' was not empty.");


        for (int i= 0; i < counter; i++) {
                waitElementIsVisible(driver.findElement(removeLink));
                clickOnElementIfReady(driver.findElement(removeLink));
                waitForJSToBeLoaded();
                hoverOverElement(driver.findElement(customerDropDownMenu));
                waitElementIsVisible(driver.findElement(comparisonsLink));
                clickOnElementIfReady(driver.findElement(comparisonsLink));
        }
    }
}
