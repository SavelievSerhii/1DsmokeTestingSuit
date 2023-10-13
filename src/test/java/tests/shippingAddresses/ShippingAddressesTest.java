package tests.shippingAddresses;

import constants.Constant;
import org.testng.annotations.Test;
import tests.base.BaseTest;


public class ShippingAddressesTest extends BaseTest {

    @Test
    public void test_01_getToShippingAddressesPage() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        shippingAddressesPage.getToShippingAddressPage();
    }

    @Test
    public void test_02_cancelButtonIsWorkable() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        shippingAddressesPage.getToShippingAddressPage();
        shippingAddressesPage.cancelButtonIsWorkable();
    }

    @Test
    public void test_03_addNewAddressMakeDefaultEditDelete() {
        basePage.login(Constant.Credentials.LOGIN, Constant.Credentials.PASSWORD);
        shippingAddressesPage.getToShippingAddressPage();
        shippingAddressesPage.addNewAddress();
        shippingAddressesPage.makeDefaultAddress();
        shippingAddressesPage.makeDefaultAddress();
        shippingAddressesPage.editAddress();
        shippingAddressesPage.deleteAddress();
    }
}
