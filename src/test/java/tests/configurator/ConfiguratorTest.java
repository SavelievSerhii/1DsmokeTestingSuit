package tests.configurator;

import common.Retry;
import constants.Constant;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ConfiguratorTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_verifyConfiguratorPage() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForCustomStickers();
        configuratorPage.openPDPForConfigurator();
        designerPage.openDesignerPage();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_addProductToCartWithoutAnyModificationsConfigurator() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForCustomStickers();
        configuratorPage.openPDPForConfigurator();
        designerPage.openDesignerPage();
        configuratorPage.fillInValidDataToAddProductToCart();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_addArtworkClipartTextToProductAddToCart() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForCustomStickers();
        configuratorPage.openPDPForConfigurator();
        designerPage.openDesignerPage();
        configuratorPage.uploadFileToProductConfigurator();
        configuratorPage.addImageToProductConfigurator();
        configuratorPage.addTextToProductConfigurator();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_placeOrderWithCustomStickerViaConfigurator() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForCustomStickers();
        configuratorPage.openPDPForConfigurator();
        designerPage.openDesignerPage();
        configuratorPage.uploadFileToProductConfigurator();
        configuratorPage.addImageToProductConfigurator();
        configuratorPage.addTextToProductConfigurator();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_placeOrderCustomStickerViaConfigurator2() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForCustomStickers();
        configuratorPage.openPDPForConfigurator2();
        designerPage.openDesignerPage();
        configuratorPage.quickStartMenuDealWith();
        configuratorPage.uploadFileToProductConfigurator2();
        configuratorPage.addImageToProductConfigurator2();
        configuratorPage.addTextToProductConfigurator2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_placeOrderCustomStickerViaConfigurator3() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForCustomStickers();
        configuratorPage.openPDPForConfigurator3();
        designerPage.openDesignerPage();
        configuratorPage.quickStartMenuDealWith();
        configuratorPage.uploadFileToProductConfigurator2();
        configuratorPage.addImageToProductConfigurator2();
        configuratorPage.addTextToProductConfigurator2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_placeOrderBusinessCardViaConfigurator() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForBusinessCards();
        configuratorPage.openPDPForConfigurator();
        designerPage.openDesignerPage();
        configuratorPage.uploadFileToProductConfigurator();
        configuratorPage.addImageToProductConfigurator();
        configuratorPage.addTextToProductConfigurator2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_placeOrderBusinessCardViaConfigurator2() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForBusinessCards();
        configuratorPage.openPDPForConfigurator2();
        designerPage.openDesignerPage();
        configuratorPage.quickStartMenuDealWith();
        configuratorPage.uploadFileToProductConfigurator2();
        configuratorPage.addImageToProductConfigurator2();
        configuratorPage.addTextToProductConfigurator2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_placeOrderBusinessCardViaConfigurator3() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForBusinessCards();
        configuratorPage.openPDPForConfigurator3();
        designerPage.openDesignerPage();
        configuratorPage.quickStartMenuDealWith();
        configuratorPage.uploadFileToProductConfigurator();
        configuratorPage.addImageToProductConfigurator2();
        configuratorPage.addTextToProductConfigurator2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_placeOrderEnvelopeViaConfigurator() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForEnvelopes();
        configuratorPage.openPDPForConfigurator();
        designerPage.openDesignerPage();
        configuratorPage.uploadFileToProductConfigurator();
        configuratorPage.addImageToProductConfigurator();
        configuratorPage.addTextToProductConfigurator2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_11_placeOrderPostcardViaConfigurator() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        configuratorPage.openPLPForPostcards();
        configuratorPage.openPDPForConfigurator();
        designerPage.openDesignerPage();
        configuratorPage.uploadFileToProductConfigurator();
        configuratorPage.addImageToProductConfigurator();
        configuratorPage.addTextToProductConfigurator2();
        designerPage.goToCheckoutPage();
        designerPage.checkoutProcedureImplement();
        designerPage.creditCardProcess();
    }
}
