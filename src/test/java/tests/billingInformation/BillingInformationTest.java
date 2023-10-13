package tests.billingInformation;

import constants.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class BillingInformationTest extends BaseTest {

    @Test
    public void test_01_getToBillingInformationPage() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        billingInformationPage.getToBillingInformationPage();
    }

    @Test
    public void test_02_saveChangesPositive() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        billingInformationPage.getToBillingInformationPage();
        billingInformationPage.saveChangerPositive();
    }

    @Test
    public void test_03_saveChangesNegative() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        billingInformationPage.getToBillingInformationPage();
        Assert.assertEquals(billingInformationPage.saveChangesNegativeScenarioRespond(), "rgba(255, 183, 183, 1)");
    }

    @Test
    public void test_04_cancelButtonIsWorkable() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        billingInformationPage.getToBillingInformationPage();
        billingInformationPage.cancelButtonIsWorkable();
    }
}
