package pages.base.wishlistPage;

import constants.Constant;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;


public class WishlistPage extends BasePage {
    public WishlistPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    /*************************************WISHLIST PAGE ELEMENTS**********************************/

    //NAVIGATION

    private final By customerDropDownMenu = By.xpath("//ul/li[@class='dropdown account-menu-item']");

    private final By wishlistLink = By.xpath("//ul[@class='dropdown-menu account-dropdown-list']//a[@href='/products/secure/wishlist/']");

    private final By wishlistPageTitle = By.xpath("//h1[contains(.,'Wishlist')]");

    private final By saveToWishlistLink = By.xpath("//span[contains(.,'Save to wishlist')]");

    //MODAL POP UP WINDOW
    private final By closeButton = By.xpath("//div[@class='modal-content']//div[@class='modal-footer']//button[contains(.,'Close')]");
    private final By newWishListField = By.id("wishlist-name");

    private final By wishlistUpdatedInformationPopUpMessage = By.xpath("//strong[contains(.,'Wishlist Updated')]");

    private final By wishlistErrorMessage = By.id("wishlist_error");

    private final By saveButtonOnModalWindow = By.xpath("//div[@class='table-responsive']//button[contains(.,'Save')]");

    private final By modalWindowSaveToWishlistTitle = By.id("wishlistModalLabel");

    private final By createButtonOnModalWindow = By.xpath("//button[contains(.,'Create')]");

    private final By compareProductButton = By.xpath("//button[contains(.,'Compare product')]");

    private final By successModalWindow = By.id("modalTitle");

    private final By okButtonOnModalWindow = By.xpath("//button[contains(.,'Ok')]");

    private final By successTitleOnModalWindow = By.xpath("//h4[contains(.,'Success')]");

    private final By errorModalWindow = By.xpath("//h4[contains(.,'Error')]");

    private final By okButtonOnErrorModalWindow = By.xpath("//button[contains(.,'Ok')]");


    //WISHLIST PAGE
    private final By emailIcon = By.cssSelector(".openEmailModal");

    private final By emailModalWindowTitle = By.id("emailModalLabel");

    private final By emailToField = By.id("emailTo");

    private final By sendEmailButton = By.xpath("//input[@value='Send Email']");

    private final By informationWindow = By.id("bootboxBody");

    private final By makeTheListPublicToShareButton = By.xpath("//button[contains(.,'Make this list public to share')]");

    private final By makeListPublicRadioButton = By.id("public");
    private final By makeListPrivateRadioButton = By.id("private");
    private final By saveChangesButton = By.xpath("//input[@value='Save changes']");

    private final By listUpdatedWarningMessage = By.xpath("//div[@class='alert alert-warning red center']");

    private final By shareButton = By.id("share_btn");

    private final By shareViaSocialNetworksPopUpWindow = By.id("atstbx2");

    private final By closeShareViaSocialNetworkPopWindow = By.xpath("//div[@class='modal-dialog modal-sm']//div[@class='modal-content']//div[@class='modal-header']//button[@class='close']");

    private final By copyLinkButton = By.xpath("//span[@class='fa fa-link']");
    private final By shareLinkPopUpWindowTitle = By.id("linkModalLabe h4 gotham");

    private final By shareLinkPopUpWindowCloseButton = By.xpath("//div[@id='linkModal']//div[1]//div[3]//button[contains(.,'Close')]");

    private final By shareListLinkText = By.xpath("//div[@id='linkModal']//div[1]//div[1]//input[@type='text']");

    private final By customizeAndBuyButton = By.xpath("//div[@class='right nowrap']");

    private final By settingsDropDownMenu = By.xpath("//div[@class='dropdown']");

    private final By editListName = By.xpath("//a[contains(.,'Edit List Name')]");

    private final By makeDefault = By.xpath("//a[contains(.,'Make Default')]");

    private final By makeDefaultDropDownMenu = By.name("default");

    private final By makeDefaultListYesOption = By.xpath("//select[@id='default']//option[@value='1']");

    private final By deleteWishlistOption = By.xpath("//a[contains(.,'Delete')]");

    private final By wishlistNameField = By.id("cartname");


    private final By removeProductFromWishlistButton = By.xpath("//button[contains(.,'Remove')]");

    private final By confirmDeletePopUpWindowTitle = By.xpath("//h4[contains(.,'Confirm Delete')]");

    private final By noButtonConfirmDeletePopUpWindow = By.xpath("//div[@class='modal-dialog']//div[1]//div[3]//button[@class='btn 11 btn-default']");

    private final By yesButtonConfirmDeletePopUpWindow = By.xpath("//div[@class='modal-dialog']//div[1]//div[3]//button[@class='btn 11 btn-primary']");

    private final By deleteWIshlistButton = By.xpath("//button[@class='btn btn-danger btn-danger-ada btn-delete']");


    private final By sameNameWishlistErrorMessage = By.id("wishlist_error");

    private final By saveToExistingWishlistButton = By.xpath("//div[@class='table-responsive']//table[1]//tbody[1]//tr[1]//td[1]//button[@class='btn btn-primary btn-block']");

    private final By firstWishlistInARow = By.xpath("//div[@class='col-md-3 hidden-xs hidden-sm']//ul[1]//li[1]//a[1]");

    private final By secondWishlistInARow = By.xpath("//div[@class='col-md-3 hidden-xs hidden-sm']//ul[1]//li[2]//a[1]");

    private final By moveToListButton = By.xpath("//div[@class='col-md-9']//div[4]//div[2]//button[1]");

    private final By moveToListButtonSecond = By.xpath("//div[@class='row']//div[7]//div[2]//button[1]");



    private final By closeButtonMoveToListModalWindow = By.xpath("//div[@id='moveModal']//div[1]//div[1]//div[3]//button[1]");

    private final By moveButtonMoveToListModalWindow = By.xpath("//div[@id='moveModal']//div[1]//div[1]//div[2]//table[1]//tbody[1]//tr[1]//td[1]//button[1]");

    private final By copyButtonMoveToListModalWindow = By.xpath("//div[@id='moveModal']//div[1]//div[1]//div[2]//table[1]//tbody[1]//tr[1]//td[1]//button[2]");

    private final By moveCopyToListWarningMessage = By.xpath("//strong[contains(.,'Product already exists in destination wish list.')]");


    /*************************************WISHLIST PAGE MAIN LOGIC**********************************/
    public void getToWishlistPage() {
        hoverOverElement(driver.findElement(customerDropDownMenu));
        waitElementIsVisible(driver.findElement(wishlistLink));
        clickOnElementIfReady(driver.findElement(wishlistLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(wishlistPageTitle));
    }

    public void addProductToWishlist() {
        waitElementIsVisible(driver.findElement(saveToWishlistLink));
        clickOnElementIfReady(driver.findElement(saveToWishlistLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(closeButton));
        clickOnElementIfReady(driver.findElement(closeButton));
        waitElementIsVisible(driver.findElement(saveToWishlistLink));
        clickOnElementIfReady(driver.findElement(saveToWishlistLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(newWishListField)).clear();
        clickOnElementIfReady(driver.findElement(newWishListField)).sendKeys("T E S T E R QA Wishlist");
        waitElementIsVisible(driver.findElement(createButtonOnModalWindow));
        clickOnElementIfReady(driver.findElement(createButtonOnModalWindow));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(wishlistUpdatedInformationPopUpMessage));
        clickOnElementIfReady(driver.findElement(wishlistUpdatedInformationPopUpMessage));
    }

    public void addTheSameProductToWishlist() {
        waitElementIsVisible(driver.findElement(saveToWishlistLink));
        clickOnElementIfReady(driver.findElement(saveToWishlistLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(modalWindowSaveToWishlistTitle));
        waitElementIsVisible(driver.findElement(saveButtonOnModalWindow));
        clickOnElementIfReady(driver.findElement(saveButtonOnModalWindow));
        waitElementIsVisible(driver.findElement(wishlistErrorMessage));
    }

    public void addProductToComparisonsViaWishlist() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(compareProductButton));
        clickOnElementIfReady(driver.findElement(compareProductButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(successModalWindow));
        waitElementIsVisible(driver.findElement(successTitleOnModalWindow));
        waitElementIsVisible(driver.findElement(okButtonOnModalWindow));
        clickOnElementIfReady(driver.findElement(okButtonOnModalWindow));
    }

    public void addTheSameProductToComparisonsViaWishlist() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(compareProductButton));
        clickOnElementIfReady(driver.findElement(compareProductButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(errorModalWindow));
        waitElementIsVisible(driver.findElement(okButtonOnErrorModalWindow));
        clickOnElementIfReady(driver.findElement(okButtonOnErrorModalWindow));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkShareListWithFriendPopUpWindowCalledUp() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(emailIcon));
        clickOnElementIfReady(driver.findElement(emailIcon));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(emailModalWindowTitle));
    }

    public String checkShareListWithFriendPopUpWindowRespond() {
        waitElementIsVisible(driver.findElement(emailToField));
        clickOnElementIfReady(driver.findElement(emailToField)).clear();
        waitElementIsVisible(driver.findElement(sendEmailButton));
        clickOnElementIfReady(driver.findElement(sendEmailButton));
        String cssValue = driver.findElement(emailToField).getCssValue("background-color");
        System.out.println(cssValue);
        return cssValue;
    }

    public void checkCaptchaIsWorkable() {
        waitElementIsVisible(driver.findElement(emailToField)).sendKeys("automationtest@test.com");
        waitElementIsVisible(driver.findElement(sendEmailButton));
        clickOnElementIfReady(driver.findElement(sendEmailButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(informationWindow));
    }

    public void changeListAccess() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(makeTheListPublicToShareButton));
        clickOnElementIfReady(driver.findElement(makeTheListPublicToShareButton));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(makeListPublicRadioButton));
        clickOnElementIfReady(driver.findElement(makeListPublicRadioButton));
        waitElementIsVisible(driver.findElement(saveChangesButton));
        clickOnElementIfReady(driver.findElement(saveChangesButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(listUpdatedWarningMessage));
    }

    public void checkShareButtons() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(shareButton));
        clickOnElementIfReady(driver.findElement(shareButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(shareViaSocialNetworksPopUpWindow));
        waitElementIsVisible(driver.findElement(closeShareViaSocialNetworkPopWindow));
        clickOnElementIfReady(driver.findElement(closeShareViaSocialNetworkPopWindow));
        waitElementIsVisible(driver.findElement(copyLinkButton));
        clickOnElementIfReady(driver.findElement(copyLinkButton));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(shareLinkPopUpWindowTitle));
        waitElementIsVisible(driver.findElement(shareLinkPopUpWindowCloseButton));
        clickOnElementIfReady(driver.findElement(shareLinkPopUpWindowCloseButton));
        waitElementIsVisible(driver.findElement(copyLinkButton));
        clickOnElementIfReady(driver.findElement(copyLinkButton));
        waitElementIsVisible(driver.findElement(shareListLinkText));
        String linkShareWishlist = clickOnElementIfReady(driver.findElement(shareListLinkText)).getText();
        System.out.println(linkShareWishlist);
        waitElementIsVisible(driver.findElement(shareLinkPopUpWindowCloseButton));
        clickOnElementIfReady(driver.findElement(shareLinkPopUpWindowCloseButton));
        String value = waitElementIsVisible(driver.findElement(shareListLinkText)).getAttribute("value");
        System.out.println(value);
        driver.get(value);
        waitElementIsVisible(driver.findElement(customizeAndBuyButton));
        driver.navigate().back();
        waitElementIsVisible(driver.findElement(wishlistPageTitle));
    }

    public void changeWishlistSettings() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(settingsDropDownMenu));
        clickOnElementIfReady(driver.findElement(settingsDropDownMenu));
        waitElementIsVisible(driver.findElement(editListName));
        clickOnElementIfReady(driver.findElement(editListName));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(wishlistNameField));
        clickOnElementIfReady(driver.findElement(wishlistNameField)).clear();
        clickOnElementIfReady(driver.findElement(wishlistNameField)).sendKeys("Edited Wishlist TESTER QA2");
        waitElementIsVisible(driver.findElement(makeListPrivateRadioButton));
        clickOnElementIfReady(driver.findElement(makeListPrivateRadioButton));
        waitElementIsVisible(driver.findElement(saveChangesButton));
        clickOnElementIfReady(driver.findElement(saveChangesButton));
        waitElementIsVisible(driver.findElement(listUpdatedWarningMessage));
    }

    public void deleteProductFromWishlist() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(removeProductFromWishlistButton));
        clickOnElementIfReady(driver.findElement(removeProductFromWishlistButton));
    }

    public void deleteWishlist() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(settingsDropDownMenu));
        clickOnElementIfReady(driver.findElement(settingsDropDownMenu));
        waitElementIsVisible(driver.findElement(deleteWishlistOption));
        clickOnElementIfReady(driver.findElement(deleteWishlistOption));
        waitElementIsVisible(driver.findElement(confirmDeletePopUpWindowTitle));
        waitElementIsVisible(driver.findElement(noButtonConfirmDeletePopUpWindow));
        clickOnElementIfReady(driver.findElement(noButtonConfirmDeletePopUpWindow));

        waitElementIsVisible(driver.findElement(settingsDropDownMenu));
        clickOnElementIfReady(driver.findElement(settingsDropDownMenu));
        waitElementIsVisible(driver.findElement(deleteWishlistOption));
        clickOnElementIfReady(driver.findElement(deleteWishlistOption));
        waitElementIsVisible(driver.findElement(confirmDeletePopUpWindowTitle));
        waitElementIsVisible(driver.findElement(yesButtonConfirmDeletePopUpWindow));
        clickOnElementIfReady(driver.findElement(yesButtonConfirmDeletePopUpWindow));
        waitElementIsVisible(driver.findElement(listUpdatedWarningMessage));
    }

    public void deleteEmptyWishlist() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(deleteWIshlistButton));
        clickOnElementIfReady(driver.findElement(deleteWIshlistButton));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(confirmDeletePopUpWindowTitle));
        waitElementIsVisible(driver.findElement(noButtonConfirmDeletePopUpWindow));
        clickOnElementIfReady(driver.findElement(noButtonConfirmDeletePopUpWindow));

        waitElementIsVisible(driver.findElement(deleteWIshlistButton));
        clickOnElementIfReady(driver.findElement(deleteWIshlistButton));
        waitForJSToBeLoaded();

        waitElementIsVisible(driver.findElement(confirmDeletePopUpWindowTitle));
        waitElementIsVisible(driver.findElement(yesButtonConfirmDeletePopUpWindow));
        clickOnElementIfReady(driver.findElement(yesButtonConfirmDeletePopUpWindow));
        waitElementIsVisible(driver.findElement(listUpdatedWarningMessage));
    }
  /************************************TWO WISHLISTS INTERACTIONS METHODS************************************/
    public void nameAnotherWishlistTheSameNameRespond() {
        waitElementIsVisible(driver.findElement(saveToWishlistLink));
        clickOnElementIfReady(driver.findElement(saveToWishlistLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(closeButton));
        clickOnElementIfReady(driver.findElement(closeButton));
        waitElementIsVisible(driver.findElement(saveToWishlistLink));
        clickOnElementIfReady(driver.findElement(saveToWishlistLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(newWishListField)).clear();
        clickOnElementIfReady(driver.findElement(newWishListField)).sendKeys("T E S T E R QA Wishlist");
        waitElementIsVisible(driver.findElement(createButtonOnModalWindow));
        clickOnElementIfReady(driver.findElement(createButtonOnModalWindow));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(sameNameWishlistErrorMessage));
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        clickOnElementIfReady(driver.findElement(closeButton));
    }

    public void createSecondWishlist() {
        waitElementIsVisible(driver.findElement(saveToWishlistLink));
        clickOnElementIfReady(driver.findElement(saveToWishlistLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(newWishListField)).clear();
        clickOnElementIfReady(driver.findElement(newWishListField)).sendKeys("T E S T E R QA Wishlist 2");
        waitElementIsVisible(driver.findElement(createButtonOnModalWindow));
        clickOnElementIfReady(driver.findElement(createButtonOnModalWindow));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(wishlistUpdatedInformationPopUpMessage));
    }

    public void addSeveralProductsToWishlist() {
        waitElementIsVisible(driver.findElement(saveToWishlistLink));
        clickOnElementIfReady(driver.findElement(saveToWishlistLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(closeButton));
        clickOnElementIfReady(driver.findElement(closeButton));
        waitElementIsVisible(driver.findElement(saveToWishlistLink));
        clickOnElementIfReady(driver.findElement(saveToWishlistLink));
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(driver.findElement(saveToExistingWishlistButton));
        clickOnElementIfReady(driver.findElement(saveToExistingWishlistButton));
        waitForJSToBeLoaded();
    }

    public void makeWishlistDefault() {
        waitElementIsVisible(driver.findElement(secondWishlistInARow));
        clickOnElementIfReady(driver.findElement(secondWishlistInARow));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(settingsDropDownMenu));
        clickOnElementIfReady(driver.findElement(settingsDropDownMenu));
        waitElementIsVisible(driver.findElement(makeDefault));
        clickOnElementIfReady(driver.findElement(makeDefault));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(makeDefaultDropDownMenu));
        clickOnElementIfReady(driver.findElement(makeDefaultDropDownMenu));
        waitElementIsVisible(driver.findElement(makeDefaultListYesOption));
        clickOnElementIfReady(driver.findElement(makeDefaultListYesOption));
        waitElementIsVisible(driver.findElement(saveChangesButton));
        clickOnElementIfReady(driver.findElement(saveChangesButton));
        waitForJSToBeLoaded();
    }

    public void moveCopyProductToAnotherWishlist() {
        waitElementIsVisible(driver.findElement(firstWishlistInARow));
        clickOnElementIfReady(driver.findElement(firstWishlistInARow));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(moveToListButton));
        clickOnElementIfReady(driver.findElement(moveToListButton));
        waitElementIsVisible(driver.findElement(closeButtonMoveToListModalWindow));
        clickOnElementIfReady(driver.findElement(closeButtonMoveToListModalWindow));
        waitElementIsVisible(driver.findElement(moveToListButton));
        clickOnElementIfReady(driver.findElement(moveToListButton));
        waitElementIsVisible(driver.findElement(moveButtonMoveToListModalWindow));
        clickOnElementIfReady(driver.findElement(moveButtonMoveToListModalWindow));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(moveCopyToListWarningMessage));
        makePause(Constant.TimeoutVariable.LONG_SLEEP);
        waitElementIsVisible(driver.findElement(moveToListButton));
        clickOnElementIfReady(driver.findElement(moveToListButton));
        waitElementIsVisible(driver.findElement(copyButtonMoveToListModalWindow));
        clickOnElementIfReady(driver.findElement(copyButtonMoveToListModalWindow));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(moveCopyToListWarningMessage));
        makePause(Constant.TimeoutVariable.LONG_SLEEP);

        waitElementIsVisible(driver.findElement(secondWishlistInARow));
        clickOnElementIfReady(driver.findElement(secondWishlistInARow));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(moveToListButtonSecond));
        clickOnElementIfReady(driver.findElement(moveToListButtonSecond));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(moveButtonMoveToListModalWindow));
        clickOnElementIfReady(driver.findElement(moveButtonMoveToListModalWindow));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(listUpdatedWarningMessage));
        waitElementIsVisible(driver.findElement(moveToListButtonSecond));
        clickOnElementIfReady(driver.findElement(moveToListButtonSecond));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(copyButtonMoveToListModalWindow));
        clickOnElementIfReady(driver.findElement(copyButtonMoveToListModalWindow));
        waitForJSToBeLoaded();
        waitElementIsVisible(driver.findElement(listUpdatedWarningMessage));
    }

}
