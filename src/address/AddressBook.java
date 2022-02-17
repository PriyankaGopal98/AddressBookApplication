package address;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<AddressEntry> AddressEntryList = new ArrayList<>();

    public List<AddressEntry> getAddressEntryList() {
        return AddressEntryList;
    }

    public void list(){
        this.AddressEntryList.forEach(addressEntry -> {
            System.out.println(addressEntry.toString());
        });
    }
}
