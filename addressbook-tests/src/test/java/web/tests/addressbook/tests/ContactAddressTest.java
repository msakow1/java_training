package web.tests.addressbook.tests;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import web.tests.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ContactAddressTest extends TestBase{

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().homePage();
    if (app.contact().all().size() == 0) {
      app.contact().create(new ContactData().withFirstname("Maciej").withMiddlename("Tomasz").withLastname("Kowalski").withNickname("Kowal").withTitle("Doctor").withCompany("Google").withAddress("Test Street 10/1").withHome_phone("22556677").withMobile_phone("608001001").withWork_phone("608002002").withFax("608003003").withEmail("kowal@gmail.com").withEmail2("kowal1@gmail.com").withEmail3("kowal3@gmail.com").withHome_page("kowal.com").withBirth_day("1").withBirth_month("January").withBirth_year("1980").withGroup("test1").withAddress2("test1").withNotes("Test3").withGroup("Test3"));
    }
  }

  @Test
  public void testContactAddress(){
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm= app.contact().infoFromEditForm(contact);
    MatcherAssert.assertThat(contact.getAddress(), Matchers.equalTo(contactInfoFromEditForm.getAddress()));

  }

}
