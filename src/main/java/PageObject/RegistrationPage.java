package PageObject;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    public SelenideElement

       Profile=$(".ac-title"),
       Registration=$(byText("რეგისტრაცია")),
       FirstName=$(byName("user_data[firstname]")),
       LastName=$(byName("user_data[lastname]")),
       Email=$(byName("user_data[email]")),
            Phone=$(byName("user_data[phone]")),
       Password=$(byName("user_data[password1]")),
       Password2=$(byName("user_data[password2]")),
       Finish=$(byName("dispatch[profiles.update]"));


}








