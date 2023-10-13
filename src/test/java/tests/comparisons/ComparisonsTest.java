package tests.comparisons;

import constants.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ComparisonsTest extends BaseTest {

    @Test
    public void test_01_getToComparisonsPage() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        comparisonsPage.getToComparisonsPage();
    }

    @Test
    public void test_02_addProductToComparisons() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        comparisonsPage.addProductToComparisons();
    }

    @Test
    public void test_03_addTheSameProductToComparisons() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        designerPage.openPLPForTShirts();
        customizerPage.openPDPForCustomizer();
        comparisonsPage.addTheSameProductToComparisons();
    }

    @Test
    public void test_04_checkComparisonsCapacityLimit() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);

        designerPage.openPLPForDrinkware();
        customizerPage.openPDPForCustomizer();
        comparisonsPage.addProductToComparisons();

        designerPage.openPLPForOutdoorAndSporting();
        customizerPage.openPDPForCustomizer();
        comparisonsPage.addProductToComparisons();

        designerPage.openPLPForToteBags();
        customizerPage.openPDPForCustomizer();
        comparisonsPage.addProductToComparisons();

        designerPage.openPLPForTShirts();
        designerPage.openPDPForDesigner();
        comparisonsPage.addProductToComparisons();

        designerPage.openPLPForToteBags();
        designerPage.openPDPForDesigner();
        comparisonsPage.addProductToComparisons();

        designerPage.openPLPForOutdoorAndSporting();
        designerPage.openPDPForDesigner();

        comparisonsPage.checkComparisonsCapacityLimit();
    }

    @Test
    public void test_05_checkLinkNavigation() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        comparisonsPage.getToComparisonsPage();
        Assert.assertEquals(comparisonsPage.checkLinkIsWorkable(), driver.findElement(comparisonsPage.productNameSign).getText());
    }

    @Test
    public void test_06_checkShareFunctionality() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        comparisonsPage.getToComparisonsPage();
        Assert.assertEquals(comparisonsPage.checkShareFunctionality(), "rgba(255, 183, 183, 1)");
    }

    @Test
    public void test_07_removeProductFromComparisons() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        comparisonsPage.getToComparisonsPage();
        comparisonsPage.removeProductFromComparisons();
    }


}
