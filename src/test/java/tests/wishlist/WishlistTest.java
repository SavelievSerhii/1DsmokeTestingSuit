package tests.wishlist;

import common.Retry;
import constants.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class WishlistTest extends BaseTest {

    @Test
    public void test_01_getToWishlistPage() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_addProductToWishlist() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        wishlistPage.addProductToWishlist();
    }

    @Test
    public void test_03_addTheSameProductToWishlist() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        wishlistPage.addTheSameProductToWishlist();
    }

    @Test
    public void test_04_addProductToComparisonsViaWishlistPage() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.addProductToComparisonsViaWishlist();
    }

    @Test
    public void test_05_addTheSameProductToComparisonsViaWishlistPage() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.addTheSameProductToComparisonsViaWishlist();
    }

    @Test
    public void test_06_checkShareViaEmailWithFriendModalWindowRespond() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.checkShareListWithFriendPopUpWindowCalledUp();
        Assert.assertEquals(wishlistPage.checkShareListWithFriendPopUpWindowRespond(), "rgba(255, 183, 183, 1)");
        wishlistPage.checkCaptchaIsWorkable();
    }

    @Test
    public void test_07_checkWishlistAccessChange() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.changeListAccess();
    }

    //the test is not actual because AddThis services have been deprecated since 05/31/23
//    @Test
//    public void test_08_checkShareButtonsAreWorkable() {
//        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
//        wishlistPage.getToWishlistPage();
//        wishlistPage.checkShareButtons();
//    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_checkSettingsMenuIsWorkable() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.changeWishlistSettings();
    }

    @Test
    public void test_10_deleteProductFromWishlist() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.deleteProductFromWishlist();
    }

    @Test
    public void test_11_deleteEmptyWishlist() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.deleteEmptyWishlist();
    }

    /****************************TESTS WITH TWO WISHLISTS*************************************/
    @Test
    public void test_12_sameNameAnotherWishlistRespond() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        wishlistPage.addProductToWishlist();
        designerPage.openPLPForToteBags();
        customizerPage.openPDPForCustomizer();
        wishlistPage.nameAnotherWishlistTheSameNameRespond();
    }

    @Test
    public void test_13_addSeveralProductsToWishlist() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForDrinkware();
        designerPage.openPDPForDesigner();
        wishlistPage.addSeveralProductsToWishlist();
        designerPage.openPLPForOutdoorAndSporting();
        designerPage.openPDPForDesigner();
        wishlistPage.addSeveralProductsToWishlist();
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        wishlistPage.addSeveralProductsToWishlist();
    }

    @Test
    public void test_14_createSecondWishlist() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        wishlistPage.createSecondWishlist();
    }

    @Test
    public void test_15_makeWishlistDefault() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.makeWishlistDefault();
    }

    @Test
    public void test_16_checkMoveToListFunctionality() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.moveCopyProductToAnotherWishlist();
    }

    @Test
    public void test_17_deleteWishlist() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        wishlistPage.getToWishlistPage();
        wishlistPage.deleteWishlist();
    }
}
