package ru.javaqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.javaqa.addressbook.model.ContactData;

public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomephone());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("work"), contactData.getWorkphone());
        type(By.name("email"), contactData.getEmail());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void createContact(ContactData contact) {
        click(By.linkText("add new"));
        fillContactForm(contact, true);
        submitContactCreation();
    }

    public void contactPreparation() {
        click(By.linkText("home"));
        if (!isThereAContact()) {
            click(By.linkText("add new"));
            createContact(new ContactData("Andrey", "Ivanovich", "Ivanov", "aii", "Developer", "Nice Company", "Russia, SPb, Nevskiy, 1", "1234567", "2345678", "3456789", "aii@mail.ok", "test01"));
        }
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void clickEditContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[@value='Update']"));
    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("entry"));
    }

}
