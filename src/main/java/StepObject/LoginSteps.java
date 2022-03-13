package StepObject;

import PageObject.LoginPage;

public class LoginSteps extends LoginPage {
    public LoginSteps GoToLoginPage() {
        Profile.click();
        Log.click();
        LoginPassword.click();
        return this;

    }

        public LoginSteps FillEmailAdress(String EmailAdressValue){
        EmailAdrees.setValue(EmailAdressValue);
        return this;
    }
        public LoginSteps FillLoginPassword(String LoginPasswordValue){
        LoginPassword.setValue(LoginPasswordValue);
        Enter.click();
        return this;
    }

    }

