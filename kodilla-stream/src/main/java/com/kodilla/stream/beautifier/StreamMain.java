package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.*;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Use Beautifier text:");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Some example text.", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Some example text.", (text) -> toUpperCase(text));
        poemBeautifier.beautify("SOME TEXT TO lower", (text) -> toLowerCase(text));
        poemBeautifier.beautify("   Somple text.    ", (text) -> trim(text));

    }
}
