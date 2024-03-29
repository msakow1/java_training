package web.tests.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import web.tests.addressbook.model.ContactData;
import web.tests.addressbook.model.Contacts;

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

  public void deleteById(ContactData contact) {
    selectContactById(contact.getId());
    deleteContact();
    acceptPopupAlert();
  }
  public void modify(ContactData contact) {
    editContact(contact.getId());
    fillNewContactForm(contact);
    updateContact();
    returnHomePage();
  }

  /*public List<ContactData> list() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.xpath("//table[@id='maintable']//tr[@name='entry']"));
    for (WebElement element:elements) {
      List<WebElement> td = element.findElements(By.tagName("td"));
      String firstname = td.get(2).getText();
      String lastname = td.get(1).getText();
      Integer id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      ContactData contact = new ContactData().withId(id).withFirstname(firstname).withLastname(lastname);
      //ContactData contact = new ContactData(id, firstname, null, lastname,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
      contacts.add(contact);
    }
    return contacts;
  }*/
  public Contacts all() {
    Contacts contacts = new Contacts();
    List<WebElement> elements = wd.findElements(By.xpath("//table[@id='maintable']//tr[@name='entry']"));
    for (WebElement element:elements) {
      List<WebElement> td = element.findElements(By.tagName("td"));
      String firstname = td.get(2).getText();
      String lastname = td.get(1).getText();
      String address = td.get(3).getText();
      String allEmails = td.get(4).getText();
      //String[] phones = td.get(5).getText().split("\n");
      String allPhones = td.get(5).getText();
      Integer id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      /*ContactData contact = new ContactData().withId(id).withFirstname(firstname).withLastname(lastname);
      ContactData contact = new ContactData(id, firstname, null, lastname,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
      contacts.add(new ContactData().withId(id).withFirstname(firstname).withLastname(lastname).withHome_phone(phones[0])
              .withMobile_phone(phones[1]).withWork_phone(phones[2])); */
      contacts.add(new ContactData().withId(id).withFirstname(firstname).withLastname(lastname).withAddress(address).withAllPhones(allPhones).withAllEmails(allEmails));
    }
    return contacts;
  }
  public ContactData infoFromEditForm(ContactData contact){
    editContact(contact.getId());
    String firstname = wd.findElement(By.name("firstname")).getAttribute("value");
    String lastname = wd.findElement(By.name("lastname")).getAttribute("value");
    String home = wd.findElement(By.name("home")).getAttribute("value");
    String mobile = wd.findElement(By.name("mobile")).getAttribute("value");
    String work = wd.findElement(By.name("work")).getAttribute("value");
    String address = wd.findElement(By.name("address")).getText();
    String email = wd.findElement(By.name("email")).getAttribute("value");
    String email2 = wd.findElement(By.name("email2")).getAttribute("value");
    String email3 = wd.findElement(By.name("email3")).getAttribute("value");
    wd.navigate().back();
    return new ContactData().withId(contact.getId()).withFirstname(firstname).withLastname(lastname).withHome_phone(home)
            .withMobile_phone(mobile).withWork_phone(work).withAddress(address).withEmail(email).withEmail2(email2).withEmail3(email3);
  }
  public void selectContactById(Integer id) { wd.findElement(By.cssSelector("input[value='" + id + "']")).click(); }

  public void deleteContact() { click(By.xpath("//input[@type='button' and @onclick='DeleteSel()']")); }

  public void acceptPopupAlert() { wd.switchTo().alert().accept(); }

  public void editContact(int index) { click(By.xpath("//a[@href='edit.php?id=" + index + "']")); }
  public void updateContact() { click(By.name("update")); }

  public boolean isThereAContact() {
    //return isElementPresent(By.name("selected[]"));
    return isElementPresent(By.name("entry"));
  }
}
