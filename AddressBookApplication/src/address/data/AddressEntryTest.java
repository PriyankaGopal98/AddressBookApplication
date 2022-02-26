package address.data;

import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest {
    public static void main(String Args[]){
        AddressEntry boy=  testAddressEntry("priyanka","gopal", "Malabon", "..e@gmail.com", "Manila", "Di makita", "0902025050", "2700");
        AddressEntry girl=  testAddressEntry("Joy","Dalisay", "Malabon", "..y@gmail.com", "Baguio", "Di mahanap", "091111111", "2610");

    }
    public static AddressEntry testAddressEntry(String firstName,String  lastName, String city, String email, String state, String street, String telephone, String zip){
        AddressEntry Add = new AddressEntry( firstName,  lastName,  city,  email,  state,  street,  telephone,  zip);
        return Add;
    }
    public static String  testGetFirstName(AddressEntry Add) {
        return Add.getFirstName();
    }
    public static String  testGetLastName(AddressEntry Add) {
        return Add.getLastName();
    }
    public static String testGetCity(AddressEntry Add) {
        return Add.getCity();
    }
    public static String testGetEmail(AddressEntry Add) {
        return Add.getEmail();
    }
    public static String testGetState(AddressEntry Add) {
        return Add.getState();
    }
    public static String testGetStreet(AddressEntry Add) {
        return Add.getStreet();
    }
    public static String testGetZip(AddressEntry Add) {
        return Add.getZip();
    }
    public static String testGetTelephone(AddressEntry Add) {
        return Add.getTelephone();
    }

    public static void testSetFirstName(AddressEntry Add, String firstName) {
        Add.setFirstName(firstName);
    }
    public static void testSetLastName(AddressEntry Add, String lastName) {
        Add.setLastName(lastName);
    }
    public static void testSetCity(AddressEntry Add, String city) {
        Add.setCity(city);
    }

    public static void testSetEmail(AddressEntry Add, String email) {
        Add.setEmail(email);
    }
    public static void testSetState(AddressEntry Add, String state) {
        Add.setState(state);
    }
    public static void testSetStreet(AddressEntry Add, String street) {
        Add.setStreet(street);
    }
    public static void testSetTelephone(AddressEntry Add, String telephone) {
        Add.setTelephone(telephone);
    }
    public static void testSetZip(AddressEntry Add, String zip) {
        Add.setZip(zip);
    }
    public static String testToString(AddressEntry Add) {
        return Add.toString();
    }
}


}