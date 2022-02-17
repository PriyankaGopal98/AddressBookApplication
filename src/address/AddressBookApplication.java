package address;


/** main AddressBookApplication: purpose is to invoke some methods of the Menu classs
 **/

class AddressBookApplication {

    public static void main(String args[]) {

        //create instance of menu
        Menu myMenu = new Menu();

        //Display to standard output all of the Menu prompts
        System.out.println(myMenu.prompt_FirstName());

        System.out.println(myMenu.prompt_LastName());

        System.out.println(myMenu.prompt_City());

        System.out.println(myMenu.prompt_Email());

        System.out.println(myMenu.prompt_State());

        System.out.println(myMenu.prompt_Street());

        System.out.println(myMenu. prompt_Telephone());

        System.out.println(myMenu. prompt_Zip());
     // Create a instance for new address book
        AddressBook ab = new AddressBook();
        initAddressBookExercise(ab);
        ab.list();

    }

    public static void initAddressBookExercise(AddressBook ab){
        AddressEntry a = new AddressEntry("Priyanka", "Gopal", "hayward", "123.com", "Ca", "Rochelle", "1234567890", "94544");
        ab.getAddressEntryList().add(a);

    }
}