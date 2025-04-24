package com.FirstSeleniumProgect;

public class ContactData {
    public static final String Name = "Anna";
    public static final String Last_Name = "Smith";
    public static final String EMAIL = generateUniqueEmail();
    private static String generateUniqueEmail() {
        long timestamp = System.currentTimeMillis();
        return "test" + timestamp + "@test.com";
    }
}
