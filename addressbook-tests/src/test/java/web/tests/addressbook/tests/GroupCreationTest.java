package web.tests.addressbook.tests;

import org.testng.annotations.Test;
import web.tests.addressbook.model.GroupData;
import web.tests.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.goTo().groupPage();
    Groups before = app.group().all();
    GroupData group = new GroupData().withName("test1");
    app.group().create(group);
    Groups after = app.group().all();
    //assertEquals(after.size(),before.size() + 1);
    assertThat(after.size(),equalTo(before.size() + 1));
    //group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
    //before.add(group);
    assertThat(after, equalTo(before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    //after.stream().mapToInt()
    /*Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(),g2.getId());
    before.sort(byId);
    after.sort(byId);
    assertEquals(after,before);*/
  }

}

