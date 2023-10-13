package pages.base.configuratorPage;

import constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.base.designerPage.DesignerPage;

import java.util.List;

public class ConfiguratorPage extends BasePage {
    public ConfiguratorPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public ConfiguratorPage(WebDriver driver) {
        super(driver);
    }

    /**********************************NAVIGATION ELEMENTS**************************************/

    public final By printMarketingNavBar = By.xpath("//div[@id='wrapper']/header/div[1]/div[3]/nav[2]/div[1]/ul[1]/li[3]/div[1]/a[contains(.,' Print Marketing ')]");

    public final By customStickersLink = By.xpath("//ul[@id='menu']//li[1]");

    public final By businessCardsLink = By.xpath("//ul[@id='menu']//li[2]");

    public final By envelopesLInk = By.xpath("//ul[@id='menu']//li[3]");

    public final By postcardsLink = By.xpath("//ul[@id='menu']//li[5]");

    //list //div[@class='row']//div[@class='search-product-title-container']//a

    /**********************************preCONFIGURATOR PAGE ELEMENTS**************************************/

    public final By quickStartPopUpWindowClose = By.id("quickModelClose");

    public final By getQuickStartPopUpWindowCloseLocator = By.cssSelector(".quickstart_btnCustom");

    public final By skipThisSideButtonLocator = By.cssSelector(".next_panel_carousel");

    public final By skipThisSideButton = By.xpath("//button[contains(.,'SKIP THIS SIDE')]");

    /**********************************CONFIGURATOR PAGE ELEMENTS**************************************/

    public final By addImageButton = By.xpath("//span[contains(.,'ADD IMAGE')]");

    public final By areaToUploadFile = By.xpath("//div[@id='dtFileUploadSelector']//div[contains(.,'BROWSE FOR A FILE')]");

    public final By confirmImageToUploadButton = By.xpath("//div[@class='modal-footer nopadding']//button[@id='dtUploadDone']");

    public final By nextOptionsButton = By.id("ft_next");

    public final By addClipartButton = By.xpath("//div[@id='left_my_clipart']//div[contains(.,'Clip Art')]");

    public final By animalLink = By.xpath("//a[contains(.,' Animals ')]");

    public final By animalLogo = By.xpath("//img[@src='https://widget-preprod.deluxe.com/images//ClipArt/t/1.png']");

    public final By confirmClipartToAddToProduct = By.id("choose_image");

    public final By continueButton =
            By.xpath("//div[@class='row no-margin ']//button[@class='btn btn-light btn-block close_text_editor sec_green_btn']//span[contains(.,'CONTINUE')]");

    public final By continueButton2 = By.xpath("//div[@class='row no-margin holidaycardclass']//div[@class='col-xs-6 col-sm-6 col-md-6 col-lg-6 no_padding']//button[@class='btn btn-light btn-block close_text_editor sec_green_btn']//span[contains(.,'CONTINUE')]");

    public final By zoomInButton = By.id("dt_canvas_zoom_in");
    public final By zoomOutButton = By.id("dt_canvas_zoom_out");

    public final By addTextButton = By.xpath("//button[contains(.,' Add Text ')]");

    public final By curveCircleTextOptionButton = By.id("dt_text_curve");

    public final By vinylPaperRadioButton = By.id("prod_radio_input_23196");

    //public final By vinylOutdoorPaperButton = By.id("prod_radio_input_23192");

    //public final By vinylOutdoorPaperButton = By.xpath("//div[@class='imprint-radio-box']//input[@id='prod_radio_input_23192']");

    public final By nextReviewButton = By.id("ft_next_review");

    //public final By dropdownQuantityMenu = By.xpath("//select[@id='input_id_quantity']//option[contains(.,' 200')]");

    public final By dropdownButton = By.xpath("//div[@class='dropdown-menu open']//ul[@class='dropdown-menu inner']");



    public final By threeDayRushRadioButton = By.id("prod_radio_input_24505");

    public final By reviewCheckBox = By.xpath("//span[@class='checkmark']");

    public final By addProductToCartButton = By.id("ft_addtocart");


    /**********************************MAIN METHODS**************************************/


    public void openPLPForCustomStickers() {
        clickOnElementIfReady(driver.findElement(printMarketingNavBar));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(customStickersLink));
        clickOnElementIfReady(driver.findElement(customStickersLink));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void openPLPForBusinessCards() {
        clickOnElementIfReady(driver.findElement(printMarketingNavBar));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(businessCardsLink));
        clickOnElementIfReady(driver.findElement(businessCardsLink));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void openPLPForEnvelopes() {
        clickOnElementIfReady(driver.findElement(printMarketingNavBar));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(envelopesLInk));
        clickOnElementIfReady(driver.findElement(envelopesLInk));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void openPLPForPostcards() {
        clickOnElementIfReady(driver.findElement(printMarketingNavBar));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(postcardsLink));
        clickOnElementIfReady(driver.findElement(postcardsLink));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void openPDPForConfigurator() {
        List<WebElement> productsOnPLP = driver.findElements(By.xpath("//div[@class='row']//div[@class='search-product-title-container']//a"));
        for (int i = 0; i < productsOnPLP.size(); i++) {
            try
            {
                waitElementIsVisible(productsOnPLP.get(i));
            }
            catch (StaleElementReferenceException e)
            {
                productsOnPLP = driver.findElements(By.xpath("//div[@class='row']//div[@class='search-product-title-container']//a"));
                waitElementIsVisible(productsOnPLP.get(i));
            }
            clickOnElementIfReady(productsOnPLP.get(i));
            waitForJSToBeLoaded();
            makePause(1500);
            if (!isElementPresent(DesignerPage.designerButtonLocator)) {
                driver.navigate().back();
            } else break;
        }
        waitForJSToBeLoaded();
    }

    public void openPDPForConfigurator2() {
        List<WebElement> productsOnPLP = driver.findElements(By.xpath("//div[@class='row']//div[@class='search-product-title-container']//a"));
        for (int i = 4; i < 20; i++) {
            try
            {
                waitElementIsVisible(productsOnPLP.get(i));
            }
            catch (StaleElementReferenceException e)
            {
                productsOnPLP = driver.findElements(By.xpath("//div[@class='row']//div[@class='search-product-title-container']//a"));
                waitElementIsVisible(productsOnPLP.get(i));
            }
            clickOnElementIfReady(productsOnPLP.get(i));
            waitForJSToBeLoaded();
            makePause(1500);
            if (!isElementPresent(DesignerPage.designerButtonLocator)) {
                driver.navigate().back();
            } else break;
        }
        waitForJSToBeLoaded();
    }

    public void openPDPForConfigurator3() {
        List<WebElement> productsOnPLP = driver.findElements(By.xpath("//div[@class='row']//div[@class='search-product-title-container']//a"));
        for (int i = 21; i < 40; i++) {
            try
            {
                waitElementIsVisible(productsOnPLP.get(i));
            }
            catch (StaleElementReferenceException e)
            {
                productsOnPLP = driver.findElements(By.xpath("//div[@class='row']//div[@class='search-product-title-container']//a"));
                waitElementIsVisible(productsOnPLP.get(i));
            }
            clickOnElementIfReady(productsOnPLP.get(i));
            waitForJSToBeLoaded();
            makePause(1500);
            if (!isElementPresent(DesignerPage.designerButtonLocator)) {
                driver.navigate().back();
            } else break;
        }
        waitForJSToBeLoaded();
    }



    public void fillInValidDataToAddProductToCart() {
            waitElementIsVisible(driver.findElement(nextOptionsButton));
            clickOnElementIfReady(driver.findElement(nextOptionsButton));
            waitForJSToBeLoaded();
            makePause(1500);
            waitElementIsVisible(driver.findElement(nextReviewButton));
            clickOnElementIfReady(driver.findElement(nextReviewButton));
            waitForJSToBeLoaded();
            makePause(1500);
            waitElementIsVisible(driver.findElement(reviewCheckBox));
            clickOnElementIfReady(driver.findElement(reviewCheckBox));
            waitForJSToBeLoaded();
            makePause(1500);
            waitElementIsVisible(driver.findElement(addProductToCartButton));
            clickOnElementIfReady(driver.findElement(addProductToCartButton));
            waitForJSToBeLoaded();
            makePause(5000);
            waitElementIsVisible(driver.findElement(DesignerPage.checkoutButton));
    }

    public void quickStartMenuDealWith() {
        if (isElementPresent(getQuickStartPopUpWindowCloseLocator)) {
            waitElementIsVisible(driver.findElement(quickStartPopUpWindowClose));
            clickOnElementIfReady(driver.findElement(quickStartPopUpWindowClose));
            waitForJSToBeLoaded();
            makePause(1500);
        } else {
            waitElementIsVisible(driver.findElement(skipThisSideButton));
            clickOnElementIfReady(driver.findElement(skipThisSideButton));
            waitForJSToBeLoaded();
        }

    }

    public void uploadFileToProductConfigurator() {
        waitElementIsVisible(driver.findElement(addImageButton));
        clickOnElementIfReady(driver.findElement(addImageButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(areaToUploadFile));
        clickOnElementIfReady(driver.findElement(areaToUploadFile));
        waitForJSToBeLoaded();
        makePause(1500);
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(confirmImageToUploadButton));
        clickOnElementIfReady(driver.findElement(confirmImageToUploadButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(continueButton));
        clickOnElementIfReady(driver.findElement(continueButton));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void uploadFileToProductConfigurator2() {
        waitElementIsVisible(driver.findElement(addImageButton));
        clickOnElementIfReady(driver.findElement(addImageButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(areaToUploadFile));
        clickOnElementIfReady(driver.findElement(areaToUploadFile));
        waitForJSToBeLoaded();
        makePause(1500);
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(confirmImageToUploadButton));
        clickOnElementIfReady(driver.findElement(confirmImageToUploadButton));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void addImageToProductConfigurator() {
        waitElementIsVisible(driver.findElement(addImageButton));
        clickOnElementIfReady(driver.findElement(addImageButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(addClipartButton));
        clickOnElementIfReady(driver.findElement(addClipartButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(animalLink));
        clickOnElementIfReady(driver.findElement(animalLink));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(animalLogo));
        clickOnElementIfReady(driver.findElement(animalLogo));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(confirmClipartToAddToProduct));
        clickOnElementIfReady(driver.findElement(confirmClipartToAddToProduct));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(continueButton));
        clickOnElementIfReady(driver.findElement(continueButton));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void addImageToProductConfigurator2() {
        waitElementIsVisible(driver.findElement(addImageButton));
        clickOnElementIfReady(driver.findElement(addImageButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(addClipartButton));
        clickOnElementIfReady(driver.findElement(addClipartButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(animalLink));
        clickOnElementIfReady(driver.findElement(animalLink));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(animalLogo));
        clickOnElementIfReady(driver.findElement(animalLogo));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(confirmClipartToAddToProduct));
        clickOnElementIfReady(driver.findElement(confirmClipartToAddToProduct));
        waitForJSToBeLoaded();
        makePause(1500);
    }

    public void addTextToProductConfigurator() {
        waitElementIsVisible(driver.findElement(addTextButton));
        clickOnElementIfReady(driver.findElement(addTextButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(curveCircleTextOptionButton));
        clickOnElementIfReady(driver.findElement(curveCircleTextOptionButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(continueButton2));
        clickOnElementIfReady(driver.findElement(continueButton2));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(nextOptionsButton));
        clickOnElementIfReady(driver.findElement(nextOptionsButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(vinylPaperRadioButton));
        clickOnElementIfReady(driver.findElement(vinylPaperRadioButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(nextReviewButton));
        clickOnElementIfReady(driver.findElement(nextReviewButton));
        waitForJSToBeLoaded();
        makePause(1500);
//        waitElementIsVisible(driver.findElement(dropdownButton));
//        clickOnElementIfReady(driver.findElement(dropdownButton));
//        Select select = new Select(driver.findElement(dropdownButton));
//        select.selectByVisibleText(" 200");
//        waitForJSToBeLoaded();
//        makePause(1500);
        waitElementIsVisible(driver.findElement(threeDayRushRadioButton));
        clickOnElementIfReady(driver.findElement(threeDayRushRadioButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(reviewCheckBox));
        clickOnElementIfReady(driver.findElement(reviewCheckBox));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(addProductToCartButton));
        clickOnElementIfReady(driver.findElement(addProductToCartButton));
        waitForJSToBeLoaded();
        makePause(7000);
    }

    public void addTextToProductConfigurator2() {
        waitElementIsVisible(driver.findElement(addTextButton));
        clickOnElementIfReady(driver.findElement(addTextButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(curveCircleTextOptionButton));
        clickOnElementIfReady(driver.findElement(curveCircleTextOptionButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(continueButton2));
        clickOnElementIfReady(driver.findElement(continueButton2));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(nextOptionsButton));
        clickOnElementIfReady(driver.findElement(nextOptionsButton));
        waitForJSToBeLoaded();
        makePause(1500);
//        waitElementIsVisible(driver.findElement(vinylOutdoorPaperButton));
//        clickOnElementIfReady(driver.findElement(vinylOutdoorPaperButton));
//        waitForJSToBeLoaded();
//        makePause(1500);
        waitElementIsVisible(driver.findElement(nextReviewButton));
        clickOnElementIfReady(driver.findElement(nextReviewButton));
        waitForJSToBeLoaded();
        makePause(1500);
//        waitElementIsVisible(driver.findElement(dropdownButton));
//        clickOnElementIfReady(driver.findElement(dropdownButton));
//        Select select = new Select(driver.findElement(dropdownButton));
//        select.selectByValue(" 200");
//        waitForJSToBeLoaded();
//        makePause(1500);
//        waitElementIsVisible(driver.findElement(threeDayRushRadioButton));
//        clickOnElementIfReady(driver.findElement(threeDayRushRadioButton));
//        waitForJSToBeLoaded();
//        makePause(1500);
        waitElementIsVisible(driver.findElement(reviewCheckBox));
        clickOnElementIfReady(driver.findElement(reviewCheckBox));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(addProductToCartButton));
        clickOnElementIfReady(driver.findElement(addProductToCartButton));
        waitForJSToBeLoaded();
        makePause(7000);
    }

}
