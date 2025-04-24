package com.ait.qa55;

import com.FirstSeleniumProgect.ContactData;
import com.FirstSeleniumProgect.UserData;
import models.User;
import org.testng.annotations.BeforeMethod;
import models.Contact;

public class DeleteContactsTests extends BaseTest{
    @BeforeMethod
    public void precondotion(){
        if(!app.getUser().isLoginPresent()){
            app.getUser().clickOnSignOutButton();
        }
        app.getUser().clickOnLoginLink();
        // enter email to email field
        app.getUser().fillRegistrationLoginForm(new User().setEmail(UserData.EMAIl));
        //app.getUser().fillRegistrationLoginForm(UserData.EMAIl,UserData.PASSWORD));
        app.getUser().clickOnLoginButton();
        app.getContact().clickOnAddLink();
        app.getContact().fillContactForm(new Contact()
                .setName(ContactData.Name)
                .setLastName(ContactData.Last_Name)
                .setEmail(ContactData.EMAIL));

        app.getContact().clickOnSaveButton();
    }
}
