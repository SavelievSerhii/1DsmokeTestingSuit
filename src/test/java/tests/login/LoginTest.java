package tests.login;

import common.Retry;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Credentials.LOGIN;
import static constants.Constant.Credentials.PASSWORD;
import static constants.Constant.UrlsToInteract.SIGN_IN_URL;

public class LoginTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_checkLoginPage() {
        basePage.openPage(SIGN_IN_URL);
        loginPage.notValidCredentialsResponse();
        loginPage.loginToSite();
        loginPage.logOut();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_loginToSiteUsingCredentials() {
        basePage.openPage(SIGN_IN_URL);
        loginPage.fillCredentials(LOGIN, PASSWORD);
        loginPage.clickToEnter();
        loginPage.verifyLoginImplemented();
        loginPage.logOut();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_forgotPasswordLinkIsWorkable() {
        basePage.openPage(SIGN_IN_URL);
        loginPage.verifyForgotPasswordLink();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_createAccountButtonIsWorkable() {
        basePage.openPage(SIGN_IN_URL);
        loginPage.verifyCreateAccountLinkIsWorkable();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_facebookLinkIsWorkable() {
        loginPage.verifyFacebookAuthenticationButtonWorkable();
    }
    @Test(retryAnalyzer = Retry.class)
    public void test_06_googleLinkIsWorkable() {
        loginPage.verifyGoogleAuthenticationButtonWorkable();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_shopBusinessCheckAndSuppliesButtonWorkable() {
        basePage.openPage(SIGN_IN_URL);
        loginPage.verifyShopBusinessChecksAndSuppliesButtonWorkable();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_wrongCredentialsResponseTesting() {
        basePage.openPage(SIGN_IN_URL);
        loginPage.notValidCredentialsResponse();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_liveChatLinkIsWorkable() {
        basePage.openPage(SIGN_IN_URL);
        loginPage.verifyLiveChatWindow();
    }
}
