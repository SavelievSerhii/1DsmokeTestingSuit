package constants;


public class Constant {

    /*****************************WINDOWS VERSIONS*****************************/

    public enum OSVersions {
        WIN7, WIN10
    }


    /*****************************PAUSES VALUES*****************************/
    public static class TimeoutVariable {

        public static final int IMPLICIT_WAIT = 4;
        public static final int EXPLICIT_WAIT = 20;
        public static final int VERY_SHORT_SLEEP = 500;
        public static final int SHORT_SLEEP = 1000;
        public static final int NORMAL_SLEEP = 3000;
        public static final int LONG_SLEEP = 5000;
        public static final int VERY_LONG_SLEEP = 7000;
        public static final int VERY_LONG_SLEEP1 = 25000;
        public static final int VERY_LONG_SLEEP2 = 100000;
        public static final int VERY_LONG_SLEEP3 = 1500000;
    }

    /*****************************CREDENTIALS*****************************/
    public static class Credentials {

        //site
//        public static final String LOGIN = "automationtesting@gfl.com";
        public static final String LOGIN = "allakolesnikova180@gmail.com";
//        public static final String PASSWORD = "Temp1234%";
        public static final String PASSWORD = "Account123456&";

        //facebook
        public static final String FACEBOOK_LOGIN = "kurtbissonnette@gmail.com";
        public static final String FACEBOOK_PASSWORD = "Kbnthfnehf2023";

        //google
        public static final String  GOOGLE_LOGIN = "kurtbissonnette@gmail.com";

        public static final String GOOGLE_PASSWORD = "Kbnthfnehf2022";

        //Non valid credentials for site
        public static final String NON_VALID_LOGIN = "nonvalidlogin@gmail.com";

        public static final String NON_VALID_PASSWORD = "Nonvalidpassword";
    }

    /*****************************URLS*****************************/
    public static class UrlsToInteract {
        public static final String SIGN_IN_URL = "https://preprod.deluxe.com/products/secure/myaccount/signin/";
    }

    /*****************************TEXT ON ELEMENTS*****************************/
    public static class TextsOnElements {
        public static final String SIGN_IN_BANNER = "Sign In";

        public static final String FORGOT_PASSWORD_LINK = "Forgot password?";
    }

    /****************************SIKULI PATTERNS FOR WINDOWS 10 OS************************/

    public static class SikuliPatternsForWin10 {

        public static final String WINDOWS_10_NAME = "Windows 10";

        public static final String UPLOAD_INPUT_FIELD = "upload_input_field.png";

        public static final String UPLOAD_OPEN_BUTTON = "upload_open_button.png";

        public static final String UPLOAD_CANCEL_BUTTON = "upload_cancel_button.png";

        public static final String WINDOW_CLOSE = "window_close.png";

    }

    /****************************SIKULI PATTERNS FOR WINDOWS 7 OS************************/

    public static class SikuliPatternsForWin7 {
        public static final String WINDOWS_7_NAME = "Windows 7";
    }


    /***** FOLDERS CONTAINING FILES FOR UPLOAD TESTS *****/

    public static class PathsForFilesOfProject {
        public static final String PROJECT_UPLOAD_TEST_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\uploadTestFiles\\";
        public static final String PROJECT_DOWNLOAD_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\download\\";
        public static final String PROJECT_SCREENSHOT_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\screenshots\\";
        public static final String PROJECT_SIKULI_PATTERNS_WIN7 = System.getProperty("user.dir") + "\\src\\main\\resources\\sikuli_patterns_win7\\";
        public static final String PROJECT_SIKULI_PATTERNS_WIN10 = System.getProperty("user.dir") + "\\src\\main\\resources\\sikuli_patterns_win10\\";
    }

    public static final String IMAGE_PATH = "GFL.jpeg";

    /*********************CHECKOUT DATA************************************/

    public static class CheckoutData {
        public static final String DISCOUNT_CODE = "TESTORDER2017";
        public static final String CARD_HOLDER = "Automation T E S T QA Tester";
        public static final String CARD_NUMBER = "4111111111111111";
        public static final String EXPIRATION_MONTH = "12";
        public static final String EXPIRATION_YEAR = "23";
        public static final String CVV_CODE = "111";
        public static final String ZIP_CODE = "77701";
    }

    public static class NewShippingAddressData {
        public static final String ADDRESS_LABEL = "TEST QA2";

        public static final String FIRST_NAME = "T E S T E R";

        public static final String LAST_NAME = "QA";

        public static final String COMPANY_NAME = "GFL";

        public static final String ADDRESS_1 = "1465 Hillcrest Drive";

        public static final String CITY_NAME = "Tacoma";

        public static final String STATE_PROVINCE_NAME = "Washington";

        public static final String ZIP_CODE = "98408";
    }

}
