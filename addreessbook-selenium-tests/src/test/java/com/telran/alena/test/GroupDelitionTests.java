package com.telran.alena.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDelitionTests extends TestBase {
    @Test
    public void testGroupDelition(){

        toGroupPage();
        if(!isGroupPresent()){
            createGroup();
        }
        selectGroup();
        clickOnDeleteGroupButton();
        returnToGroupPage();

    }

    public void createGroup() {
        toGroupPage();
        initGroupCreation();
        fillGroupForm();
        submitGroupCreation();
        returnToGroupPage();
    }


}
