package com.qa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {


    public static int nums(int a, int b) {
        return a;
    }

    public String sentence(String a, String b) {
        return b;
    }

    public int BlackJack(int num1, int num2) {

        //int num1 = 9;
        // int num2 = 10;

        int diff1 = 21 - num1;
        int diff2 = 21 - num2;

        if (num1 > 21 & num2 >21) {
            return 0;}

        else if (num1 < 0 & num2 < 0) {
           return 0;}

        // else {System.out.println("carry on");}

        if (diff1 > diff2) {
            return num2;
        } else if (diff2 > diff1) {
            return num1;
        } else {
            return 0;
        }

    }
}
 //   public static void main( String[] args ) {

  //      }



