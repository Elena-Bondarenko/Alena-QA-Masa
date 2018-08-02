package com.telran.alena.test;

import org.testng.annotations.Test;

public class ContactDelitionTests extends TestBase {

    @Test
    public void createContact(){

            toContactPage();
            initContactCreation();
            fillContactForm();
            submitContactCreat();
            returnToContactPage();

    }
}
