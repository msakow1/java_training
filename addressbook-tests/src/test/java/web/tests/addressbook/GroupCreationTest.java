package web.tests.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    createNewGroup();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnGroupPage();
  }

}
