package address;

public class AddressEntry {
    private String firstName;
    private String lastName;
    private String city;
    private String email;
    private String state;
    private String street;
    private String telephone;
    private String zip;

    public AddressEntry(String firstName,String  lastName, String city, String email, String state, String street, String telephone, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.email = email;
        this.state = state;
        this.street = street;
        this.telephone = telephone;
        this.zip = zip;
    }
     //return first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //return last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //return city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    // return email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   //return state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
   //return telephone
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
  //return zip
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString() {
        return "First Name:" + firstName + "\n" +
                "Last Name:" + lastName + "\n" +
                "City:" + city + "\n" +
                "Email:" + email + "\n" +
                "State:" + state + "\n" +
                "Street:" + street + "\n" +
                "Telephone:" + telephone + "\n" +
                "Zip:" + zip + "\n";
    }

}

