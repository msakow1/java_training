package web.tests.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import web.tests.addressbook.model.ContactData;
import web.tests.addressbook.model.ContactGroupData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    ContactData contact = new ContactData("Maciej", "Tomasz", "Kowalski", "Kowal", "Doctor", "Google", "Test Street 10/1", "22556677", "608001001", "608002002", "608003003", "kowal@gmail.com", "kowal1@gmail.com", "kowal3@gmail.com", "kowal.com", "1", "January", "1980", "test1", "Test3", "Test3", "Test3");
    app.getContactHelper().createContact(contact);
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() + 1);
    int max = 0;
    for ( ContactData l:after){
      if (l.getId()  > max){max = l.getId();}
    }
    contact.setId(max);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(after),new HashSet<Object> (before));

  }


}
