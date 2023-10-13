package pages.base.designerPage;

import constants.Constant;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;


import java.util.List;


public class DesignerPage extends BasePage {
    public DesignerPage(WebDriver driver) {
        super(driver);
    }

    /***************************GUEST PAGE LOGIN ELEMENTS***************************/

    private final By guestEmailField = By.id("guest_email");

    /***************************PRODUCT DESCRIPTION PAGE ELEMENTS***************************/

    public final By promotionalProductsNavigationBar = By.xpath("//li[2]//a[contains(.,\"Promotional Products & Apparel\")]");
    public final By apparelOptionOfPromotionalProducts = By.xpath("//ul[@id='menu']//li[@class='ui-menu-item']/a[contains(.,'Apparel')]");

    public final By bagsOptionOfPromotionalProducts = By.xpath("//ul[@id='menu']//li[@class='ui-menu-item']/a[contains(.,'Bags')]");

    public final By drinkwareOfPromotionalProducts = By.xpath("//ul[@id='menu']//li[@class='ui-menu-item']/a[contains(.,'Drinkware')]");
    public final By outdoorAndSportingOfPromotionalProducts = By.xpath("//ul[@id='menu']//li[@class='ui-menu-item']/a[contains(.,' Outdoor and Sporting ')]");

    public static By designerButtonLocator = By.cssSelector(".js-add-to-designer");

    @FindBy(css = ".js-add-to-designer")
    public WebElement designerButton;

    /***************************DESIGNER PAGE ELEMENTS***************************/

    public final  By addArtworkButton = By.xpath("//div[@class='row visible-lg']//button[contains(@title,'Add an Image')]");

    public static final By quantityOfItem = By.id("quantity");

    public static final By fieldForQuantity = By.id("comments_129_5125");

    public final By imprintColorField = By.id("comments_13");

    public static final By addToCartButton = By.xpath("//button[contains(text(),'Add to Cart')]");

    public static final By shoppingCartTitle = By.xpath("//h1[contains(text(),'Your Shopping Cart')]");

    public static final By formUpload = By.id("formUpload");

    public final By artworkOnProduct = By.xpath("//*[@id=\"ihd-canvas-wrapper\"]//canvas[2]");

    public final By addClipartToProductButton = By.xpath("//button[@class='ihd-add-clipart btn btn-success btn-block']");

    public final By animalsLink = By.xpath("//div[@id='modal-clipart']//a[contains(.,'Animals')]");

    public final By animalLogo = By.xpath("//img[@src='/products/ihfiles/ClipArt/t/1.png']");

    public final By addTextToProductButton = By.xpath("//button[@class='ihd-add-text btn btn-success btn-block']");

    public final By modifyingTextArea = By.xpath("//textarea[@id='ihd-textarea_1']");

    public final By curveTextButton = By.xpath("//a[@title = 'Switch between curved and normal Text']");

    /***************************SHOPPING CART PAGE ELEMENTS***************************/
    public static final By checkoutButton = By.xpath("//div[@class='col-sm-4 text-right']//a[@href='/products/secure/checkout/']");

    /***************************CHECKOUT PAGE ELEMENTS***************************/

    public final By warningPopUpWindow = By.id("bootboxBody");

    public final By warningPopUpWindowOkButton = By.xpath("//button[contains(.,'OK')]");


    public final By buyingReasonDropDownMenu = By.id("sel_buying_reason");

    public final By buyingReasonChoice = By.xpath("//select[@id='sel_buying_reason']//option[@value='7']");

    public final By discountCodeInputField = By.id("txt_couponcode");

    public final By applyDiscountButton = By.id("btn_coupon");

    public final By creditCardButton = By.xpath("//div[@id='cc_container']//button[@class='btn btn-primary btn-lg btn-block pay_btn']");


    /**************************CREDIT CARD POP UP WINDOW ELEMENTS*************************************/

        public final By creditCardPopUpWindow = By.id("form_payments_cc");

    public final By creditCardHolderNameInputField = By.id("cardholder_name");

    public final By creditCardNumberInputField = By.id("credit-card-number");

    public final By frameCreditCardNumberInputField = By.id("braintree-hosted-field-number");

    public final By creditCardExpirationMonthInputField = By.id("expiration-month");

    public final By frameCreditCardExpirationMonthInputField = By.id("braintree-hosted-field-expirationMonth");

    public final By creditCardExpirationYearInputField = By.id("expiration-year");

    public final By frameCreditCartExpirationYearInputField = By.id("braintree-hosted-field-expirationYear");

    public final By creditCardCVVCodeInputField = By.id("cvv");

    public final By frameCreditCardCVVCodeInputField = By.id("braintree-hosted-field-cvv");

    public final By zipCodeInputField = By.id("postal-code");

    public final By frameZipCodeInputField = By.id("braintree-hosted-field-postalCode");

    public final By creditCardApplySubmitButton = By.id("button_cc");

    public final By goToMyAccountButtonOrderConfirmation = By.xpath("//a[@class='btn-default btn-block btn-lg custom-btn']");

    public final By requestQuoteButton = By.id("button-quote");

    public final By requestSampleButton = By.id("button-sample");

    public final By orderDueDate = By.xpath("//div[@class='input-group']//input[@id='order-due-date']");

    public final By datePickerSwitch = By.xpath("//th[@class='datepicker-switch']");

    public final By nextMonthButton = By.xpath("//th[@class='next']");

    public final By daysQuantity = By.xpath("//td[@class='day']");

    public final By agreeToFreeSamplePolicyCheckBox = By.xpath("//label[@for='terms']");

    public final By addToSampleCartButton = By.xpath("//input[@value='Add to Samples Cart']");

    public final By samplesCartTitle = By.xpath("//h1[contains(.,'Samples Cart')]");

    public final By requestSamplesInSamplesCartButton = By.xpath("//a[contains(.,'Request Samples')]");





    /***************************MAIN METHODS***************************/

    public void openPLPForTShirts() {
        clickOnElementIfReady(driver.findElement(promotionalProductsNavigationBar));
        waitForJSToBeLoaded();
        clickOnElementIfReady(driver.findElement(apparelOptionOfPromotionalProducts));
        waitForJSToBeLoaded();
        clickOnElementIfReady(driver.findElement(tShirtsOptionOnPLP));
        waitForJSToBeLoaded();
    }

    public void openPLPForToteBags() {
        clickOnElementIfReady(driver.findElement(promotionalProductsNavigationBar));
        waitForJSToBeLoaded();
        clickOnElementIfReady(driver.findElement(bagsOptionOfPromotionalProducts));
        waitForJSToBeLoaded();
        clickOnElementIfReady(driver.findElement(toteBagsOptionOnPLP));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void openPLPForDrinkware() {
        clickOnElementIfReady(driver.findElement(promotionalProductsNavigationBar));
        waitForJSToBeLoaded();
        clickOnElementIfReady(driver.findElement(drinkwareOfPromotionalProducts));
        waitForJSToBeLoaded();
    }

    public void openPLPForOutdoorAndSporting() {
        clickOnElementIfReady(driver.findElement(promotionalProductsNavigationBar));
        waitForJSToBeLoaded();
        clickOnElementIfReady(driver.findElement(outdoorAndSportingOfPromotionalProducts));
        waitForJSToBeLoaded();
    }

    public void openPDPForDesigner() {

        List<WebElement> productsOnPLP = driver.findElements(By.xpath("//div[@class='col-lg-10']//div[3]//h2"));

        for (int i = 0; i < productsOnPLP.size(); i++) {
            try
            {
                waitElementIsVisible(productsOnPLP.get(i));
            }
            catch (StaleElementReferenceException e)
            {
                productsOnPLP = driver.findElements(By.xpath("//div[@class='col-lg-10']//div[3]//h2"));
                waitElementIsVisible(productsOnPLP.get(i));
            }
            clickOnElementIfReady(productsOnPLP.get(i));
            makePause(1500);
            waitForJSToBeLoaded();
            if (!isElementPresent(designerButtonLocator)) {
                driver.navigate().back();
            } else break;
        }
        waitForJSToBeLoaded();
    }

    public void openDesignerPage() {
        waitElementIsVisible(driver.findElement(designerButtonLocator));
        clickOnElementIfReady(driver.findElement(designerButtonLocator));
        waitForJSToBeLoaded();
        makePause(7000);
        waitForJSToBeLoaded();
    }


    public void fillInValidDataToProceedToCheckoutSectionDesigner() {
        String quantity = driver.findElement(quantityOfItem).getAttribute("value").trim();
        waitElementIsVisible(driver.findElement(fieldForQuantity)).clear();
        waitElementIsVisible(driver.findElement(fieldForQuantity)).sendKeys(quantity);
        makePause(1500);
        waitElementIsVisible(driver.findElement(imprintColorField)).clear();
        waitElementIsVisible(driver.findElement(imprintColorField)).sendKeys("White");
        makePause(1500);
        waitElementIsVisible(driver.findElement(addToCartButton));
        jsClick(driver.findElement(addToCartButton));
        makePause(3000);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(shoppingCartTitle));
        waitElementIsVisible(driver.findElement(checkoutButton));
    }

    public void fillInValidDataToProceedToCheckoutSectionDesigner2() {
        waitElementIsVisible(driver.findElement(imprintColorField)).sendKeys("white");
        makePause(1500);
        waitElementIsVisible(driver.findElement(addToCartButton));
        jsClick(driver.findElement(addToCartButton));
        makePause(3000);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(shoppingCartTitle));
        waitElementIsVisible(driver.findElement(checkoutButton));
    }

    public void uploadArtworkToOrderDesigner() {
        waitElementIsVisible(driver.findElement(addArtworkButton));
        clickOnElementIfReady(driver.findElement(addArtworkButton));
        waitForJSToBeLoaded();
        clickOnElementIfReady(driver.findElement(formUpload));
        makePause(1500);
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);
        makePause(5000);
        waitForJSToBeLoaded();
        makePause(5000);
        waitElementIsVisible(driver.findElement(artworkOnProduct));
        clickOnElementIfReady(driver.findElement(artworkOnProduct));
        makePause(1500);
    }

    public void addClipartToProduct() {
        waitElementIsVisible(driver.findElement(addClipartToProductButton));
        clickOnElementIfReady(driver.findElement(addClipartToProductButton));
        makePause(1500);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(animalsLink));
        clickOnElementIfReady(driver.findElement(animalsLink));
        makePause(1500);
        waitElementIsVisible(driver.findElement(animalLogo));
        clickOnElementIfReady(driver.findElement(animalLogo));
        makePause(1500);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(artworkOnProduct));
        clickOnElementIfReady(driver.findElement(artworkOnProduct));
        makePause(1500);
    }

    public void addTextToProduct() {
        waitElementIsVisible(driver.findElement(addTextToProductButton));
        clickOnElementIfReady(driver.findElement(addTextToProductButton));
        makePause(1500);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(modifyingTextArea)).clear();
        clickOnElementIfReady(driver.findElement(modifyingTextArea)).sendKeys("T E S T E R QA");
        makePause(1500);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(curveTextButton));
        clickOnElementIfReady(driver.findElement(curveTextButton));
        makePause(1500);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(artworkOnProduct));
        clickOnElementIfReady(driver.findElement(artworkOnProduct));
        makePause(1500);
    }

    public void goToCheckoutPage() {
        waitElementIsVisible(driver.findElement(checkoutButton));
        clickOnElementIfReady(driver.findElement(checkoutButton));
        waitForJSToBeLoaded();
        makePause(5000);
    }

    public void checkoutProcedureImplement() {
        waitElementIsVisible(driver.findElement(warningPopUpWindow));
        waitElementIsVisible(driver.findElement(warningPopUpWindowOkButton));
        jsClick(driver.findElement(warningPopUpWindowOkButton));
        //clickOnElementIfReady(driver.findElement(warningPopUpWindowOkButton));
        waitForJSToBeLoaded();
        makePause(1000);
        waitElementIsVisible(driver.findElement(buyingReasonDropDownMenu));
        clickOnElementIfReady(driver.findElement(buyingReasonChoice));
        waitElementIsVisible(driver.findElement(discountCodeInputField)).sendKeys("TESTORDER2017");
        waitElementIsVisible(driver.findElement(applyDiscountButton));
        clickOnElementIfReady(driver.findElement(applyDiscountButton));
        waitElementIsVisible(driver.findElement(creditCardButton));
        clickOnElementIfReady(driver.findElement(creditCardButton));
        makePause(1500);
        waitForJSToBeLoaded();
    }

    public void creditCardProcess() {
        waitElementIsVisible(driver.findElement(creditCardPopUpWindow));

        waitElementIsVisible(driver.findElement(creditCardHolderNameInputField));
        clickOnElementIfReady(driver.findElement(creditCardHolderNameInputField)).sendKeys(Constant.CheckoutData.CARD_HOLDER);

        switchToFrame(driver.findElement(frameCreditCardNumberInputField));
        waitElementIsVisible(driver.findElement(creditCardNumberInputField));
        clickOnElementIfReady(driver.findElement(creditCardNumberInputField)).sendKeys(Constant.CheckoutData.CARD_NUMBER);
        driver.switchTo().defaultContent();

        switchToFrame(driver.findElement(frameCreditCardExpirationMonthInputField));
        waitElementIsVisible(driver.findElement(creditCardExpirationMonthInputField));
        clickOnElementIfReady(driver.findElement(creditCardExpirationMonthInputField)).sendKeys(Constant.CheckoutData.EXPIRATION_MONTH);
        driver.switchTo().defaultContent();

        switchToFrame(driver.findElement(frameCreditCartExpirationYearInputField));
        waitElementIsVisible(driver.findElement(creditCardExpirationYearInputField));
        clickOnElementIfReady(driver.findElement(creditCardExpirationYearInputField)).sendKeys(Constant.CheckoutData.EXPIRATION_YEAR);
        driver.switchTo().defaultContent();

        switchToFrame(driver.findElement(frameCreditCardCVVCodeInputField));
        waitElementIsVisible(driver.findElement(creditCardCVVCodeInputField));
        clickOnElementIfReady(driver.findElement(creditCardCVVCodeInputField)).sendKeys(Constant.CheckoutData.CVV_CODE);
        driver.switchTo().defaultContent();

        switchToFrame(driver.findElement(frameZipCodeInputField));
        waitElementIsVisible(driver.findElement(zipCodeInputField));
        clickOnElementIfReady(driver.findElement(zipCodeInputField)).sendKeys(Constant.CheckoutData.ZIP_CODE);
        driver.switchTo().defaultContent();

        waitElementIsVisible(driver.findElement(creditCardApplySubmitButton));
        clickOnElementIfReady(driver.findElement(creditCardApplySubmitButton));

        makePause(Constant.TimeoutVariable.VERY_LONG_SLEEP);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(goToMyAccountButtonOrderConfirmation));
    }

    public void openRequestPage() {
        waitElementIsVisible(driver.findElement(requestQuoteButton));
        clickOnElementIfReady(driver.findElement(requestQuoteButton));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void openSamplePage() {
        waitElementIsVisible(driver.findElement(requestSampleButton));
        clickOnElementIfReady(driver.findElement(requestSampleButton));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void fillValidDataAndAddToSampleCart() {
        waitElementIsVisible(driver.findElement(orderDueDate));
        clickOnElementIfReady(driver.findElement(orderDueDate));
        waitForJSToBeLoaded();
        while (!driver.findElement(datePickerSwitch).getText().contains("September 2023")) {
            waitElementIsVisible(driver.findElement(nextMonthButton));
            clickOnElementIfReady(driver.findElement(nextMonthButton));
        }
        int counter = driver.findElements(daysQuantity).size();
        for (int i = 0; i < counter-1; i++) {
            String text = driver.findElements(daysQuantity).get(i).getText();
            if (text.equalsIgnoreCase("20")) {
                driver.findElements(daysQuantity).get(i).click();
            }
        }
        waitElementIsVisible(driver.findElement(agreeToFreeSamplePolicyCheckBox));
        clickOnElementIfReady(driver.findElement(agreeToFreeSamplePolicyCheckBox));
        waitElementIsVisible(driver.findElement(addToSampleCartButton));
        clickOnElementIfReady(driver.findElement(addToSampleCartButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(samplesCartTitle));
        waitElementIsVisible(driver.findElement(requestSamplesInSamplesCartButton));
        makePause(5000);
    }

}
