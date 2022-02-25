package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
import java.io.InputStream;



    public class Menu {


        public static String prompt_FirstName(InputStream in) {
            Scanner input = new Scanner(in);
            System.out.println("First Name: ");
            return input.nextLine();
        }

        public static String prompt_LastName(InputStream in) {
            Scanner input = new Scanner(in);
            System.out.println("Last Name: ");
            return input.nextLine();
        }

        public static String prompt_Street(InputStream in) {
            Scanner input = new Scanner(in);
            System.out.println("Street: ");
            return input.nextLine();
        }

        public static String prompt_City(InputStream in) {
            Scanner input = new Scanner(in);
            System.out.println("City: ");
            return input.nextLine();
        }

        public static String prompt_State(InputStream in) {
            Scanner input = new Scanner(in);
            System.out.println("State: ");
            return input.nextLine();
        }

        public static String prompt_Zip(InputStream in) {
            Scanner input = new Scanner(in);
            System.out.println("Zip Code: ");
            return input.nextLine();
        }

        public static String prompt_Phone(InputStream in) {
            System.out.println("Phone Number: ");
            return " ";
        }

        public static String prompt_Email(InputStream in) {
            System.out.println("Email: ");
            return " ";
        }

        public static Character prompt_Menu(InputStream in) {
            Scanner input = new Scanner(in);
            System.out.println("******************");
            System.out.println("Please enter in your menu selection");
            System.out.println("a) Loading From File");
            System.out.println("b) Addition");
            System.out.println("c) Removal");
            System.out.println("d) Find");
            System.out.println("e) Listing");
            System.out.println("f) Quit");
            System.out.println("******************");
            return input.nextLine().charAt(0);
        }

    }

