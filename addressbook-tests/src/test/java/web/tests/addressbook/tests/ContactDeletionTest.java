package web.tests.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import web.tests.addressbook.model.ContactData;
import web.tests.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactDeletionTest extends TestBase{

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      ContactData contact = new ContactData().withFirstname("Maciej").withMiddlename("Tomasz").withLastname("Kowalski").withNickname("Kowal").withTitle("Doctor").withCompany("Google").withAddress("Test Street 10/1").withHome_phone("22556677").withMobile_phone("608001001").withWork_phone("608002002").withFax("608003003").withEmail("kowal@gmail.com").withEmail2("kowal1@gmail.com").withEmail3("kowal3@gmail.com").withHome_page("kowal.com").withBirth_day("1").withBirth_month("January").withBirth_year("1980").withGroup("test1").withAddress2("test1").withPhone2("Test3").withNotes("Test3").withGroup("Test3");
    }
  }
  @Test
  public void testContactDeletion() {
  Contacts before = app.contact().all();
  ContactData deleteContact = before.iterator().next();
  app.goTo().homePage();
  app.contact().deleteById(deleteContact);
  app.goTo().homePage();
  Contacts after = app.contact().all();
  assertThat(after.size(),equalTo(before.size()-1));
  assertThat(after, equalTo(before.without(deleteContact)));
  }

}
