package co.com.AutomatizacionWeb.reto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationWebPage extends PageObject {

    public static final Target NAME_INPUT =
            Target.the("Name input field")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));

    public static final Target LASTNAME_INPUT =
            Target.the("LastName input field")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));

    public static final Target ADDRRESS_INPUT =
            Target.the("Address input field")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));

    public static final Target EMAIL_INPUT =
            Target.the("Email input field")
                    .located(By.xpath("//*[@id='eid']/input"));

    public static final Target PHONE_INPUT =
            Target.the("Phone input field")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));

    public static final Target GENDER_SELECT =
            Target.the("Select an opcion Gender")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));

    public static final Target HOBBIES_SELECT =
            Target.the("Select an opcion Hobbies")
                    .located(By.id("checkbox2"));

    public static final Target LANGUAGE_LIST =
            Target.the("Select the list Language")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));

    public static final Target LANGUAGE_SELECT =
            Target.the("Select an opcion Language")
                    .located(By.id("msdd"));

    public static final Target SKILLS_LIST =
            Target.the("Select an Skills")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[8]/div"));

    public static final Target COUNTRY_LIST =
            Target.the("Select Country")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[9]/div"));

   public static final Target COUNTRY2_LIST =
            Target.the("Select an Country2")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div"));

    public static final Target YEAR_LIST =
            Target.the("Select an Year")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[1]"));

    public static final Target MONTH_LIST =
            Target.the("Select an Month")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]"));

    public static final Target DAY_LIST =
            Target.the("Select an Day")
                    .located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[3]"));

    public static final Target PASSWORD_INPUT =
            Target.the("Password input field")
                    .located(By.id("firstpassword"));

    public static final Target PASSWORD2_INPUT =
            Target.the("Password2 input field")
                    .located(By.id("secondpassword"));

    public static final Target BUTTON_SUBMIT =
            Target.the("click the submit button")
                    .located(By.id("submitbtn"));

    public static final Target NAME_CHECK =
            Target.the("Check-Double Click on Edit Icon to EDIT the Table Row")
                    .located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));


}

