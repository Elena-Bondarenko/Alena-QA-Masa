package com.telran.alena.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        // to group page
        toGroupPage();
        //init group creation
        initGroupCreation();
        // fill group form
        fillGroupForm();
        //submit group creation
        submitGroupCreation();
        returnToGroupPage();
    }


    }
