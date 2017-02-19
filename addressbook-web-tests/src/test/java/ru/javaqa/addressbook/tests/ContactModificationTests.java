package ru.javaqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.javaqa.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        if (! app.getContactHelper().isThereAContact()){
            app.gotoAddContactPage();
            app.getContactHelper().createContact(new ContactData("Andrey", "Ivanovich", "Ivanov", "aii", "Developer", "Nice Company", "Russia, SPb, Nevskiy, 1", "1234567", "2345678", "3456789", "aii@mail.ok", "test01"));
        }
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().clickEditContact();
        app.getContactHelper().fillContactForm(new ContactData("Alexey", "Dmitrievich", "Smirnov", "ads", "Tester", "Nice Company", "Russia, SPb, Nevskiy, 1", "700123456", "800123456", "900123456", "ads@mail.ok", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();
    }
}
