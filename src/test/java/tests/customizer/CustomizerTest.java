package tests.customizer;

import common.Retry;
import constants.Constant;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CustomizerTest extends BaseTest {


    @Test(retryAnalyzer = Retry.class)
    public void test_01_verifyCustomizerPage() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        customizerPage.openCustomizerPage();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_addProductToCartWithoutAnyModificationsCustomizer() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        customizerPage.openCustomizerPage();
        customizerPage.fillInValidDataToProductToAddToCartCustomizer();
        customizerPage.addProductToCartViaCustomizer();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_addArtworkClipartTextToProductAddProductToCart() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        customizerPage.openCustomizerPage();
        customizerPage.uploadArtworkToProductCustomizer();
        customizerPage.addClipartToProductCustomizer();
        customizerPage.addTextToProductCustomizer();
        customizerPage.fillInValidDataToProductToAddToCartCustomizer();
        customizerPage.addProductToCartViaCustomizer();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_placeOrderViaCustomizer() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        customizerPage.openCustomizerPage();
        customizerPage.uploadArtworkToProductCustomizer();
        customizerPage.addClipartToProductCustomizer();
        customizerPage.addTextToProductCustomizer();
        customizerPage.fillInValidDataToProductToAddToCartCustomizer();
        customizerPage.addProductToCartViaCustomizer();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_placeOrderWithBagViaCustomizer() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForToteBags();
        customizerPage.openPDPForCustomizer();
        customizerPage.openCustomizerPage();
        customizerPage.uploadArtworkToProductCustomizer();
        customizerPage.addClipartToProductCustomizer();
        customizerPage.addTextToProductCustomizer();
        customizerPage.fillInValidDataToBagAddToCartCustomizer();
        customizerPage.addProductToCartViaCustomizer();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_placeOrderWithDrinkwareViaCustomizer() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForDrinkware();
        customizerPage.openPDPForCustomizer();
        customizerPage.openCustomizerPage();
        customizerPage.uploadArtworkToProductCustomizer();
        customizerPage.addClipartToProductCustomizer();
        customizerPage.addTextToProductCustomizer();
        customizerPage.fillInValidDataToBagAddToCartCustomizer();
        customizerPage.addProductToCartViaCustomizer();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_placeOrderWithOutdoorAndSportingViaCustomizer() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForOutdoorAndSporting();
        customizerPage.openPDPForCustomizer();
        customizerPage.openCustomizerPage();
        customizerPage.uploadArtworkToProductCustomizer();
        customizerPage.addClipartToProductCustomizer();
        customizerPage.addTextToProductCustomizer();
        customizerPage.fillInValidDataToBagAddToCartCustomizer();
        customizerPage.addProductToCartViaCustomizer();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_addToQuoteCart() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        designerPage.openRequestPage();
        customizerPage.fillValidDataAndAddToQuoteCart();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_9_placeQuoteOrder() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        designerPage.openRequestPage();
        customizerPage.fillInValidDataToProceedToCheckoutSectionCustomizerQuote();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_placeQuoteOrder() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        designerPage.openRequestPage();
        customizerPage.uploadArtworkToProductCustomizer();
        customizerPage.addClipartToProductCustomizer();
        customizerPage.addTextToProductCustomizer();
        customizerPage.fillInValidDataToProceedToCheckoutSectionCustomizerQuote();
    }

    @Test
    public void test_11_addToSampleCart() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        designerPage.openSamplePage();
        designerPage.fillValidDataAndAddToSampleCart();
    }
}
