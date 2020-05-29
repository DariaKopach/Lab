/*
 * Lab 1
 *
 * Version 1.0
 *
 * Copyright Kopach Daria KNTEU
 */

package com.company;

import jdk.internal.org.objectweb.asm.Handle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Nastya\\Desktop\\Harry.txt")));

        String cleanerText = text
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\"", "")
                .replaceAll("!", "")
                .replaceAll(";", "")
                .replaceAll(":", "")
                .replaceAll("\\?", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll("\\!", "")
                .replaceAll("\"", "")
                .replaceAll("-", "")
                .toLowerCase()
                ;

        //1.  Find the longest word in the above text.

        String words[] = text.split("[^a-zA-Z]");

        String longest = "";

        for (int k=0; k < words.length; k++) {
            if ( words[k].length() > longest.length() ) {
                longest = words[k];
            }
        }
        System.out.println("Longest word is" + longest);

        // 2. Count the lines where the word "Harry" is met.

        String word = "Harry";
        int Harry = 0;
        for (int j = 0; j < words.length; j++) {
            if (words[j].equals("Harry"))
                Harry ++;
        }
        System.out.println("The word " + word + " contains " + Harry + " times in the above book");

        // 3. Take array of distinct words from Harry Potter. Create an array of hashes.

        String distinсtString = " ";

        for (int j = 0; j < words.length; j++) {
            if (!distinсtString.contains(words[j])) {
                distinсtString += words[j] + " ";
            }
        }
        String[] distinctArray = distinсtString.split(" ");
        for (int j = 0; j < distinctArray.length; j++) {
            System.out.println(distinctArray[j].hashCode());
        }

       // 4. Count the intersections.

        int dictinct = 0;
        int dublicate = 0;
        String previous = "";
        String current = "";

        for (int i=0; i < words.length; i++) {
            current = words[i];
            if ( !previous.equals(current) ) {
                if ( dictinct > 1 ) {
                    dublicate++;
                }
                dictinct = 1;
                previous = current;
            } else {
                dictinct++;
            }
        }
        if ( dictinct > 1 ) {
            dublicate++;
        }
        System.out.println(dublicate + " is number of dublicated words");
    }

}