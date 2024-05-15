
package hms_a;

public class Patient {
    private String name, gender, address, Contact;
    private int id,age;

    public Patient() {
        this.name = "";
        this.gender = "";
        this.address = "";
        this.Contact = "";
        this.id = 0;
        this.age = 0;
    }

    public Patient(String name, String gender, String address, String Contact, int id, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.Contact = Contact;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", gender=" + gender + ", address=" + address + ", Contact=" + Contact + ", id=" + id + ", age=" + age + '}';
    }
    
}
