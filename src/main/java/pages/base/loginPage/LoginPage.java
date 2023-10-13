package pages.base.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;


import static constants.Constant.Credentials.*;
import static constants.Constant.TimeoutVariable.*;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /***************************GUEST PAGE LOGIN ELEMENTS***************************/

    private final By guestEmailField = By.id("guest_email");

    private final By checkoutAsGuestButton = By.xpath("//button[contains(.,' CHECKOUT AS GUEST ')]");

    private final By emailAlreadyAssociated = By.id("email_error_guest_exists");

    /***************************LOGIN PAGE ELEMENTS***************************/

    private final By deluxeLogo = By.xpath("//img[@alt='InkHead Promotional Products by Deluxe']");

    private final By signedOutBanner = By.xpath("//h1[contains(text(),'Signed Out')]");

    private final By forgotPasswordLink = By.xpath("//a[contains(text(),'Forgot password?')]");

    private final By createAccountButton = By.xpath("//a[contains(text(),'Create an account')]");

    private final By createAccountEmailField = By.id("hdn_email");

    private final By resetPasswordHeader = By.xpath("//h1[contains(text(),'Reset Password')]");

    private final By warningBannerNotSuccessSignIn =
            By.xpath("//span[contains(text(),'Sorry, the email address and password you entered was not recognized.')]");

    /*************************SITE MAIN PAGE ELEMENTS***************************/
    private final By customerDropDownMenu = By.xpath("//ul/li[@class='dropdown account-menu-item']");



    /*************************FACEBOOK AUXILIARY PAGE ELEMENTS***************************/

    private final By facebookAuthentificationButton = By.xpath("//a[@href='javascript:;']");

    private final By cookiesAcceptButtonFacebookPage = By.xpath("//button[contains(.,'Allow all cookies')]");

    private final By facebookEmailField = By.id("email");
    private final By facebookPasswordField = By.id("pass");

    private final By facebookSubmitButton = By.name("login");


    /*************************GOOGLE AUXILIARY PAGE ELEMENTS***************************/

    private final By googleSignInButton = By.id("googleSignInBtn");

    private final By googleMark = By.xpath("//div[@class='XhfvJd']");

    private final By shopBusinessCheckAndSuppliesButton = By.xpath("//a[@class='btn-default btn-block btn-lg custom-btn new-window-link']");

    private final By getShopBusinessCheckAndSuppliesAccountLink = By.xpath("//span[@class='account_dd_container']");

    private final By googleEmailField = By.id("identifierId");

    private final By googleNextButton = By.id("identifierNext");

    private final By googlePasswordField = By.id("password");

    private final By googlePasswordNextButton = By.id("passwordNext");

    /*************************CHAT LINK ELEMENTS***************************/

    private final By liveChatLink = By.xpath("//div[@class='row']//a[@class='sign-in-out-a']");

    public final By frameLiveChatWindow = By.id("chat-widget");

    private final By liveChatWindow = By.xpath("//h1[@class='lc-ptrtto e7bf83j3']");



    /***************************************************************************************************/

    public LoginPage fillCredentials(String login, String password) {
        driver.findElement(emailField).sendKeys(login);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage clickToEnter() {
        WebElement button = driver.findElement(loginButton);
        waitElementIsVisible(button).click();
        return this;
    }

    /*************************MAIN_METHODS_FOR_TESTING***************************/

    public LoginPage checkLoginPage(String text) {
        WebElement element = driver.findElement(forgotPasswordLink);
        waitForElementContainsText(element, text);
        return this;
    }

    public LoginPage verifyLoginImplemented() {
        WebElement icon = driver.findElement(accountIcon);
        waitElementIsVisible(icon);
        return this;
    }

    public LoginPage verifyForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
        WebElement header = driver.findElement(resetPasswordHeader);
        waitElementIsVisible(header);
        return this;
    }

    public LoginPage verifyCreateAccountLinkIsWorkable() {
        siteLoginPageOpen();
        makePause(SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(createAccountButton)).click();
        makePause(SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(createAccountEmailField)).click();
        makePause(VERY_SHORT_SLEEP);
        return this;
    }


      public LoginPage loginToSite() {
          siteLoginPageOpen();
          makePause(SHORT_SLEEP);
          waitElementIsVisible(driver.findElement(emailField)).clear();
          waitElementIsVisible(driver.findElement(emailField)).sendKeys(LOGIN);
          waitElementIsVisible(driver.findElement(passwordField)).clear();
          waitElementIsVisible(driver.findElement(passwordField)).sendKeys(PASSWORD);
          makePause(VERY_SHORT_SLEEP);
          waitElementIsVisible(driver.findElement(loginButton)).click();
          makePause(SHORT_SLEEP);
          waitElementIsVisible(driver.findElement(accountIcon));
          return this;
      }

     public LoginPage notValidCredentialsResponse() {
         siteLoginPageOpen();
         makePause(SHORT_SLEEP);
         waitElementIsVisible(driver.findElement(emailField)).clear();
         waitElementIsVisible(driver.findElement(emailField)).sendKeys(NON_VALID_LOGIN);
         makePause(SHORT_SLEEP);
         waitElementIsVisible(driver.findElement(passwordField)).clear();
         waitElementIsVisible(driver.findElement(passwordField)).sendKeys(NON_VALID_PASSWORD);
         makePause(SHORT_SLEEP);
         waitElementIsVisible(driver.findElement(loginButton)).click();
         waitElementIsVisible(driver.findElement(warningBannerNotSuccessSignIn));
         return this;
     }


    public LoginPage verifyFacebookAuthenticationButtonWorkable() {
        siteLoginPageOpen();
        makePause(SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(facebookAuthentificationButton)).click();
        makePause(SHORT_SLEEP);
        switchToNewWindow();
        driver.manage().window().maximize();
        waitElementIsVisible(driver.findElement(cookiesAcceptButtonFacebookPage)).click();
        driver.close();
        switchToDefaultWindow();
//        waitElementIsVisible(driver.findElement(facebookEmailField)).clear();
//        waitElementIsVisible(driver.findElement(facebookEmailField)).sendKeys(FACEBOOK_LOGIN);
//        waitElementIsVisible(driver.findElement(facebookPasswordField)).clear();
//        waitElementIsVisible(driver.findElement(facebookPasswordField)).sendKeys(FACEBOOK_PASSWORD);
//        waitElementIsVisible(driver.findElement(facebookSubmitButton)).click();
//        makePause(LONG_SLEEP);
//        switchToDefaultWindow();
//        makePause(NORMAL_SLEEP);
//        waitElementIsVisible(driver.findElement(facebookAuthentificationButton)).click();
//        hoverOverElement(driver.findElement(accountIcon));
//        waitElementIsVisible(driver.findElement(logOutLink)).click();
//        driver.manage().deleteAllCookies();
        return this;
    }

    public LoginPage verifyGoogleAuthenticationButtonWorkable() {
        siteLoginPageOpen();
        makePause(VERY_SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(googleSignInButton)).click();
        makePause(SHORT_SLEEP);
        switchToNewWindow();
        driver.manage().window().maximize();
        waitElementIsVisible(driver.findElement(googleEmailField)).clear();
        driver.close();
//        waitElementIsVisible(driver.findElement(googleEmailField)).sendKeys(GOOGLE_LOGIN);
//        waitElementIsVisible(driver.findElement(googleEmailField)).sendKeys(Keys.ENTER);
//        waitElementIsVisible(driver.findElement(googleNextButton)).click();
//        waitElementIsVisible(driver.findElement(googlePasswordField)).clear();
//        waitElementIsVisible(driver.findElement(googlePasswordField)).sendKeys(GOOGLE_PASSWORD);
//        waitElementIsVisible(driver.findElement(googlePasswordField)).sendKeys(Keys.ENTER);
//        waitElementIsVisible(driver.findElement(googlePasswordNextButton)).click();
//        makePause(LONG_SLEEP);
//        switchToDefaultWindow();
//        makePause(NORMAL_SLEEP);
//        waitElementIsVisible(driver.findElement(googleSignInButton)).click();
//        hoverOverElement(driver.findElement(accountIcon));
//        waitElementIsVisible(driver.findElement(logOutLink)).click();
//        driver.manage().deleteAllCookies();
        return this;
    }

    public LoginPage verifyShopBusinessChecksAndSuppliesButtonWorkable() {
        siteLoginPageOpen();
        makePause(SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(shopBusinessCheckAndSuppliesButton)).click();
        switchToNewWindow();
        waitElementIsVisible(driver.findElement(getShopBusinessCheckAndSuppliesAccountLink));
        hoverOverElement(driver.findElement(getShopBusinessCheckAndSuppliesAccountLink));
        switchToDefaultWindow();
        makePause(NORMAL_SLEEP);
        driver.manage().deleteAllCookies();
        driver.quit();
        return this;
    }

    public LoginPage verifyLiveChatWindow() {
        siteLoginPageOpen();
        waitForJSToBeLoaded();
        makePause(SHORT_SLEEP);
        driver.findElement(acceptCookiesMainBannerOnLoginPage).click();
        makePause(SHORT_SLEEP);
        jsScrollDown();
        hoverOverElement(driver.findElement(liveChatLink));
        waitElementIsVisible(driver.findElement(liveChatLink));
        makePause(SHORT_SLEEP);
        for (int i = 0; i < 11; i++) {
            clickOnElementIfReady(driver.findElement(liveChatLink));
        }
        makePause(VERY_LONG_SLEEP);
        switchToFrame(driver.findElement(frameLiveChatWindow));
        waitElementIsVisible(driver.findElement(liveChatWindow));
        return this;
    }

    public LoginPage logOut() {
        hoverOverElement(driver.findElement(customerDropDownMenu));
        waitElementIsVisible(driver.findElement(logOutLink)).click();
        driver.manage().deleteAllCookies();
        waitElementIsVisible(driver.findElement(signedOutBanner));
        return this;
    }

    public void surfAsGuest() {
        hoverOverElement(driver.findElement(deluxeLogo));
        clickOnElementIfReady(driver.findElement(deluxeLogo));
        waitForJSToBeLoaded();
    }

    public void checkLoginAsGuestRespond() {
//        LocalDateTime localDateTime = LocalDateTime.now();
//        String idForGuestCredentialsGenerator = localDateTime.getDayOfMonth() + "." + localDateTime.getMonthValue() + "."
//                + localDateTime.getDayOfYear() + "_" + localDateTime.getHour() + "." + localDateTime.getMinute() + "." + localDateTime.getSecond();
//        waitElementIsVisible(driver.findElement(guestEmailField)).clear();
//        clickOnElementIfReady(driver.findElement(guestEmailField)).sendKeys(idForGuestCredentialsGenerator + "@autotest.com");
        waitElementIsVisible(driver.findElement(guestEmailField)).clear();
        clickOnElementIfReady(driver.findElement(guestEmailField)).sendKeys("guest@gfl.com");
        waitElementIsVisible(driver.findElement(checkoutAsGuestButton));
        clickOnElementIfReady(driver.findElement(checkoutAsGuestButton));
        waitForJSToBeLoaded();
//        makePause(SHORT_SLEEP);
//        waitElementIsVisible(driver.findElement(emailAlreadyAssociated));
    }

}
