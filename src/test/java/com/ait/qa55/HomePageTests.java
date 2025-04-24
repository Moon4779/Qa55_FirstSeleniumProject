package com.ait.qa55;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{
   @BeforeMethod
   public void ensurePrecondition(){
       if(!app.getHome().isHomeComponentPresent()){
           app.getHome().clickOnHomeLink();
       }
   }

   @Test
   public void isHomeComponentPresentTest(){
       //driver.findElement(By.cssSelector("div:nth-child(2)>div>div>h1")); // xpath-> //div[2]/div/div/h1
       //System.out.print("Home Component " + isHomeComponentPresent());
       Assert.assertTrue(app.getHome().isHomeComponentPresent());

   }

}
