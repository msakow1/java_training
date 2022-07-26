package web.tests.addressbook.tests;

import org.testng.annotations.Test;
import web.tests.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase{
  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
    }
    app.getGroupHelper().selectGroups();

  }
}
