package com.fabioqmarsiaj.advancedjava.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodsExample {
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    public static List arrayToListWithoutGenerics(Object[] array, List<Object> list) {
        for (Object object : array) {
            list.add(object);
        }
        return list;
    }

    public static <T> List<T> arrayToListWithGenerics(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToListWithoutGenerics(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToListWithoutGenerics(boolArray, new ArrayList<>());

        //At compile time, WITHOUT generics, it doesn't know the type
        // so you could pass a boolArray to a intList
        List<Integer> intList = arrayToListWithoutGenerics(boolArray, new ArrayList<>());

        //At compile time, WITH generics, it does know the type
        // so you can't pass a boolArray to a intList
        List<Integer> intList2 = arrayToListWithGenerics(intArray, new ArrayList<>());
    }
}
