package web.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends GroupHelper {

  public SessionHelper(WebDriver wd) {

    super(wd);
  }

  public void login(String username, String password) {
    wd.get("http://localhost/addressbook/");
    type(By.name("user"),username);
    type(By.name("pass"),password);
    click(By.xpath("//input[@value='Login']"));
  }

  public void logout(ApplicationManager applicationManager) {
    applicationManager.wd.findElement(By.linkText("Logout")).click();
  }
}
