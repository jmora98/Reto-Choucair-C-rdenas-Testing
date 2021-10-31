package userinsterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Register {

    public static final Target JOIN = Target.the("today ").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
    public static final Target FIRS = Target.the("name ").locatedBy("//input[@id='firstName']");
    public static final Target LAST = Target.the("name ").locatedBy("//input[@id='lastName']");
    public static final Target EMAIL = Target.the("").locatedBy("//input[@id='email']");
    public static final Target MONTH = Target.the("").locatedBy("//select[@id='birthMonth']");
    public static final Target MONTH2 = Target.the("").locatedBy("//*[@id='birthMonth']/option[2]");
    public static final Target DAY = Target.the("").locatedBy("//*[@id='birthDay']");
    public static final Target DAY2 = Target.the("").locatedBy("//*[@id='birthDay']/option[3]");
    public static final Target YEAR = Target.the("").locatedBy("//*[@id='birthYear']");
    public static final Target YEAR2 = Target.the("").locatedBy("//*[@id='birthYear']/option[7]");
    public static final Target NEXT = Target.the("").locatedBy("//i[@class='material-icons']");
    public static final Target CONFIRMATION = Target.the("").locatedBy("//div[@class='image-box-header']");
    public static final Target NEXT2 = Target.the("").locatedBy("//a[@class='btn btn-blue pull-right']");
    public static final Target BRAND = Target.the("").locatedBy("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span");
    public static final Target NEXT3 = Target.the("").locatedBy("//a[@class='btn btn-blue pull-right']");
    public static final Target PASSWORD = Target.the("").locatedBy("//input[@id='password']");
    public static final Target PASSWORD2 = Target.the("").locatedBy("//input[@id='confirmPassword']");
    public static final Target CHECK = Target.the("").locatedBy("//span[@class='checkmark signup-consent__checkbox error']");
    public static final Target CHECK2 = Target.the("").locatedBy("//input[@id='privacySetting']");
    public static final Target NEXT4 = Target.the("").locatedBy("//a[@class='btn btn-blue']");




}
