package web.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import web.tests.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitNewContactForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }
  public void fillNewContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.getFirstname());
    type(By.name("middlename"),contactData.getMiddlename());
    type(By.name("lastname"),contactData.getLastname());
    type(By.name("nickname"),contactData.getNickname());
    type(By.name("title"),contactData.getTitle());
    type(By.name("company"),contactData.getCompany());
    type(By.name("address"),contactData.getAddress());
    //wd.findElement(By.name("theform")).click();
    type(By.name("home"),contactData.getHome_phone());
    type(By.name("mobile"),contactData.getMobile_phone());
    type(By.name("work"),contactData.getWork_phone());
    type(By.name("fax"),contactData.getFax());
    type(By.name("email"),contactData.getEmail());
    type(By.name("email2"),contactData.getEmail2());
    type(By.name("email3"),contactData.getEmail3());
    type(By.name("homepage"),contactData.getHome_page());
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getBirth_day());
    wd.findElement(By.xpath("//option[@value='"+ contactData.getBirth_day() +"']")).click();
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getBirth_month());
    wd.findElement(By.xpath("//option[@value='"+ contactData.getBirth_month() +"']")).click();
    type(By.name("byear"),contactData.getBirth_year());
    if (isElementPresent(By.name("new_group"))) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    }
    type(By.name("address2"),contactData.getAddress2());
    type(By.name("phone2"),contactData.getPhone2());
    type(By.name("notes"),contactData.getNotes());
  }

  public void createNewContact() {
    click(By.linkText("add new"));
  }
  public void returnHomePage() {
    click(By.linkText("home page"));
  }
  public void create(ContactData contact) {
    createNewContact();
    fillNewContactForm(contact);
    submitNewContactForm();
    returnHomePage();
  }

  public void delete(int index) {
    selectContact(index);
    deleteContact();
    acceptPopupAlert();
  }
  public void modify(List<ContactData> before, int index, ContactData contact) {
    editContact(before.get(index).getId());
    fillNewContactForm(contact);
    updateContact();
    returnHomePage();
  }
  public List<ContactData> list() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.xpath("//table[@id='maintable']//tr[@name='entry']"));
    for (WebElement element:elements) {
      List<WebElement> td = element.findElements(By.tagName("td"));
      String firstname = td.get(2).getText();
      String lastname = td.get(1).getText();
      Integer id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      ContactData contact = new ContactData(id, firstname, null, lastname,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
      contacts.add(contact);
    }
    return contacts;
  }
  public void selectContact(int index) { wd.findElements(By.name("selected[]")).get(index).click(); }

  public void deleteContact() { click(By.xpath("//input[@type='button' and @onclick='DeleteSel()']")); }

  public void acceptPopupAlert() { wd.switchTo().alert().accept(); }

  public void editContact(int index) { click(By.xpath("//a[@href='edit.php?id=" + index + "']")); }
  public void updateContact() { click(By.name("update")); }

  public boolean isThereAContact() {
    //return isElementPresent(By.name("selected[]"));
    return isElementPresent(By.name("entry"));
  }
}
