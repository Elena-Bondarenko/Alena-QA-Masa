package com.telran.alena.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    ChromeDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.navigate().to(" http://localhost/addressbook/");
//        wd.get("");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//*[@type='submit']")).click();


    }

    @AfterClass
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(6000);
    public void tearDown() {
        wd.quit();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void clickOnDeleteGroupButton() {
        wd.findElement(By.name("delete")).click();
    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isGroupPresent() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createGroup() {
        toGroupPage();
        initGroupCreation();
        fillGroupForm();
        submitGroupCreation();
        returnToGroupPage();
    }


    public void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm() {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys("testGroup");
        wd.findElement(By.name("group_name")).sendKeys("testGroup");

        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys("testGroup");

        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys("testGroup");
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void toGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
    
    public void toContactPage() {
        wd.findElement(By.linkText("contact")).click();
    }

    public void submitContactCreat() {
        wd.findElement(By.name("submit")).click();

    }

    public void returnToContactPage() {
        wd.findElement(By.linkText("contact page")).click();
    }

    public void fillContactForm() {
        wd.findElement(By.name("first_name")).click();
        wd.findElement(By.name("first_name")).clear();
        wd.findElement(By.name("first_name")).sendKeys("testContact");

        wd.findElement(By.name("middle_name")).click();
        wd.findElement(By.name("middle_name")).clear();
        wd.findElement(By.name("middle_name")).sendKeys("testContact");

        wd.findElement(By.name("last_name")).click();
        wd.findElement(By.name("last_name")).clear();
        wd.findElement(By.name("last_name")).sendKeys("testContact");
    }

    public void initContactCreation() {
        wd.findElement(By.name("add new")).click();
    }
}
