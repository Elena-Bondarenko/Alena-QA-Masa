package com.telran.alena.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    ChromeDriver wd;


    @Test
    public void testContactCreation() {
        // to contact page
        toContactPage();
        //init contact creation
        initContactCreation();
        // fill contact form
        fillContactForm();
        //submit contact creation
        submitContactCreat();
        returnToContactPage();


    }

}