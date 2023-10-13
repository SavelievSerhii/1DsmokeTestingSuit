package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.base.billingInformationPage.BillingInformationPage;
import pages.base.comparisonsPage.ComparisonsPage;
import pages.base.configuratorPage.ConfiguratorPage;
import pages.base.customizerPage.CustomizerPage;
import pages.base.designerPage.DesignerPage;
import pages.base.loginPage.LoginPage;
import pages.base.shippingAddressesPage.ShippingAddressesPage;
import pages.base.wishlistPage.WishlistPage;

import static common.Settings.CLEAR_COOKIES_AND_STORAGE;
import static common.Settings.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected DesignerPage designerPage = new DesignerPage(driver);
    protected CustomizerPage customizerPage = new CustomizerPage(driver);
    protected ConfiguratorPage configuratorPage = new ConfiguratorPage(driver);
    protected ShippingAddressesPage shippingAddressesPage = new ShippingAddressesPage(driver);
    protected WishlistPage wishlistPage = new WishlistPage(driver);
    protected ComparisonsPage comparisonsPage = new ComparisonsPage(driver);
    protected BillingInformationPage billingInformationPage = new BillingInformationPage(driver);

    @AfterMethod
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
