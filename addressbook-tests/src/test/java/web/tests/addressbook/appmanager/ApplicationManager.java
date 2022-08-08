package web.tests.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  private Browser browser;

  public ApplicationManager(Browser browser) {
    this.browser = browser;
  }

  private ContactHelper contactHelper;
  private NavigationHelper navigationHelper;
  public WebDriver wd;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;

  public void init() {
    if (browser .equals(Browser.FIREFOX)) {
      wd = new FirefoxDriver();
    } else if (browser .equals(Browser.CHROME)) {
      wd = new ChromeDriver();
    }

    wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    sessionHelper.logout(this);
    wd.quit();
  }

  public GroupHelper group() {
    return groupHelper;
  }

  public NavigationHelper goTo() {
    return navigationHelper;
  }

  public ContactHelper contact() {
    return contactHelper;
  }

}
