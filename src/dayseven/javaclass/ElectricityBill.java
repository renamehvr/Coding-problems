package dayseven.javaclass;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        //For first 50 units Rs. 0.50/unit
///For next 100 units Rs. 0.75/unit
//For next 100 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
        // we can use switch case here for calculating bill or standard - - approach
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill=0;
        if(units <= 50) bill = (float) (units * 0.5);
        else if(units> 50 && units<=150) bill = 25.0 + (units-50)*0.75;
        else if(units > 150 && units<=250) bill=25.0 + 75.0 + (units-150)*1.2;
        else if(units > 250 ) bill=25.0 + 75.0 +120.0 + (units-250)*1.5;

        System.out.println(java.lang.Math.floor(bill*1.2));



    }
}
