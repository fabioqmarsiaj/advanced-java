package com.fabioqmarsiaj.advancedjava.collections.linkedlists;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // * LinkedList are faster to add/remove elements in the middle than an ArrayList, but they are heavier
        // * since each element stores a reference to the previous and next element of the List.
        // * ArrayLists are faster to get elements than LinkedList
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        // I can add an element in the middle of the LinkedList
        myList.add(1,"C");
    }
}
