package web.tests.addressbook.tests;

public class ContactGroupData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String home_phone;
  private final String mobile_phone;
  private final String work_phone;
  private final String fax;
  private final String email;
  private final String email2;
  private final String email3;
  private final String home_page;
  private final String birth_day;
  private final String birth_month;
  private final String birth_year;
  private final String address2;
  private final String phone2;
  private final String notes;

  public ContactGroupData(ContactData contactData) {
    this.firstname = contactData.getFirstname();
    this.middlename = contactData.getMiddlename();
    this.lastname = contactData.getLastname();
    this.nickname = contactData.getNickname();
    this.title = contactData.getTitle();
    this.company = contactData.getCompany();
    this.address = contactData.getAddress();
    this.home_phone = contactData.getHome_phone();
    this.mobile_phone = contactData.getMobile_phone();
    this.work_phone = contactData.getWork_phone();
    this.fax = contactData.getFax();
    this.email = contactData.getEmail();
    this.email2 = contactData.getEmail2();
    this.email3 = contactData.getEmail3();
    this.home_page = contactData.getHome_page();
    this.birth_day = contactData.getBirth_day();
    this.birth_month = contactData.getBirth_month();
    this.birth_year = contactData.getBirth_year();
    this.address2 = contactData.getAddress2();
    this.phone2 = contactData.getPhone2();
    this.notes = contactData.getNotes();
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

  public String getAddress2() {
    return address2;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getNotes() {
    return notes;
  }
}
