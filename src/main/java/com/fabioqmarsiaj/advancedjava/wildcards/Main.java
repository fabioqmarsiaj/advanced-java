package com.fabioqmarsiaj.advancedjava.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        // In both cases trying to pass Office and House to the printBuilding methods doesn't work:
        // Because generics won't apply to casting a list type to another
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        // Using wildcards we can cast list types because the parameter of the method sayd:
        // 'You can pass anything that extends the Building class'
        printBuildingsWithWildcards(offices);

        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildingsWithWildcards(offices);


        // In this case we can pass any parameter that is a super class of House
        // such as Building
        addHouseToList(houses);
        addHouseToList(buildings);
    }

    static void printBuildings(List<Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }

    static void printBuildingsWithWildcards(List<? extends Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }

    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }
}
