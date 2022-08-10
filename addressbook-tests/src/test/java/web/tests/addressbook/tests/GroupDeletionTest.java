package web.tests.addressbook.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import web.tests.addressbook.model.GroupData;
import web.tests.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupDeletionTest extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().all().size() == 0) {
      app.group().create(new GroupData().withName("test1"));
    }
  }

  @Test
  public void testGroupDeletion () {
    Groups before = app.group().all();
    GroupData deleteGroup = before.iterator().next();
    //int index = before.size()-1;
    app.group().deleteById(deleteGroup);
    Groups after = app.group().all();
    assertThat(after.size(),equalTo(before.size()-1));
    assertThat(after, equalTo(before.without(deleteGroup)));
    /*before.remove(deleteGroup);
    Assert.assertEquals(after, before);*/

  }


}
