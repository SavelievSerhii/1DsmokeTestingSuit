package pages.base.customizerPage;

import constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.base.designerPage.DesignerPage;

import java.util.List;

public class CustomizerPage extends BasePage {
    public CustomizerPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public CustomizerPage(WebDriver driver) {
        super(driver);
    }

    /**********************************CUSTOMIZER PAGE ELEMENTS**************************************/

    public final By customizerButtonLocator = By.cssSelector(".js-add-to-customizer");

    @FindBy(css = ".js-add-to-customizer")
    public WebElement customizerButton;

    public final By itemColor = By.xpath("//*[text()='Item Color']/parent::div//div[@class='rectangle-content']");

    public final By imprintLocation = By.xpath("//div[@class='square-content']//span[@class='cursor square required']");

    public final By imprintColor = By.xpath("//*[text()='Imprint Color']/parent::div//div[@class='rectangle-content']");

    public final By addArtworkButton = By.xpath("//button[contains(.,'Add Artwork')]");

    public final By uploadFileButton = By.id("btn-upload-art");

    //public final By confirmUploadFileButton = By.xpath("//div[@id='dialog_attach_artwork_guest']//button[contains(.,'Done')]");
    public final By confirmUploadFileButton = By.xpath("//button[contains(.,'Done')]");

    public final By addClipartButton = By.xpath("//button[contains(.,' Add Clipart ')]");

    public final By animalsLink = By.xpath("//div[@class='row hidden-xs']//a[contains(.,' Animals ')]");

    public final By animalLogo = By.xpath("//img[@src='https://preprod.ihfiles.com/ClipArt/t/1.png']");

    public final By addTextButton = By.xpath("//a[contains(.,'Add Text')]");

    public final By editTextArea = By.xpath("//div[@class='note-editable']");

    public final By addToCartButton = By.xpath("//button[@class='btn btn-primary btn-lg w100']");

    public final By addToQuotesButton = By.xpath("//button[contains(.,' Add to Quotes')]");

    public final By viewQuoteCart = By.xpath("//a[contains(.,'View Quote Cart')]");

    public final By quoteCartTitle = By.xpath("//h1[contains(.,'Quote Cart')]");

    public final By requestQuoteButton = By.xpath("//a[@class='btn btn-primary btn-lg btn-block button_checkout']");

    public  final By submitQuoteRequestButton = By.xpath("//button[contains(.,'Submit Quote Request')]");

    public final By goToYourAccountButton = By.xpath("//a[contains(.,'Go to Your Account')]");




    public void openPDPForCustomizer() {

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
            if (!isElementPresent(customizerButtonLocator)) {
                driver.navigate().back();
            } else break;
        }
        waitForJSToBeLoaded();
    }

    public void openCustomizerPage() {
        waitElementIsVisible(driver.findElement(customizerButtonLocator));
        clickOnElementIfReady(driver.findElement(customizerButtonLocator));
        waitForJSToBeLoaded();
        makePause(1500);
        waitForJSToBeLoaded();
    }

    public void fillValidDataAndAddToQuoteCart() {
        String quantity = driver.findElement(DesignerPage.quantityOfItem).getAttribute("value").trim();
        waitElementIsVisible(driver.findElement(DesignerPage.fieldForQuantity)).clear();
        clickOnElementIfReady(driver.findElement(DesignerPage.fieldForQuantity)).sendKeys(quantity);
        makePause(1500);
        waitElementIsVisible(driver.findElement(itemColor));
        clickOnElementIfReady(driver.findElement(itemColor));
        makePause(1500);
        waitElementIsVisible(driver.findElement(imprintLocation));
        clickOnElementIfReady(driver.findElement(imprintLocation));
        makePause(1500);
        waitElementIsVisible(driver.findElement(imprintColor));
        clickOnElementIfReady(driver.findElement(imprintColor));
        makePause(1500);
        waitElementIsVisible(driver.findElement(addToQuotesButton));
        clickOnElementIfReady(driver.findElement(addToQuotesButton));
        makePause(1500);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(viewQuoteCart));
        clickOnElementIfReady(driver.findElement(viewQuoteCart));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(quoteCartTitle));
        waitElementIsVisible(driver.findElement(requestQuoteButton));
        waitForJSToBeLoaded();
        makePause(3000);
    }

    public void fillInValidDataToProceedToCheckoutSectionCustomizerQuote() {
        String quantity = driver.findElement(DesignerPage.quantityOfItem).getAttribute("value").trim();
        waitElementIsVisible(driver.findElement(DesignerPage.fieldForQuantity)).clear();
        clickOnElementIfReady(driver.findElement(DesignerPage.fieldForQuantity)).sendKeys(quantity);
        makePause(1500);
        waitElementIsVisible(driver.findElement(itemColor));
        clickOnElementIfReady(driver.findElement(itemColor));
        makePause(1500);
        waitElementIsVisible(driver.findElement(imprintLocation));
        clickOnElementIfReady(driver.findElement(imprintLocation));
        makePause(1500);
        waitElementIsVisible(driver.findElement(imprintColor));
        clickOnElementIfReady(driver.findElement(imprintColor));
        makePause(1500);
        waitElementIsVisible(driver.findElement(addToQuotesButton));
        clickOnElementIfReady(driver.findElement(addToQuotesButton));
        makePause(1500);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(viewQuoteCart));
        clickOnElementIfReady(driver.findElement(viewQuoteCart));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(quoteCartTitle));
        waitElementIsVisible(driver.findElement(requestQuoteButton));
        clickOnElementIfReady(driver.findElement(requestQuoteButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(submitQuoteRequestButton));
        clickOnElementIfReady(driver.findElement(submitQuoteRequestButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(goToYourAccountButton));
        makePause(8000);
    }

    public void fillInValidDataToProductToAddToCartCustomizer() {
        String quantity = driver.findElement(DesignerPage.quantityOfItem).getAttribute("value").trim();
        waitElementIsVisible(driver.findElement(DesignerPage.fieldForQuantity)).clear();
        clickOnElementIfReady(driver.findElement(DesignerPage.fieldForQuantity)).sendKeys(quantity);
        makePause(1500);
        waitElementIsVisible(driver.findElement(itemColor));
        clickOnElementIfReady(driver.findElement(itemColor));
        makePause(1500);
        waitElementIsVisible(driver.findElement(imprintLocation));
        clickOnElementIfReady(driver.findElement(imprintLocation));
        makePause(1500);
        waitElementIsVisible(driver.findElement(imprintColor));
        clickOnElementIfReady(driver.findElement(imprintColor));
        makePause(1500);
    }

    public void fillInValidDataToBagAddToCartCustomizer() {
        waitElementIsVisible(driver.findElement(itemColor));
        clickOnElementIfReady(driver.findElement(itemColor));
        makePause(1500);
        waitElementIsVisible(driver.findElement(imprintColor));
        clickOnElementIfReady(driver.findElement(imprintColor));
        makePause(1500);
    }
    public void addProductToCartViaCustomizer() {
        waitElementIsVisible(driver.findElement(addToCartButton));
        clickOnElementIfReady(driver.findElement(addToCartButton));
        makePause(1500);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(DesignerPage.shoppingCartTitle));
        waitElementIsVisible(driver.findElement(DesignerPage.checkoutButton));
    }

    public void uploadArtworkToProductCustomizer() {
        waitElementIsVisible(driver.findElement(addArtworkButton));
        jsClick(driver.findElement(addArtworkButton));
        makePause(1500);
        waitForJSToBeLoaded();
        clickOnElementIfReady(driver.findElement(DesignerPage.formUpload));
        makePause(1000);
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);
        makePause(5000);
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(uploadFileButton));
        clickOnElementIfReady(driver.findElement(uploadFileButton));
        makePause(10000);
        waitElementIsVisible(driver.findElement(confirmUploadFileButton));
        jsClick(driver.findElement(confirmUploadFileButton));
        makePause(1000);
        waitForJSToBeLoaded();
    }

    public void addClipartToProductCustomizer() {
        waitElementIsVisible(driver.findElement(addClipartButton));
        jsClick(driver.findElement(addClipartButton));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(animalsLink));
        clickOnElementIfReady(driver.findElement(animalsLink));
        waitForJSToBeLoaded();
        makePause(1500);
        waitElementIsVisible(driver.findElement(animalLogo));
        clickOnElementIfReady(driver.findElement(animalLogo));
        waitForJSToBeLoaded();
        makePause(5000);
    }

    public void addTextToProductCustomizer() {
        waitElementIsVisible(driver.findElement(addTextButton));
        clickOnElementIfReady(driver.findElement(addTextButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(editTextArea));
        clickOnElementIfReady(driver.findElement(editTextArea)).sendKeys("Automation T E S T QA Tester");
        waitForJSToBeLoaded();
        makePause(5000);
    }
}
