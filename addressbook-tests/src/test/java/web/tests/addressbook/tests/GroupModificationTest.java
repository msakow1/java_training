package web.tests.addressbook.tests;

import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase{
  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroups();

  }
}
