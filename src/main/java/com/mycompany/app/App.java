package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private static String message = "Hello World!";

    public App() {
    // Comment
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
