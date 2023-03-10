package com.fabioqmarsiaj.advancedjava.functionalProgramming.oldway;

public class FunctionalExample {
    public static void main(String[] args) {

        // ! This is known as Anonymous Inner Class
        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hi, " + name);
            }
        };

        /* ! Allows java to pass code as DATA
         * Which mean 'to treat functionality as method argument'
         ! Lambdas were introduced to improve this messy code
         */
        greetingMessage.greet("Fabio");
    }
}
