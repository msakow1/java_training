package web.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import web.tests.addressbook.model.ContactData;
import web.tests.addressbook.model.ContactGroupData;
import web.tests.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitNewContactForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  /*public void fillNewContactForm(ContactGroupData contactGroupData) {
    type(By.name("firstname"),contactGroupData.getFirstname());
    type(By.name("middlename"),contactGroupData.getMiddlename());
    type(By.name("lastname"),contactGroupData.getLastname());
    type(By.name("nickname"),contactGroupData.getNickname());
    type(By.name("title"),contactGroupData.getTitle());
    type(By.name("company"),contactGroupData.getCompany());
    type(By.name("address"),contactGroupData.getAddress());
    //wd.findElement(By.name("theform")).click();
    type(By.name("home"),contactGroupData.getHome_phone());
    type(By.name("mobile"),contactGroupData.getMobile_phone());
    type(By.name("work"),contactGroupData.getWork_phone());
    type(By.name("fax"),contactGroupData.getFax());
    type(By.name("email"),contactGroupData.getEmail());
    type(By.name("email2"),contactGroupData.getEmail2());
    type(By.name("email3"),contactGroupData.getEmail3());
    type(By.name("homepage"),contactGroupData.getHome_page());
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactGroupData.getBirth_day());
    wd.findElement(By.xpath("//option[@value='"+ contactGroupData.getBirth_day() +"']")).click();
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactGroupData.getBirth_month());
    wd.findElement(By.xpath("//option[@value='"+ contactGroupData.getBirth_month() +"']")).click();
    type(By.name("byear"),contactGroupData.getBirth_year());
    //wd.findElement(By.name("aday")).click();
    //new Select(wd.findElement(By.name("aday"))).selectByVisibleText("10");
    //wd.findElement(By.xpath("//div[@id='content']/form/select[3]/option[12]")).click();
    //wd.findElement(By.name("amonth")).click();
    //new Select(wd.findElement(By.name("amonth"))).selectByVisibleText("October");
    //wd.findElement(By.xpath("//div[@id='content']/form/select[4]/option[11]")).click();
    //wd.findElement(By.name("ayear")).click();
    //wd.findElement(By.name("ayear")).click();
    //wd.findElement(By.name("ayear")).clear();
    //wd.findElement(By.name("ayear")).sendKeys("2020");
    //wd.findElement(By.name("theform")).click();
    if (isElementPresent(By.name("new_group"))) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactGroupData.getGroup());
    }
    //wd.findElement(By.name("new_group")).click();
    //new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("[none]");
    //wd.findElement(By.xpath("//option[@value='[none]']")).click();
    type(By.name("address2"),contactGroupData.getAddress2());
    type(By.name("phone2"),contactGroupData.getPhone2());
    type(By.name("notes"),contactGroupData.getNotes());
  }
*/

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
    //wd.findElement(By.name("aday")).click();
    //new Select(wd.findElement(By.name("aday"))).selectByVisibleText("10");
    //wd.findElement(By.xpath("//div[@id='content']/form/select[3]/option[12]")).click();
    //wd.findElement(By.name("amonth")).click();
    //new Select(wd.findElement(By.name("amonth"))).selectByVisibleText("October");
    //wd.findElement(By.xpath("//div[@id='content']/form/select[4]/option[11]")).click();
    //wd.findElement(By.name("ayear")).click();
    //wd.findElement(By.name("ayear")).click();
    //wd.findElement(By.name("ayear")).clear();
    //wd.findElement(By.name("ayear")).sendKeys("2020");
    //wd.findElement(By.name("theform")).click();
    if (isElementPresent(By.name("new_group"))) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    }
    //wd.findElement(By.name("new_group")).click();
    //new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("[none]");
    //wd.findElement(By.xpath("//option[@value='[none]']")).click();
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
  public void createContact(ContactData contact) {
    createNewContact();
    fillNewContactForm(contact);
    submitNewContactForm();
    returnHomePage();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.xpath("//table[@id='maintable']//tr[@name='entry']"));
    for (WebElement element:elements) {
      //String elementText = element.getText();
      //System.out.println(elementText);
      List<WebElement> td = element.findElements(By.tagName("td"));
      String firstname = td.get(2).getText();
      String lastname = td.get(1).getText();
      //System.out.println(td.get(2).getText());
      //String firstname = element.findElement(By.xpath("//td[3]")).getText();
      //String lastname = element.findElement(By.xpath("//td[2]")).getText();
      //String lastname = element.findElement(By.xpath("//td[2]")).get;
      Integer id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      ContactData contact = new ContactData(id, firstname, null, lastname,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
      contacts.add(contact);
    }
    return contacts;
  }
  public void selectContact(int index) { wd.findElements(By.name("selected[]")).get(index).click(); }

  public void deleteContact() { click(By.xpath("//input[@type='button' and @onclick='DeleteSel()']")); }

  public void acceptPopupAlert() { wd.switchTo().alert().accept(); }

  //public void editContact() { click(By.xpath("//table/tbody/tr[2]//img[@title='Edit']")); }
  public void editContact(int index) { click(By.xpath("//a[@href='edit.php?id=" + index + "']")); }
  public void updateContact() { click(By.name("update")); }

  public boolean isThereAContact() {
    //return isElementPresent(By.name("selected[]"));
    return isElementPresent(By.name("entry"));
  }
}
