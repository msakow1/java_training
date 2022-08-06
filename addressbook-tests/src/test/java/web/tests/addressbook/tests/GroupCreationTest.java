package web.tests.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import web.tests.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData group = new GroupData("test1", null, null);
    app.getGroupHelper().createGroup(group);
    //app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size() + 1);

    int max = 0;
    for (GroupData l: after) {
      if (l.getId() > max) { max = l.getId();}
    }
    group.setId(max);
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(after),new HashSet<Object> (before));
  }

}

