package ru.javaqa.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test01", "testLogo 01", "Test Comment 01"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
