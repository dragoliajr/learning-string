package com.example.learningstring.practice;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Learn String Handling";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(5);
        char ch4 = str.charAt(str.length()-1);
        char ch5 = str.charAt(10);
        char ch6 = str.charAt(15);
        System.out.println("Character at 0 index is : " + ch1);
        System.out.println("Character at 1 index is : " + ch2);
        System.out.println("Character at 4 index is : " + ch3);
        System.out.println("Character at last index is : " + ch4); //question 1
        // 1) Using the string "Learn string handling": what index is the last letter in the string?
        System.out.println("the last index is "+ (str.length()-1));
        // 2) Using the same string as above, what character is located at the 10th index?
        System.out.println("Character at the 10th index is: " + ch5);
        // 3)Do a check to see if the character at index 10 and 15 the same?
        System.out.println(ch5 == ch6);
        // 4) Create a scenario that returns false if the character at the 0 index equals the 5 index
        System.out.println(ch1 == ch3);

    }
}








