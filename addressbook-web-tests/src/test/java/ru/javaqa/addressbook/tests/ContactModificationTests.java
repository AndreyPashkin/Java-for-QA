package ru.javaqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.javaqa.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getGroupHelper().groupPreparation();
        app.getContactHelper().contactPreparation();
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().clickEditContact();
        app.getContactHelper().fillContactForm(new ContactData("Alexey", "Dmitrievich", "Smirnov", "ads", "Tester", "Nice Company", "Russia, SPb, Nevskiy, 1", "700123456", "800123456", "900123456", "ads@mail.ok", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();
    }
}
