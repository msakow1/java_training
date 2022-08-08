package web.tests.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import web.tests.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTest extends TestBase{

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().homePage();
    if (app.contact().list().size() == 0) {
      app.contact().create(new ContactData("Maciej", "Tomasz", "Kowalski", "Kowal", "Doctor", "Google", "Test Street 10/1", "22556677", "608001001", "608002002", "608003003", "kowal@gmail.com", "kowal1@gmail.com", "kowal3@gmail.com", "kowal.com", "1", "January", "1980", "test1", "Test3", "Test3", "Test3"));
    }
  }
  @Test
  public void testContactDeletion() {
  List<ContactData> before = app.contact().list();
  int index = before.size() - 1;
  app.goTo().homePage();
  app.contact().delete(index);
  app.goTo().homePage();
  List<ContactData> after = app.contact().list();
  before.remove(index);
  Assert.assertEquals(after, before);
  }

}
