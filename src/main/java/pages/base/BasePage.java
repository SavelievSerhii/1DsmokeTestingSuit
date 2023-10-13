package pages.base;

import constants.Constant;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import static constants.Constant.TimeoutVariable.*;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    /*****************************LOGIN PAGE ELEMENTS*****************************/

    public final By loginPageTitle = By.xpath("//h1[contains(text(),'Sign In')]");
    public final By emailField = By.id("email");
    public final By passwordField = By.id("password");
    public final By loginButton = By.xpath("//input[@class='btn btn-primary btn-lg btn-block']");
    public final By accountIcon = By.xpath("//span[@class='icon-header-account']");
    public final By cartIcon = By.xpath("//span[@class='icon-header-cart']");
    public final By logOutLink = By.xpath("//a[@href='/products/secure/myaccount/signout/']");
    public final By acceptCookiesMainBannerOnLoginPage = By.id("onetrust-accept-btn-handler");

    /*****************************PRODUCT LISTING PAGE ELEMENTS*****************************/

//    @FindBy(xpath = "//div[@class='col-lg-10']//div[3]//h2")
//    public List<WebElement> productsOnPLP;

//    @FindBy(xpath = "//section//h2/a")
//    public List<WebElement> productsOnPLP;
    public final By tShirtsOptionOnPLP = By.xpath("//nav[@id='filters-clampedwidth']//a[contains(text(), 'T-Shirts')]");

    public final By toteBagsOptionOnPLP = By.xpath("//nav[@id='filters-clampedwidth']//a[contains(.,' Tote Bags')]");


    /*****************************NAVIGATION*****************************/

    public void openPage(String url){
//        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        waitForJSToBeLoaded();
    }

    public void acceptCookies() {
        waitElementIsVisible(driver.findElement(acceptCookiesMainBannerOnLoginPage));
        clickOnElementIfReady(driver.findElement(acceptCookiesMainBannerOnLoginPage));
    }


    public void siteLoginPageOpen() {
        driver.manage().deleteAllCookies();
        openPage(Constant.UrlsToInteract.SIGN_IN_URL);
        driver.manage().window().maximize();
        waitForJSToBeLoaded();
//        waitElementIsVisible(driver.findElement(acceptCookiesMainBannerOnLoginPage));
//        clickOnElementIfReady(driver.findElement(acceptCookiesMainBannerOnLoginPage));
    }

    public  void login(String login, String password) {
        siteLoginPageOpen();
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(acceptCookiesMainBannerOnLoginPage));
        clickOnElementIfReady(driver.findElement(acceptCookiesMainBannerOnLoginPage));
        waitElementIsVisible(driver.findElement(emailField)).clear();
        waitElementIsVisible(driver.findElement(emailField)).sendKeys(login);
        waitElementIsVisible(driver.findElement(passwordField)).clear();
        waitElementIsVisible(driver.findElement(passwordField)).sendKeys(password);
        waitElementIsVisible(driver.findElement(loginButton)).click();
        waitForJSToBeLoaded();
        hoverOverElement(driver.findElement(accountIcon));
        waitElementIsVisible(driver.findElement(logOutLink));
        hoverOverElement(driver.findElement(cartIcon));
        waitForJSToBeLoaded();
        makePause(1500);
    }


    /*****************************WAITINGS*****************************/

    public WebElement waitForVisible(WebElement element) {
        waitForJSToBeLoaded();
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitElementIsVisible(WebElement element) {
        waitForJSToBeLoaded();
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitForElementContainsText(WebElement element, String text) {
        waitForJSToBeLoaded();
        new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT)).until(ExpectedConditions.textToBePresentInElement(element, text));
        return element;
    }


    public void waitForJSToBeLoaded() {
        new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT)).until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }

    public void waitForJQueryToBeLoaded() {
        new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT)).until(webDriver -> (Long) ((JavascriptExecutor) driver)
                .executeScript("return jQuery.active") == 0);
    }

    /*****************************INTERACTIONS WITH ELEMENTS ON PAGES*****************************/

    public boolean isElementPresent(By element) {
        boolean bool = false;
        if (driver.findElements(element).size() != 0) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public  void jsScrollDown() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public WebElement jsClick(WebElement element) {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
            return element;
    }

    public void switchToNewWindow() {
        Set<String> set = driver.getWindowHandles();
        String[] array = set.toArray(new String[0]);
        driver.switchTo().window(array[1]);
    }

    public void switchToDefaultWindow() {
        Set <String> set = driver.getWindowHandles();
        String[] array = set.toArray(new String[0]);
        driver.switchTo().window(array[0]);
    }

    public void switchToFrame(WebElement element) {
        waitElementIsVisible(element);
        driver.switchTo().frame(element);
    }


//    public void switchToNewWindow2() {
//        String window1 = driver.getWindowHandle();
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("window.pen()");
//        Set<String> currentWindows = driver.getWindowHandles();
//        String window2 = null;
//        for (String window : currentWindows) {
//            if (!window.equals(window1)) {
//                window2 = window;
//                break;
//            }
//        }
//        driver.switchTo().window(window2);
//    }

    public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public WebElement clickOnElementIfReady(WebElement element) {
        makePause(SHORT_SLEEP);
        waitElementIsVisible(element);
        new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT)).until(ExpectedConditions.elementToBeClickable(element)).click();
        return element;
    }

    public void selectDropdownOption(WebElement dropdownButton, WebElement dropdownView,
                                     List<WebElement> dropdownOptions, int index) {
        clickOnElementIfReady(dropdownButton);
        waitElementIsVisible(dropdownView);
        String selectedText = dropdownOptions.get(index).getText();
        System.out.println(selectedText);
        dropdownOptions.get(index).click();
        try {
            waitForElementContainsText(dropdownButton, selectedText);
        } catch (TimeoutException ex) {
            //majority of dropdowns change their value to selected option
            //but few of them don't
        }
    }

    /*****************************PAUSES*****************************/

    public void makePause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /*****************************WORKING WITH FILES OF THE PROJECT*****************************/


    public String sikuliPatternsOSSelector() {
        String OSVersion = System.getProperty("os.name");
        String sikuliPattern = null;
        if (OSVersion.equals(Constant.SikuliPatternsForWin10.WINDOWS_10_NAME)) {
            sikuliPattern = Constant.PathsForFilesOfProject.PROJECT_SIKULI_PATTERNS_WIN10;
        } else if (OSVersion.equals(Constant.SikuliPatternsForWin7.WINDOWS_7_NAME)) {
            sikuliPattern = Constant.PathsForFilesOfProject.PROJECT_SIKULI_PATTERNS_WIN7;
        }
        return sikuliPattern;
    }

    public void uploadFileWithHelpOfSikuli(String path) {
        Screen screen = new Screen();
        Pattern uploadInputField = new Pattern(sikuliPatternsOSSelector() + Constant.SikuliPatternsForWin10.UPLOAD_INPUT_FIELD);
        Pattern uploadButton = new Pattern(sikuliPatternsOSSelector() + Constant.SikuliPatternsForWin10.UPLOAD_OPEN_BUTTON);
        try {
            screen.wait(uploadInputField, 5);
            screen.type(uploadInputField, path);
            screen.click(uploadButton);
        } catch (FindFailed e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
