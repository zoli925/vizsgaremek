package General;

import org.openqa.selenium.By;

import java.awt.*;

public class Constant<a> {
    //HomePage
    public static final String MAIN_URL = "https://en.wikipedia.org/wiki/Main_Page";
    public static final By HOME_LOGIN_LINK = By.id("pt-login");
    //public static final String HOME_LOGIN_URL = "https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page";

    //Login
    public static final By LOGIN_NAME = By.id("wpName1");
    public static final By LOGIN_PASSWORD = By.id("wpPassword1");
    public static final By LOGIN_BUTTON = By.id("wpLoginAttempt");
    public static final String LOGIN_NAME_VALUE = "VaskoZoli";
    public static final String LOGIN_PASSWORD_VALUE = "VaskoZoli1234";
    //public static final By LOGIN_NAME_COMPARE = By.xpath("//*[@id=\"pt-userpage\"]/a");
    //registration
    public static final String REGISTRATION_NAME = "VZolika";
    public static final String REGISTRATION_PASSWORD = "Vzolik1234";
    public static final String REGISTRATION_PASSWORD2 = "Vzolika1234";
    public static final String REGISTRATION_EMAIL = "vaskozolika@gmail.com";
    public static final By REGISTRATION_CREAT_BUTTON = By.xpath("//*[@id=\"wpCreateaccount\"]");
    public static final String REGISTRAION_USERNAME_VALUE = "Vzolika1";
    public static final String REGISTRATION_EMAIL_VALUE = "vaskozolika1@freemail.hu";
    public static final String REGISTRATION_PASSWORD_VALUE = "Vzolika12345";
    public static final String REGISTRATION_LINK = "https://en.wikipedia.org/w/index.php?title=Main_Page&gettingStartedReturn=true";

    //privacy policy
    public static final By POLICY_LINK = By.id("footer-places-privacy");

    // logout
    public static final By LOGOUT_LINK = By.xpath("//*[@id=\"pt-logout\"]/a");
    //new data
    public static final By USER_NAME = By.xpath("//*[@id=\"pt-userpage\"]/a");
    public static final By TALK_BUTTON = By.xpath("//*[@id=\"ca-talk\"]/a");
    public static final By INPUT_FIELD = By.xpath("//*[@id=\"wpTextbox1\"]");
    public static final String NEW_DATA = "Vizsgaremek";
    public static final By SHOW_PREVIEW_BUTTON = By.xpath("//*[@id=\"wpPreview\"]");
    //delete data
    public static final String DELETE_LINK = "https://en.wikipedia.org/wiki/Hungary";
    public static final By ADD_WATCHLIST = By.xpath("//*[@id=\"ca-watch\"]/a");
    public static final By WATCHLIST = By.xpath("//*[@id=\"pt-watchlist\"]/a");
    public static final By EDIT_BUTTON = By.xpath("//*[@id=\"mw-content-text\"]/div[2]/div/div/div[1]/div/div[1]/div/div[2]/span/a/span[2]");
    public static final By RADIO_BUTTON = By.xpath("//*[@id=\"ooui-php-1\"]");
    public static final By REMOVE_BUTTON = By.xpath("//*[@id=\"ooui-php-6\"]/button/span[2]");
    public static final String SEARCH_VALUE = "Hungary";
    public static final By SEARCH_INPUT = By.id("//*[@id=\"searchInput\"]");

}
