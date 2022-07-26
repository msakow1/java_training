package web.tests.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.tests.addressbook.model.GroupData;

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

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
     }
  public void createGroup(GroupData group) {
    createNewGroup();
    fillGroupForm(group);
    submitGroupCreation();
    returnGroupPage();
  }

  public void createNewGroup() {
    click(By.name("new"));
  }

  public void selectGroups() { click(By.name("selected[]")); }

  public void removeGroup() { click(By.name("delete"));}

  public void editGroup() { click(By.name("edit"));}

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }
}
