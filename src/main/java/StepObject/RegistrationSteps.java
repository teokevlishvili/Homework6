package StepObject;

import PageObject.RegistrationPage;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationSteps GoToRegistrationPage() {
        Profile.click();
        Registration.click();
        return this;
    }

    public RegistrationSteps FillFirstName(String FirstNameValue) {
        FirstName.setValue(FirstNameValue);
        return this;
    }

    public RegistrationSteps FillLastName(String LastNameValue) {
        LastName.setValue(LastNameValue);
        return this;
    }

    public RegistrationSteps FillEmail(String EmailValue) {
        Email.setValue(EmailValue);
        return this;

    }
    public RegistrationSteps FillPhone(String PhoneValue) {
        Phone.setValue(PhoneValue);
        return this;
    }
    public RegistrationSteps FillPassword(String PasswordValue) {
        Password.setValue(PasswordValue);
        return this;
    }

    public RegistrationSteps FillPassword2(String Password2Value) {
        Password2.setValue(Password2Value);
        Finish.click();
        return this;
    }


    }

