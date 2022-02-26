package address;

import address.data.AddressEntry;
import address.data.AddressBook;
import java.io.IOException;
import java.util.Scanner;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu class
 **/

class AddressBookApplication {

    /** @param {string}  an array  characters */
    public static void main(String[] args) throws IOException {

        //Create a new instance of AddressBook()
        AddressBook ab;
        ab = new AddressBook();

        //Prompting menu
        char choice = Menu.prompt_Menu(System.in);

        while(choice != 'f') {
            switch(choice) {
                case 'a':
                    loadFromFile(ab);
                    break;
                case 'b':
                    addEntry(ab);
                    break;
                case 'c':
                    removeEntry(ab);
                    break;
                case 'd':
                    findEntry(ab);
                case 'e':
                    ab.list();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
            choice = Menu.prompt_Menu(System.in);
        }
        if(choice == 'f') {
            System.out.println("Goodbye! ");
        }
    }

    private static void findEntry(AddressBook ab) {


    }

    public static void removeEntry(AddressBook ab) {

    }

    private static void loadFromFile(AddressBook ab) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in Filename: ");
        ab.loadFromFile(input.nextLine());
    }

    /**
     * @param ab an AddressBook instance
     */

    private static void addEntry(AddressBook ab) {
        AddressEntry entry = new AddressEntry();
        String firstName;
        String lastName;
        String street;
        String city;
        String state;
        String zip;
        String phone;
        String email;

        firstName = Menu.prompt_FirstName(System.in);
        entry.setFirstName(firstName);

        lastName = Menu.prompt_LastName(System.in);
        entry.setLastName(lastName);

        street = Menu.prompt_Street(System.in);
        entry.setStreet(street);

        city = Menu.prompt_City(System.in);
        entry.setCity(city);

        state = Menu.prompt_State(System.in);
        entry.setState(state);

        zip = (Menu.prompt_Zip(System.in));
        entry.setZip(String.valueOf(zip));

        phone = Menu.prompt_TelePhone(System.in);
        entry.setTelephone(phone);

        email = Menu.prompt_Email(System.in);
        entry.setEmail(email);

        ab.add(entry);


    }


    public static void initAddressBookExercise(AddressBook ab){
        AddressEntry a1 = new AddressEntry("Priyanka", "Gopal", "hayward", "123.com", "Ca", "Rochelle", "1234567890", "94544");
        AddressEntry a2 = new AddressEntry("Sheena", "Gounder", "hayward", "123.com", "Ca", "Rochelle", "1234567890", "94544");
        ab.getAddressEntryList().add(a1);
        ab.getAddressEntryList().add(a2);


    }
}