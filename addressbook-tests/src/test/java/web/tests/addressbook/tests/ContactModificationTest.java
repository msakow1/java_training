package web.tests.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import web.tests.addressbook.model.ContactData;
import web.tests.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactModificationTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      app.contact().create(new ContactData().withFirstname("Maciej").withMiddlename("Tomasz").withLastname("Kowalski").withNickname("Kowal").withTitle("Doctor").withCompany("Google").withAddress("Test Street 10/1").withHome_phone("22556677").withMobile_phone("608001001").withWork_phone("608002002").withFax("608003003").withEmail("kowal@gmail.com").withEmail2("kowal1@gmail.com").withEmail3("kowal3@gmail.com").withHome_page("kowal.com").withBirth_day("1").withBirth_month("January").withBirth_year("1980").withGroup("test1").withAddress2("test1").withPhone2("Test3").withNotes("Test3").withGroup("Test3"));
    }
  }
  @Test
  public void testContactModification() throws InterruptedException {
    Contacts before = app.contact().all();
    ContactData modifiedContacts = before.iterator().next();
    ContactData contact = new ContactData().withId(modifiedContacts.getId()).withFirstname("John").withMiddlename("").withLastname("Kowalski").withNickname("Kowal").withTitle("Doctor").withCompany("Google").withAddress("Test Street 10/1").withHome_phone("22556677").withMobile_phone("608001001").withWork_phone("608002002").withFax("608003003").withEmail("kowal@gmail.com").withEmail2("kowal1@gmail.com").withEmail3("kowal3@gmail.com").withHome_page("kowal.com").withBirth_day("1").withBirth_month("January").withBirth_year("1980").withGroup("test1").withAddress2("test1").withPhone2("Test3").withNotes("Test3").withGroup("Test3");
    app.goTo().homePage();
    app.contact().modify(contact);
    app.goTo().homePage();
    Contacts after = app.contact().all();
    assertEquals(after.size(),before.size());
    assertThat(after, equalTo(before.without(modifiedContacts).withAdded(modifiedContacts)));
  }



}
