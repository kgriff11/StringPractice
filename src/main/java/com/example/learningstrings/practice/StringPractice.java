package com.example.learningstrings.practice;

public class StringPractice {

    public static void main(String args[]){
        String str = "Learn string handling";
        String allUpper = "LEARN STRING HANDLING";
        String subStr = "";

        boolean isEqualsTrue = false;
        boolean isEqualsIgnoreCaseTrue = false;

        //This will return the first char of the string
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(4);

        if(str.equals(allUpper)) {
            isEqualsTrue = true;
        }else {
            isEqualsTrue = false;
        }

        if(str.equalsIgnoreCase(allUpper)) {
            isEqualsIgnoreCaseTrue = true;
        }else {
            isEqualsIgnoreCaseTrue = false;
        }

        subStr = str.substring(0, 6).trim();

        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("Character at 1 index is: " + ch2);
        System.out.println("Character at 4 index is: " + ch3);

        System.out.println("Are str and allUpper equals- Ignore Case  : " + isEqualsIgnoreCaseTrue);
        System.out.println("Are str and allUpper equals  : " + isEqualsTrue);

        System.out.println("Original string: " + str + " - Substring :" + subStr);




        // 1) Using the string "Learn string handling": what index is the last letter in the string?


        // 2) Using the same string as above, what character is located at the 10th index?


        // 3)Do a check to see if the character at index 10 and 15 the same?


        // 4) Create a scenario that returns false if the character at the 0 index equals the 5 index

        //length()
        //equals()
        //equalsIgnoreCase()
        //charAt()
        //contains()
        //substring()
        //startsWith
        //endsWith
        //toLowerCase()
        //toUpperCase()
    }
}