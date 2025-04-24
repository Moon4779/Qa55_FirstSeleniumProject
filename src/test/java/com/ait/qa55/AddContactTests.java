package com.ait.qa55;

import com.FirstSeleniumProgect.ContactData;
import com.FirstSeleniumProgect.UserData;
import models.Contact;
import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddContactTests extends BaseTest{
    @BeforeMethod
    public void precondition(){
        if(!app.getUser().isLoginPresent()){
            app.getUser().clickOnSignOutButton();
        }
        // click on login link
        app.getUser().clickOnLoginLink();
        // enter email to email field
        app.getUser().fillRegistrationLoginForm(new User().setEmail(UserData.EMAIl).setPassword(UserData.PASSWORD));

        app.getUser().clickOnLoginButton();
    }
    @Test
    public void addContactPositiveTests() {
        app.getContact().ClickOnAddLink();
        app.getContact().fillContactForm(new Contact()
                .setName(ContactData.Name)
                .setLastName(ContactData.Last_Name)
                .setEmail(ContactData.EMAIL));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactAdded(ContactData.Name));
    }
    @DataProvider
    public Iterator<Object[]> addNewContact(){
        List<Object[]> list=new ArrayList<>();
        list.add(new Object[]{"Oliver","Ra","GRa23@gmail.com"});
        list.add(new Object[]{"Oliver","Ra","KRa23@gmail.com"});
        list.add(new Object[]{"Oliver","Ra","QRa23@gmail.com"});
        return list.iterator();
    }


    @Test(dataProvider = "addNewContact")
    public void addContactPositiveFromDataProviderTests(String name,String lastName,
                                                        String phone,String email,
                                                        String address,String description){
        app.getContact().ClickOnAddLink();
        app.getContact().fillContactForm(new Contact()
                .setName(name)
                .setLastName(lastName)
                .setEmail(email));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactAdded(name));


    }

    @AfterMethod
    public void postCondition(){
        app.getContact().deliteContact();
    }


}
