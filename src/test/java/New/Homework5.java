package New;

import StepObject.LoginSteps;
import StepObject.RegistrationSteps;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static DataObject.RegistrationData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class Homework5 extends Runner {
    @Test
    public void Registration(){
        SoftAssert softAssert=new SoftAssert();
        RegistrationSteps steps=new RegistrationSteps();
        steps.GoToRegistrationPage();
        steps
                .FillFirstName(FirstNameValue)
                .FillLastName(LastNameValue)
                .FillEmail(EmailValue)
                .FillPhone(PhoneValue)
                .FillPassword(PasswordValue)
                .FillPassword2(Password2Value);
        Assert.assertEquals(steps.FirstName.getValue(),FirstNameValue);
        Assert.assertEquals(steps.LastName.getValue(),LastNameValue);
        Assert.assertEquals(steps.Email.getValue(),EmailValue);
        Assert.assertEquals(steps.Phone.getValue(),PhoneValue);
        Assert.assertEquals(steps.Password.getValue(),PasswordValue);
        Assert.assertEquals(steps.Password2.getValue(),Password2Value);
        softAssert.assertAll();

    }
    @Test
    public void Login(){
        SoftAssert softAssert=new SoftAssert();
        LoginSteps steps=new LoginSteps();
        steps.GoToLoginPage();
        steps
                .FillEmailAdress(EmailAdressValueValue)
                .FillLoginPassword(LoginPasswordValue);
        sleep(3000);

    }


    @Test
    public void iplus(){
        $(".cm-processed-form").shouldBe(Condition.visible,Duration.ofMillis(1000));
        $("#search_input").setValue("iphone");
        Assert.assertEquals($("#search_input").getValue(),"iphone");
        $(".ty-search-magnifier").click();
        sleep(1000);
        $("#det_img_1253desktop").click();
        $("#opener_call_request_1253").click();
        sleep(3000);

    }



     }



