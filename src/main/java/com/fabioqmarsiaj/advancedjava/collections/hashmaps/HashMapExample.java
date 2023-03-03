package com.fabioqmarsiaj.advancedjava.collections.hashmaps;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();
        /*
            * The data inside a HashMap are NOT ordered.
            ! HashMaps does not allow duplicated entries
            ! so in this case the entry 'Brenda' is overwritten

            * We can also assign null as an entry value
         */

        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123);
        phonebook.put("Brenda", 22222);
        phonebook.put(null, 000);
        if(phonebook.containsKey("Brenda")) {
            phonebook.remove("Brenda");
        }
        phonebook.clear();
        System.out.println(phonebook);
    }
}
