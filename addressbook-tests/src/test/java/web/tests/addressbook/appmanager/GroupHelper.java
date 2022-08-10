package web.tests.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web.tests.addressbook.model.GroupData;
import web.tests.addressbook.model.Groups;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupHelper extends HelperBase {
  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void returnGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
     }
  public void create(GroupData group) {
    createNewGroup();
    fillGroupForm(group);
    submitGroupCreation();
    returnGroupPage();
  }

  public void modify(GroupData group) {
    selectGroupById(group.getId());
    editGroup();
    fillGroupForm(group);
    submitGroupModification();
    returnGroupPage();
  }
  public void delete(int index) {
    selectGroups(index);
    removeGroup();
    returnGroupPage();
  }
  public void deleteById(GroupData group) {
    selectGroupById(group.getId());
    removeGroup();
    returnGroupPage();
  }


  public void createNewGroup() {
    click(By.name("new"));
  }

  public void selectGroups(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  private void selectGroupById(Integer id) {
    wd.findElement(By.cssSelector("input[value='" + id + "']")).click();
  }

  public void removeGroup() { click(By.name("delete"));}

  public void editGroup() { click(By.name("edit"));}

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }

 /* public List<GroupData> list() {
    List<GroupData> groups = new ArrayList<GroupData>();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for (WebElement element:elements) {
      String name = element.getText();
      Integer id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      groups.add(new GroupData().withId(id).withName(name));
    }
    return groups;
  }
  public Set<GroupData> all() {
   Set<GroupData> groups = new HashSet<>();
   List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
   for (WebElement element : elements) {
     String name = element.getText();
     Integer id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
     groups.add(new GroupData().withId(id).withName(name));
    }
   return groups;
 }*/

  public Groups all() {
    Groups groups = new Groups();
    List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
    for (WebElement element : elements) {
      String name = element.getText();
      Integer id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      groups.add(new GroupData().withId(id).withName(name));
    }
    return groups;
  }
}
