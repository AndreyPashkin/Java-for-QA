package ru.javaqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.javaqa.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void contactDeletionTests() {
        if (! app.getContactHelper().isThereAContact()){
            app.gotoAddContactPage();
            app.getContactHelper().createContact(new ContactData("Andrey", "Ivanovich", "Ivanov", "aii", "Developer", "Nice Company", "Russia, SPb, Nevskiy, 1", "1234567", "2345678", "3456789", "aii@mail.ok", "test01"));
        }
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getNavigationHelper().gotoHomePage();
    }

}
