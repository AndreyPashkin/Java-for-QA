package ru.javaqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.javaqa.addressbook.model.GroupData;


public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getGroupHelper().groupPreparation();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test01", "testLogo 02", "Test Comment 02"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
