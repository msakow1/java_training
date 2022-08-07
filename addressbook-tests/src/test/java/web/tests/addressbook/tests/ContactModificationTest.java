package web.tests.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import web.tests.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTest extends TestBase {
  @Test
  public void testContactModification() throws InterruptedException {
    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Maciej", "Tomasz", "Kowalski", "Kowal", "Doctor", "Google", "Test Street 10/1", "22556677", "608001001", "608002002", "608003003", "kowal@gmail.com", "kowal1@gmail.com", "kowal3@gmail.com", "kowal.com", "1", "January", "1980", "test1", "Test3", "Test3", "Test3"));
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().editContact(before.get(before.size() - 1).getId());
    ContactData contact = new ContactData(before.get(before.size()-1).getId(),"John", "", "Kowalski", "Kowal", "Mr", "Google", "Test Street 10/1", "22556677", "608001001", "608002002", "608003003", "kowal@gmail.com", "kowal1@gmail.com", "kowal3@gmail.com", "kowal.com", "1", "January", "1980", null, "Test3", "Test3","Test3");
    app.getContactHelper().fillNewContactForm(contact);
    app.getContactHelper().updateContact();
    app.getContactHelper().returnHomePage();
    app.getNavigationHelper().gotoHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size());
    before.remove(before.size()-1);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(after,before);
  }

}
