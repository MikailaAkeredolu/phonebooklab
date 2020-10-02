package contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    // A Container that holds names and phoneNumbers
    private Map<String, List<String>> contacts;

    public PhoneBook(Map<String, List<String>> contacts) {
        this.contacts = contacts;
    }

    //add
//    public void add(String name, String phoneNumber){
//        if(contacts.containsKey(name)){
//            contacts.get(name).add(phoneNumber);
//        }else{
//            contacts.put(name,new ArrayList<String>());
//            add(name,phoneNumber);
//        }
//    }


    public void add(String name, String phoneNumber) {
        List<String> listOfPhoneNumbers = new ArrayList<String>();
        listOfPhoneNumbers.add(phoneNumber);
        contacts.put(name, listOfPhoneNumbers);
    }

    public void addAll(String name, String ...phoneNumbers){
        contacts.put(name, Arrays.asList(phoneNumbers));
    }

    //remove
    public void remove(String name){
       contacts.remove(name);
    }

    //hasEntry
    public boolean hasEntry(String name){
        return contacts.containsKey(name);
    }

    //lookup
    public List<String> lookup(String name){
        return contacts.get(name);
    }

    //Get all contacts
    public List<String> getAllContactNames(){
        return new ArrayList<String>(contacts.keySet());
    }

    //reverse lookup - find someone by their phone number
    public String reverseLookup(String phoneNumber) {
        List<String> listOfNumbers;
        for ( String key : contacts.keySet() ) {
            listOfNumbers = contacts.get(key);
            for ( String value : listOfNumbers) {
                if(value.equals(phoneNumber))
                    return key;
            }
        }
        return null;
    }


}
