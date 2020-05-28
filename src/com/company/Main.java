package com.company;

public class Main {

    public static void main(String[] args) {
	/*byte date = 27;
	System.out.println("Today is " + date + " May");
	short year = 2020;
	System.out.println("Today is " + year + " year");
	int distance  = 103030;
	System.out.println("Distance between Kyiv and Zhytomyr is " + distance + " km2");
	long area = 10_303_000_00;
	System.out.println("Area of Europe is " + area + " km2");
	float weight = 55.5f;
	System.out.println("My weight is " + weight);
	double Pi = 3.14;
	System.out.println("The Pi number is appr equal to " + Pi);
	boolean m = true;
	System.out.println(m);

        for (int i = 0; i <= 10; i++) {
            System.out.println("sin(" + i + ") = " + Math.sin(i));
        }


        String[] words = new String[10];
        words[0] = "Hello";
        words[1] = "world";
        words[2] = "mama";
        words[3] = "Spring";
        words[4] = "frame" ;
        words[5] = "Show";
        words[6] = "must";
        words[7] = "go";
        words[8] = "on";
        words[9] = "Queen";

        for (int i = 0; i < words.length; i++) {
            if (   words[i].contains("a") && words[i].contains("m") && words[i].length() > 4)  {
                System.out.println(i + "." + words[i] + " - " + words[i].length() + " letters ");
            }
        }
        */
      //  String word = "ABBA";
        String word = "А в Енесее - сенева";
        word = word.toLowerCase(); // всі малі
        word = word.replaceAll(" ","");
        word = word.replaceAll("-","");

        String template = "";

        for (int i = 0; i < word.length(); i++) {
            int index = word.length() - i -1;
            template +=  word.charAt(index);
        }

        String [] palindroms = new String [5];

        System.out.println(template);

        if (word.equals(template)){
            System.out.println("polindrom");
        } else {
            System.out.println ("not polindrom");
        }
    }}
