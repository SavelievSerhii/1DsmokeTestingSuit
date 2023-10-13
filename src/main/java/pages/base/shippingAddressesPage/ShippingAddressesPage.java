package pages.base.shippingAddressesPage;

import constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.List;

public class ShippingAddressesPage extends BasePage {
    public ShippingAddressesPage(WebDriver driver) {
        super(driver);
    }

    /*************************************SHIPPING ADDRESSES PAGE ELEMENTS**********************************/

    private final By customerDropDownMenu = By.xpath("//ul/li[@class='dropdown account-menu-item']");

    private final By myAccountLink = By.xpath("//a[@href='/products/secure/myaccount/']");

    private final By shippingAddressLink = By.xpath("//a[@href='/products/secure/addresses/']");

    private final By manageShippingAddressTitle = By.xpath("//h1[contains(.,'Manage Shipping Addresses')]");

    private final By cancelButton = By.xpath("//a[contains(.,'Cancel')]");

    private final By profilePageTitle = By.xpath("//h3[contains(.,'Your Profile')]");

    private final By addNewAddressButton = By.xpath("//a[@href='/products/secure/addresses/new/']");

    private final By addressLabelField = By.id("addressLabel");

    private final By countryDropDownMenu = By.xpath("//select[@id='countryID']//option[@value='1']");

    private final By firstNameField = By.id("firstName");

    private final By lastNameField = By.id("lastName");

    private final By companyNameField = By.id("companyName");

    private final By address1Field = By.id("address1");

    private final By cityFiled = By.id("city");

    private final By stateProvinceField = By.xpath("//select[@id='stateID']//option[@value='53']");

    private final By zipCodeField = By.id("zipCode");
    private final By saveChangesButton = By.xpath("//input[@value='Save Changes']");

    private final By successModalWindow = By.id("modalTitle");

    private final By backToYourAddressButton = By.xpath("//button[contains(.,'Back to Your Addresses')]");
    private final By getMakeDefaultAddressButtonsList = By.xpath("//div[@class='row addresses']//a[@class='btn btn-default']");

    private final By getEditButtonsList = By.xpath("//div[@class='row addresses']//a[contains(.,'Edit')]");

    private final By getDeleteAddressButtons = By.xpath("//div[@class='row addresses']//a[contains(.,'Delete')]");

    private final By primaryAddressUpdatedModalWindow = By.id("msg-body");

    private final By confirmOnModalWindowButton = By.xpath("//button[contains(.,'OK')]");


    /*************************************SHIPPING ADDRESSES PAGE MAIN LOGIC**********************************/

    public void getToShippingAddressPage() {
        hoverOverElement(driver.findElement(customerDropDownMenu));
        waitElementIsVisible(driver.findElement(myAccountLink));
        clickOnElementIfReady(driver.findElement(myAccountLink));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(shippingAddressLink));
        clickOnElementIfReady(driver.findElement(shippingAddressLink));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(manageShippingAddressTitle));
    }

    public void cancelButtonIsWorkable() {
        waitElementIsVisible(driver.findElement(cancelButton));
        clickOnElementIfReady(driver.findElement(cancelButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(profilePageTitle));
        makePause(1500);
    }

    public void addNewAddress() {
        waitElementIsVisible(driver.findElement(addNewAddressButton));
        clickOnElementIfReady(driver.findElement(addNewAddressButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(addressLabelField)).sendKeys(Constant.NewShippingAddressData.ADDRESS_LABEL);
        waitElementIsVisible(driver.findElement(countryDropDownMenu));
        clickOnElementIfReady(driver.findElement(countryDropDownMenu));
        waitElementIsVisible(driver.findElement(firstNameField)).sendKeys(Constant.NewShippingAddressData.FIRST_NAME);
        waitElementIsVisible(driver.findElement(lastNameField)).sendKeys(Constant.NewShippingAddressData.LAST_NAME);
        waitElementIsVisible(driver.findElement(companyNameField)).sendKeys(Constant.NewShippingAddressData.COMPANY_NAME);
        waitElementIsVisible(driver.findElement(address1Field)).sendKeys(Constant.NewShippingAddressData.ADDRESS_1);
        waitElementIsVisible(driver.findElement(cityFiled)).sendKeys(Constant.NewShippingAddressData.CITY_NAME);
        clickOnElementIfReady(driver.findElement(stateProvinceField));
        waitElementIsVisible(driver.findElement(zipCodeField)).sendKeys(Constant.NewShippingAddressData.ZIP_CODE);
        waitElementIsVisible(driver.findElement(saveChangesButton));
        clickOnElementIfReady(driver.findElement(saveChangesButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(successModalWindow));
        waitElementIsVisible(driver.findElement(backToYourAddressButton));
        clickOnElementIfReady(driver.findElement(backToYourAddressButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(manageShippingAddressTitle));
    }

    public void makeDefaultAddress() {
        List<WebElement> elements = driver.findElements(getMakeDefaultAddressButtonsList);
        for (int i = 0; i < elements.size(); i++) {
            clickOnElementIfReady(elements.get(1));
            break;
        }
        waitElementIsVisible(driver.findElement(primaryAddressUpdatedModalWindow));
    }

    public void editAddress() {
        List<WebElement> elements = driver.findElements(getEditButtonsList);
        for (int i = 0; i < elements.size(); i++) {
            clickOnElementIfReady(elements.get(1));
            break;
        }
        waitElementIsVisible(driver.findElement(companyNameField)).clear();
        clickOnElementIfReady(driver.findElement(companyNameField)).sendKeys("gfl");
        waitElementIsVisible(driver.findElement(saveChangesButton));
        clickOnElementIfReady(driver.findElement(saveChangesButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(successModalWindow));
        waitElementIsVisible(driver.findElement(backToYourAddressButton));
        clickOnElementIfReady(driver.findElement(backToYourAddressButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(manageShippingAddressTitle));
    }

    public void deleteAddress() {
        List<WebElement> elements = driver.findElements(getDeleteAddressButtons);
        for (int i = 0; i < elements.size(); i++) {
            clickOnElementIfReady(elements.get(1));
            break;
        }
        waitElementIsVisible(driver.findElement(confirmOnModalWindowButton));
        clickOnElementIfReady(driver.findElement(confirmOnModalWindowButton));
        waitElementIsVisible(driver.findElement(primaryAddressUpdatedModalWindow));
        waitForJSToBeLoaded();
    }

}
