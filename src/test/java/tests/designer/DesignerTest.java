package tests.designer;

import common.Retry;
import constants.Constant;
import org.testng.annotations.Test;
import tests.base.BaseTest;


public class DesignerTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_verifyDesignerPage() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        designerPage.openDesignerPage();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_addProductToCartWithoutAnyModificationsDesigner() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        designerPage.openDesignerPage();
        designerPage.fillInValidDataToProceedToCheckoutSectionDesigner();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_addArtworkClipartTextToProductAddToCartDesigner() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        designerPage.openDesignerPage();
        designerPage.uploadArtworkToOrderDesigner();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillInValidDataToProceedToCheckoutSectionDesigner();
    }
    @Test(retryAnalyzer = Retry.class)
    public void test_04_placeOrderWithTShirtViaDesigner() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        designerPage.openDesignerPage();
        designerPage.uploadArtworkToOrderDesigner();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillInValidDataToProceedToCheckoutSectionDesigner();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_placeOrderWithBagViaDesigner() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForToteBags();
        designerPage.openPDPForDesigner();
        designerPage.openDesignerPage();
        designerPage.uploadArtworkToOrderDesigner();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillInValidDataToProceedToCheckoutSectionDesigner2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_placeOrderWithDrinkwareViaDesigner() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForDrinkware();
        designerPage.openPDPForDesigner();
        designerPage.openDesignerPage();
        designerPage.uploadArtworkToOrderDesigner();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillInValidDataToProceedToCheckoutSectionDesigner2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_placeOrderWithOutdoorAndSportingViaDesigner() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForOutdoorAndSporting();
        designerPage.openPDPForDesigner();
        designerPage.openDesignerPage();
        designerPage.uploadArtworkToOrderDesigner();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillInValidDataToProceedToCheckoutSectionDesigner2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_addToQuoteCart() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        designerPage.openRequestPage();
        customizerPage.fillValidDataAndAddToQuoteCart();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_placeQuoteOrder() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        designerPage.openRequestPage();
        customizerPage.fillInValidDataToProceedToCheckoutSectionCustomizerQuote();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_placeQuoteOrder() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        designerPage.openRequestPage();
        customizerPage.uploadArtworkToProductCustomizer();
        customizerPage.addClipartToProductCustomizer();
        customizerPage.addTextToProductCustomizer();
        customizerPage.fillInValidDataToProceedToCheckoutSectionCustomizerQuote();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_11_addToSampleCart() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        designerPage.openSamplePage();
        designerPage.fillValidDataAndAddToSampleCart();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_12_checkLoginAsGuestRespond() {
        basePage.siteLoginPageOpen();
        basePage.acceptCookies();
        loginPage.surfAsGuest();
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        designerPage.openDesignerPage();
        designerPage.fillInValidDataToProceedToCheckoutSectionDesigner();
        designerPage.goToCheckoutPage();
        loginPage.checkLoginAsGuestRespond();
    }
}
