package web.tests.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import web.tests.addressbook.model.ContactData;
import web.tests.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTest extends TestBase{
  @Test
  public void testContactCreation() throws Exception {
    app.goTo().homePage();
    Contacts before = app.contact().all();
    ContactData contact = new ContactData().withFirstname("Maciej").withMiddlename("Tomasz").withLastname("Kowalski").withNickname("Kowal").withTitle("Doctor").withCompany("Google").withAddress("Test Street 10/1").withHome_phone("22556677").withMobile_phone("608001001").withWork_phone("608002002").withFax("608003003").withEmail("kowal@gmail.com").withEmail2("kowal1@gmail.com").withEmail3("kowal3@gmail.com").withHome_page("kowal.com").withBirth_day("1").withBirth_month("January").withBirth_year("1980").withGroup("test1").withAddress2("test1").withPhone2("Test3").withNotes("Test3");
    app.contact().create(contact);
    Contacts after = app.contact().all();
    Assert.assertEquals(after.size(),before.size() + 1);
    assertThat(after, equalTo(before.withAdded(contact.withId(after.stream().mapToInt( (c) -> c.getId()).max().getAsInt()))));
  }


}
