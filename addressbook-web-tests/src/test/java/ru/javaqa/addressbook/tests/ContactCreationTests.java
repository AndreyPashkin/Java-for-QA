package ru.javaqa.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.javaqa.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getGroupHelper().groupPreparation();
        app.getContactHelper().createContact(new ContactData("Andrey", "Ivanovich", "Ivanov", "aii", "Developer", "Nice Company", "Russia, SPb, Nevskiy, 1", "1234567", "2345678", "3456789", "aii@mail.ok", "test01"));
        app.getNavigationHelper().gotoHomePage();
    }
}
