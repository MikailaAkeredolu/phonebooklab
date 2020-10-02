package listandmapsdemo;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Person> people = new ArrayList();
        Person person1 = new Person("Corey");
        Person person2 = new Person("Super Negro");

        people.add(person1);
        people.add(person2);
        //HashMap<Integer, List<Person>> wuMembers = new HashMap<Integer, List<Person>>();
        Map<Integer, String> wuMembers = new HashMap<Integer, String>();
        wuMembers.put(1, "EvilG");
        wuMembers.put(2, "Corey");
        System.out.println(wuMembers.containsKey(people));


    Iterator<Map.Entry<Integer,String>> mapIterator = wuMembers.entrySet().iterator();
    while(mapIterator.hasNext()){
        System.out.println(mapIterator.next());
    }





//
//
//        for (String a: wuTangClan) {
//            System.out.println(a);
//        }







    }
}
