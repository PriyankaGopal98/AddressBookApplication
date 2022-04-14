package address.data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBook {
    private List<AddressEntry> addressEntryList;
    private AddressEntry entry;

    public AddressBook(){
        addressEntryList = new ArrayList();
    }

    public List<AddressEntry> getAddressEntryList() {
        return addressEntryList;
    }

    public void setAddressEntryList(ArrayList<AddressEntry> list) {
        addressEntryList = list;
    }

    public ArrayList<AddressEntry> getSortedAddressEntryList() {
        //create a new list of address entries, so that sort() method must not change the original list of address entries
        ArrayList<AddressEntry> list = new ArrayList(addressEntryList);
        return list;
    }

    public AddressEntry findAddressEntryAt(int index){
        return addressEntryList.get(index);
    }
    /** Create instance of AddressBook called addressBook
     *  @param obj loaded with data
     */
    public void removeAddressEntry(AddressEntry obj){
        addressEntryList.remove(obj);
    }

    public void addAddressEntry(AddressEntry obj){
        addressEntryList.add(obj);
    }

    public void readFromFile(String fileName) {
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNext()) {
                String line[] = sc.nextLine().split(",");   // each data member must be separated by comma(,)
                if (line.length < 8) //8 represents no. of data members of AddressEntry
                    continue;
                addressEntryList.add(new AddressEntry());
            }
            System.out.println("Successfully loaded.");
            sc.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }

    public void loadFromFile(String nextLine) throws IOException {
        {
            String nextLine1 = nextLine;
            ArrayList<String> list = new ArrayList<>(Files.readAllLines(Path.of(nextLine)));
            System.out.println("Read in " + list.size() + " new Addresses, successfully loaded, currently " + addressEntryList.size() + " Addresses");
    }
    }

    public void list() {
        addressEntryList.forEach(System.out::println);
    }

    public void add(AddressEntry entry) {
        addressEntryList.add(entry);
    }
}
