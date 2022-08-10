package web.tests.addressbook.model;

import java.util.Objects;

public class ContactData {
  private String firstname;
  private String middlename;
  private String lastname;
  private String nickname;
  private String title;
  private String company;
  private String address;
  private String home_phone;
  private String mobile_phone;
  private String work_phone;
  private String fax;
  private String email;
  private String email2;
  private String email3;
  private String home_page;
  private String birth_day;
  private String birth_month;
  private String birth_year;
  private String address2;
  private String phone2;
  private String notes;
  private String group;
  private Integer id = Integer.MAX_VALUE;

  /*
  public ContactData(Integer id, String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String home_phone, String mobile_phone, String work_phone, String fax, String email, String email2, String email3, String home_page, String birth_day, String birth_month, String birth_year, String group, String address2, String phone2, String notes) {
    this.firstname = firstname;
    this.id = id;
    this.lastname = lastname;
    this.middlename = middlename;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.home_phone = home_phone;
    this.mobile_phone = mobile_phone;
    this.work_phone = work_phone;
    this.fax = fax;
    this.email = email;
    this.email2 = email2;
    this.email3 = email3;
    this.home_page = home_page;
    this.birth_day = birth_day;
    this.birth_month = birth_month;
    this.birth_year = birth_year;
    this.group = group;
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;
  }


  public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String home_phone, String mobile_phone, String work_phone, String fax, String email, String email2, String email3, String home_page, String birth_day, String birth_month, String birth_year, String group, String address2, String phone2, String notes) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.home_phone = home_phone;
    this.mobile_phone = mobile_phone;
    this.work_phone = work_phone;
    this.fax = fax;
    this.email = email;
    this.email2 = email2;
    this.email3 = email3;
    this.home_page = home_page;
    this.birth_day = birth_day;
    this.birth_month = birth_month;
    this.birth_year = birth_year;
    this.group = group;
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;
    this.id = Integer.MAX_VALUE;
  }
*/
  public Integer getId() {
    return id;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }


  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHome_phone() {
    return home_phone;
  }

  public String getMobile_phone() {
    return mobile_phone;
  }

  public String getWork_phone() {
    return work_phone;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHome_page() {
    return home_page;
  }

  public String getBirth_day() {
    return birth_day;
  }

  public String getBirth_month() {
    return birth_month;
  }

  public String getBirth_year() {
    return birth_year;
  }

  public String getGroup() {return group;}

  public String getAddress2() {
    return address2;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getNotes() {
    return notes;
  }

  public ContactData withId(Integer id) {
    this.id = id;
    return this;
  }

  public ContactData withFirstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  public ContactData withLastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  public ContactData withMiddlename(String middlename) {
    this.middlename = middlename;
    return this;
  }

  public ContactData withNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  public ContactData withTitle(String title) {
    this.title = title;
    return this;
  }

  public ContactData withCompany(String company) {
    this.company = company;
    return this;
  }

  public ContactData withAddress(String address) {
    this.address = address;
    return this;
  }

  public ContactData withHome_phone(String home_phone) {
    this.home_phone = home_phone;
    return this;
  }
  public ContactData withMobile_phone(String mobile_phone) {
    this.mobile_phone = mobile_phone;
    return this;
  }

  public ContactData withWork_phone(String work_phone) {
    this.work_phone = work_phone;
    return this;
  }

  public ContactData withFax(String fax) {
    this.fax = fax;
    return this;
  }

  public ContactData withEmail(String email) {
    this.email = email;
    return this;
  }

  public ContactData withEmail2(String email2) {
    this.email2 = email2;
    return this;
  }

  public ContactData withEmail3(String email3) {
    this.email3 = email3;
    return this;
  }

  public ContactData withHome_page(String home_page) {
    this.home_page = home_page;
    return this;
  }

  public ContactData withBirth_day(String birth_day) {
    this.birth_day = birth_day;
    return this;
  }

  public ContactData withBirth_month(String birth_month) {
    this.birth_month = birth_month;
    return this;
  }

  public ContactData withBirth_year(String birth_year) {
    this.birth_year = birth_year;
    return this;
  }

  public ContactData withAddress2(String address2) {
    this.address2 = address2;
    return this;
  }

  public ContactData withPhone2(String phone2) {
    this.phone2 = phone2;
    return this;
  }

  public ContactData withNotes(String notes) {
    this.notes = notes;
    return this;
  }

  public ContactData withGroup(String group) {
    this.group = group;
    return this;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", id=" + id +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, id);
  }
}
