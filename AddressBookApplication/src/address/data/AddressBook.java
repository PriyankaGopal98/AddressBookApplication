package address.data;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

    public void loadFromFile(String path) throws IOException {
        ArrayList<String> list = new ArrayList<>(Files.readAllLines(Paths.get(path)));

    }

    public void add(AddressEntry entry) {
        AddressEntryList.add(entry);
    }
}
