package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement

       Profile=$(".ac-title"),
       Log=$(byText("ავტორიზაცია")),
       EmailAdrees=$(byAttribute("name","user_login")),
       LoginPassword=$(byAttribute("name","password")),
       Enter=$(byName("dispatch[auth.login]"));
}
