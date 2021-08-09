package General;

import org.openqa.selenium.By;

import java.awt.*;

public class Constant {
    //HomePage
    public static final String MAIN_URL = "https://en.wikipedia.org/";
    public static final By HOME_LOGIN_LINK = By.id("pt-login");
    public static final String HOME_LOGIN_URL = "https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page";

    //Login
    public static final By LOGIN_NAME = By.id("wpName1");
    public static final By LOGIN_PASSWORD = By.id("wpPassword1");
    public static final By LOGIN_BUTTON = By.id("wpLoginAttempt");
    public static final String LOGIN_NAME_VALUE = "VaskoZoli";
    public static final String LOGIN_PASSWORD_VALUE = "VaskoZoli1234";
    public static final By LOGIN_NAME_COMPARE = By.xpath("//*[@id=\"pt-userpage\"]/a");
    public static final String REGISTRATION_NAME = "VZolika";
    public static final String REGISTRATION_PASSWORD = "Vzolik1234";
    public static final String REGISTRATION_PASSWORD2 = "Vzolika1234";
    public static final String REGISTRATION_EMAIL = "vaskozolika@gmail.com";
    public static final By REGISTRATION_CREAT_BUTTON = By.xpath("//*[@id=\"wpCreateaccount\"]");
    public static final String REGISTRAION_USERNAME_VALUE = "Vzolika";
    public static final String REGISTRATION_EMAIL_VALUE = "vaskozolika@freemail.hu";
    public static final String REGISTRATION_PASSWORD_VALUE = "Vzolika1234";
    public static final String REGISTRATION_LINK = "https://en.wikipedia.org/w/index.php?title=Main_Page&gettingStartedReturn=true";

    //privacy policy
    public static final By POLICY_LINK = By.id("footer-places-privacy");

}
