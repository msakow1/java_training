package web.tests.addressbook.tests;

public class ContactData {
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

  public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String home_phone, String mobile_phone, String work_phone, String fax, String email, String email2, String email3, String home_page, String birth_day, String birth_month, String birth_year, String address2, String phone2, String notes) {
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
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;
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
