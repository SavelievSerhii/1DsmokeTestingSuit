package common;

import constants.Constant;

public class Settings {
    /**
     * The platform and browser is being user while performing tests
     */
    public static final String PLATFORM_AND_BROWSER = "win_chrome";

    /**
     * The version of operating system the user is used
     */
    public static final Constant.OSVersions operationSystemVersion = Constant.OSVersions.WIN10;

    /**
     * Clear browser cookies and storage after each interaction
     * if true - clear cookies
     */
    public static final boolean CLEAR_COOKIES_AND_STORAGE = true;
    /**
     * To keep the browser open after suite
     * if true - browser close
     */
    public static final boolean HOLD_BROWSER_OPEN = true;
}
