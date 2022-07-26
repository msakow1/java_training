package web.tests.addressbook.tests;

import org.testng.annotations.Test;
import web.tests.addressbook.model.ContactData;
import web.tests.addressbook.model.ContactGroupData;

public class ContactDeletionTest extends TestBase{
  @Test
  public void testContactDeletion() {
  app.getNavigationHelper().gotoHomePage();
  if (! app.getContactHelper().isThereAContact()) {
    app.getContactHelper().createContact(new ContactGroupData(new ContactData("Maciej", "Tomasz", "Kowalski", "Kowal", "Doctor", "Google", "Test Street 10/1", "22556677", "608001001", "608002002", "608003003", "kowal@gmail.com", "kowal1@gmail.com", "kowal3@gmail.com", "kowal.com", "1", "January", "1980", "test1", "Test3", "Test3", "Test3")));
  }
  app.getNavigationHelper().gotoHomePage();
  app.getContactHelper().selectContact();
  app.getContactHelper().deleteContact();
  app.getContactHelper().acceptPopupAlert();
  app.getNavigationHelper().gotoHomePage();
  }
}
