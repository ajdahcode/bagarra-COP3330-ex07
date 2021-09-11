/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is the length of the room in feet? " );
        int length = scnN.nextInt();
        System.out.print( "What is the width of the room in feet? " );
        int width = scnN.nextInt();
        System.out.println( "You entered dimensions of "+ length +" feet by "+ width +" feet." );
        // double sqrdm = Math.round(((length*width) * 0.09290304)*100)/100;
        double sqrdm = (length*width) * 0.09290304;
        double temp = Math.round(sqrdm*1000);
        sqrdm = temp/1000;
        System.out.print( "The area is \n"+
                ""+ (length*width)+" square feet\n"+
                ""+ sqrdm +" square meters" );
    }
}
