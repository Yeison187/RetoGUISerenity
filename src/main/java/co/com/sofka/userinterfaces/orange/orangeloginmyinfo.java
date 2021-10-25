package co.com.sofka.userinterfaces.orange;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class orangeloginmyinfo extends PageObject {


    public static final Target USER_NAME = Target
            .the("Nombre usuario")
            .located(xpath("//input[@id='txtUsername']"));

    public static final Target PASSWORD = Target
            .the("Contraseña")
            .located(xpath("//input[@id='txtPassword']"));

    public static final Target SUBMIT = Target
            .the("Botón Login")
            .located(xpath("//input[@id='btnLogin']"));

    public static final Target MESSAGE_LOGIN = Target
            .the("Message login")
            .located(xpath("//span[@id='spanMessage']"));


    public static final Target OPTION_DASHBOARD = Target
            .the("Text welcome")
            .located(xpath("//b[contains(text(),'Dashboard')]"));

    public static final Target MY_INFO = Target
            .the("My info")
            .located(xpath("//b[contains(text(),'My Info')]"));

    public static final Target DEPENDENTS = Target
            .the("Dependents")
            .located(xpath("//a[contains(text(),'Dependents')]"));

    public static final Target ADD_DEPENDENTS = Target
            .the("Add dependents")
            .located(xpath("//input[@id='btnAddDependent']"));

    public static final Target NAME_DEPENDENTS = Target
            .the("Name dependent")
            .located(xpath("//input[@id='dependent_name']"));

    public static final Target SELECT_RELATIONSHIP = Target
            .the("Select dependent child")
            .located(xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol/li[2]/select"));

    public static final Target BIRTH = Target
            .the("Date of birth")
            .located(xpath("//input[@id='dependent_dateOfBirth']"));

    public static final Target SAVE_DEPENDENTS = Target
            .the("Button save dependents")
            .located(xpath("//input[@id='btnSaveDependent']"));

    public static final Target ADD_ATTACHSMENT = Target
            .the("Add Attachsment")
            .located(xpath("//input[@id='btnAddAttachment']"));

    public static final Target ADD_FILE = Target
            .the("Updload file")
            .located(xpath("//input[@id='ufile']"));

    public static final Target COMMENT = Target
            .the("Comment")
            .located(xpath("//textarea[@id='txtAttDesc']"));

    public static final Target UPLOAD = Target
            .the("Upload file")
            .located(xpath("//input[@id='btnSaveAttachment']"));

    public static final Target BUZZ_MODUL = Target
            .the("Buzz option")
            .located(xpath("//b[contains(text(),'Buzz')]"));

    public static final Target MOST_LIKE_POST = Target
            .the("Item Most like post")
            .located(xpath("//div[@id='rightBarHeadingMl']"));

    public static final Target POST_THREE = Target
            .the("Item Most like post, three post")
            .located(xpath("//body[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[2]/div[6]"));

    public static final Target LIKE_POST = Target
            .the("like post")
            .located(xpath("//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]"));


    public static final Target LIKE = Target
            .the("add like")
            .located(xpath("//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[4]/div[1]/form[1]/textarea[1]"));

    public static final Target BOX_COMMENT = Target
            .the("Box comment")
            .located(xpath("//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[4]/div[1]/form[1]/textarea[1]"));

    public static final Target BUTTON_COMMENT = Target
            .the("Button comment")
            .located(xpath("//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[4]/div[1]/form[1]/div[2]/input[1]"));

    public static final Target SHARE_COMMENT = Target
            .the("Share comment")
            .located(xpath("//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[2]/div[3]/a[1]/img[1]"));


    public static final Target CONFIRM_SHARE_COMMENT = Target
            .the("Share comment")
            .located(xpath("//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));




}
