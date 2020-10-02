import contact.PhoneBook;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class PhoneBookTest {

    @Test
    public void addTest() {
        //Given
        Map<String, List<String>> phoneBookMap = new HashMap( );
        PhoneBook phoneBook = new PhoneBook(phoneBookMap);

        //When
        phoneBook.add("mike","302-223-2345");
        String expected = "302-223-2345";
        List<String> actual = phoneBook.lookup("mike");

        //Actual
        Assert.assertEquals(actual.get(0), expected);
    }

    @Test
    public void addAllTest() {
        //Given
        Map<String, List<String>> phoneBookMap = new HashMap( );
        PhoneBook phoneBook = new PhoneBook(phoneBookMap);

        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-4444",
                "302-555-3333",
                "302-555-2222",
                "302-555-1111",
        };

        //When
        phoneBook.addAll(name, phoneNumbers);
        List<String> actual = phoneBook.lookup(name);
        List<String> expected = Arrays.asList(phoneNumbers);

        //Then
        Assert.assertEquals(expected, actual);
    }

        @Test
        public void hasEntryTest() {
            //Given
            Map<String, List<String>> phoneBookMap = new HashMap( );
            PhoneBook phoneBook = new PhoneBook(phoneBookMap);
            String name = "John";
            String phoneNumber = "302-555-4545";

            //When
            phoneBook.add(name, phoneNumber);

            //Then
            Assert.assertTrue(phoneBook.hasEntry(name));
        }


            @Test
            public void lookupTest(){
                //Given
                ArrayList<String>listOfPhoneNumbers = new ArrayList<String>();
                listOfPhoneNumbers.add("302-123-2345");
                listOfPhoneNumbers.add("302-223-2345");
                Map<String, List<String>> phoneBookMap = new HashMap();
                phoneBookMap.put("mike",listOfPhoneNumbers );
                PhoneBook phoneBook = new PhoneBook(phoneBookMap);

                //when
                List<String> actual = phoneBook.lookup("mike");  //actual - invoke the lookup method on the object
                List<String> expected = listOfPhoneNumbers;    //expect the list of numbers to come back

                //then
                Assert.assertEquals(expected,actual);
            }

            @Test
            public void removeTest(){
                //Given
                ArrayList<String>listOfPhoneNumbers = new ArrayList<String>();
                listOfPhoneNumbers.add("302-123-2345");
                listOfPhoneNumbers.add("302-223-2345");
                Map<String, List<String>> phoneBookMap = new HashMap( );
                phoneBookMap.put("mike",listOfPhoneNumbers );
                PhoneBook phoneBook = new PhoneBook(phoneBookMap);

                //When
                phoneBook.remove("mike");

                //then
                Assert.assertNull(phoneBook.lookup("mike"));      // Assert.assertEquals(null, phoneBook.lookup("mike") );


            }

             @Test
            public void getAllContactsTest() {
                //given
                 ArrayList<String>listOfPhoneNumbers = new ArrayList<String>();
                 listOfPhoneNumbers.add("302-123-2345");
                 listOfPhoneNumbers.add("302-223-2345");

                 Map<String, List<String>> phoneBookMap = new HashMap( );
                 phoneBookMap.put("mike",listOfPhoneNumbers );

                 PhoneBook phoneBook = new PhoneBook(phoneBookMap);

                 phoneBook.add("jane", "302-223-2340" );
                 phoneBook.add("Deen", "302-223-2341" );

                 List<String> expectedListOfPhoneNumbers = new ArrayList<String>();
                 expectedListOfPhoneNumbers.add("mike");
                 expectedListOfPhoneNumbers.add("jane");
                 expectedListOfPhoneNumbers.add("Deen");

                 //when
                 Collections.sort(expectedListOfPhoneNumbers);
                 List<String> actual =  phoneBook.getAllContactNames();

                 //then
                 Collections.sort(actual);
                 Assert.assertEquals(expectedListOfPhoneNumbers, actual);

             }


    @Test
    public void reverseLookUpTest() {
        //Given
        HashMap<String, List<String>> phoneBookMap = new HashMap();
        PhoneBook phoneBook = new PhoneBook(phoneBookMap);
        String name = "John";
        String phoneNumber = "302-555-4545";
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(name));

        //When
        String actual = phoneBook.reverseLookup(phoneNumber);
        String expected = name;

        //Actual
        Assert.assertEquals(expected, actual);
    }


             /*
               @Test
                public void nullaryConstructorTest() {
                    PhoneBook phoneBook = new PhoneBook();

                    Assert.assertTrue(phoneBook.getMap() instanceof HashMap);
                }
              */




}
