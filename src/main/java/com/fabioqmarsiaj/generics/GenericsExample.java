package com.fabioqmarsiaj.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        // Wihtout generics
        List names = new ArrayList<>();
        names.add("Fabio");

        // I can only assign it to a variable if I cast it to a STRING.
        String name = (String) names.get(0);
        System.out.println(name);

        //With generics
        List<String> names2 = new ArrayList<>();
        names2.add("Fabio");
        String name2 = names2.get(0);
        System.out.println(name2);
    }
}
