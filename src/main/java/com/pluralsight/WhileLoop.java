package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("while-Loop");

        int i = 0;
        while (i < 5) {
            System.out.println("I love Java");
            i++;
        }

        DoWhileLoop.main();
        ForLoop.main(args);
    }
}