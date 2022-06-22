package web.tests.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{
  @Test
  public void testContactDeletionTest() {
  app.getNavigationHelper().gotoHomePage();
  app.getContactHelper().selectContact();
  app.getContactHelper().deleteContact();
  app.getContactHelper().acceptPopupAlert();
  app.getNavigationHelper().gotoHomePage();
  }
}
