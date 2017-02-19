package ru.javaqa.addressbook.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getGroupHelper().groupPreparation();
        app.getContactHelper().contactPreparation();
        app.getNavigationHelper().gotoHomePage();
    }
}
