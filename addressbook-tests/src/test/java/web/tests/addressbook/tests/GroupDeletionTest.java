package web.tests.addressbook.tests;


import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletion () {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroups();
    app.getGroupHelper().removeGroup();
    app.getNavigationHelper().gotoGroupPage();
  }
}
