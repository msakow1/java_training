package web.tests.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import web.tests.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().homePage();
    if (app.contact().list().size() == 0) {
      app.contact().create(new ContactData().withFirstname("Maciej").withMiddlename("Tomasz").withLastname("Kowalski").withNickname("Kowal").withTitle("Doctor").withCompany("Google").withAddress("Test Street 10/1").withHome_phone("22556677").withMobile_phone("608001001").withWork_phone("608002002").withFax("608003003").withEmail("kowal@gmail.com").withEmail2("kowal1@gmail.com").withEmail3("kowal3@gmail.com").withHome_page("kowal.com").withBirth_day("1").withBirth_month("January").withBirth_year("1980").withGroup("test1").withAddress2("test1").withPhone2("Test3").withNotes("Test3").withGroup("Test3"));
    }
  }
  @Test
  public void testContactModification() throws InterruptedException {
    List<ContactData> before = app.contact().list();
    int index = before.size() -1;
    ContactData contact = new ContactData().withId(before.get(index).getId()).withFirstname("John").withMiddlename("").withLastname("Kowalski").withNickname("Kowal").withTitle("Doctor").withCompany("Google").withAddress("Test Street 10/1").withHome_phone("22556677").withMobile_phone("608001001").withWork_phone("608002002").withFax("608003003").withEmail("kowal@gmail.com").withEmail2("kowal1@gmail.com").withEmail3("kowal3@gmail.com").withHome_page("kowal.com").withBirth_day("1").withBirth_month("January").withBirth_year("1980").withGroup("test1").withAddress2("test1").withPhone2("Test3").withNotes("Test3").withGroup("Test3");
    app.goTo().homePage();
    app.contact().modify(before, index, contact);
    app.goTo().homePage();
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(),before.size());
    before.remove(index);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(after,before);
  }



}
