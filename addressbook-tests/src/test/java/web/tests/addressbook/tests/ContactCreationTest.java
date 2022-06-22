package web.tests.addressbook.tests;

import org.testng.annotations.*;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().createNewContact();
    app.getContactHelper().fillNewContactForm(new ContactGroupData(new ContactData("Maciej", "Tomasz", "Kowalski", "Kowal", "Doctor", "Google", "Test Street 10/1", "22556677", "608001001", "608002002", "608003003", "kowal@gmail.com", "kowal1@gmail.com", "kowal3@gmail.com", "kowal.com", "1", "January", "1980", "Test3", "Test3", "Test3")));
    app.getContactHelper().submitNewContactForm();
  }


}
