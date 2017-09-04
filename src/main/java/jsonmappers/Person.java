package jsonmappers;


public class Person {
  private String fName;
  private String lName;
  private String phone;
  private int id;

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Person(int id, String fName, String lName, String phone) {
    this.fName = fName;
    this.lName = lName;
    this.phone = phone;
    this.id = id;
  }
  
}
