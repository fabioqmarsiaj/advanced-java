package com.fabioqmarsiaj.advancedjava.functionalProgramming.oldway;

public class FunctionalExample {
    public static void main(String[] args) {

        /*
            ! This is known as Anonymous Inner Class
            ! Lambdas were introduced to improve this messy code
         */
        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hi, " + name);
            }
        };
        greetingMessage.greet("Fabio");

        /*
            ! Allows java to pass code as DATA
            ! Which means 'to treat functionality as method argument'
         */
        GreetingMessage greetingMessage2 = name -> System.out.println(name);
        greetingMessage2.greet("Teste");

        MessagePrinter messagePrinter = () -> System.out.println("Printing a message");
        messagePrinter.print();

    }
}
