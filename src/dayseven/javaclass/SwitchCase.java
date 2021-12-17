package dayseven.javaclass;


/*
You have to tell how many days are there in the month denoted by A in a non-leap year.

        Months are denoted as follows:

        January : 1
        February : 2
        March : 3
        April : 4
        May : 5
        June : 6
        July : 7
        August : 8
        September : 9
        October : 10
        November : 11
        December : 12
*/


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        switch (A){
            // case 1: case 3: case 5: case 7:
            case 1,3,5,7,8,10,12:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 4,6,9,11:
                System.out.println(30);
                break;
        }
    }
}
