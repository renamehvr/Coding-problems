package dayseven.javaclass;

import javax.swing.*;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a =sc.nextLong();
        Long b =sc.nextLong();
        String s1 = "";
        int i=0;
        Long limit = b*2;
        Scanner scstr = new Scanner(System.in);
       // System.out.print("Enter a string: "+b+" times");
       // s1 = scstr.nextLine();
    String intArray[];
    intArray = new String[Math.toIntExact(limit)];
        while(b>0){
            s1= "";
            s1 = scstr.nextLine();
            String[] words=s1.split("\\s\\s");
            for ( String x : words){
                intArray[i]=x;
                i+=1;
            }
            b-=1;
        }
        System.out.println("Printing array");
        for(String x : intArray){
            System.out.println(x);
        }
        for(int j=0 ; j<intArray.length ; j++){
           // System.out.println(intArray[j]);
            if(intArray[j].equals("1")) {
               // System.out.println("check 1");
                a+=Long.parseLong(intArray[j + 1]);
                System.out.println(a);
                j=j+1;
            }
            else if(intArray[j].equals("2")){
                if(a > Long.parseLong(intArray[j + 1])){
                    a-=Long.parseLong(intArray[j + 1]);
                    System.out.println(a);
                    j=j+1;
                }
                else {System.out.println("Insufficient Funds"); j=j+1; continue;}

            }
            /*else System.out.println("check 2");
            j=j+1;*/
        }
    }
    //System.out.print(" first value "+ intArray);
}
