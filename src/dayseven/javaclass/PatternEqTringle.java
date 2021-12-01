package dayseven.javaclass;

import java.util.Scanner;

public class PatternEqTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();

        for(int i=0 ; i<N ; i++){
         //   System.out.println("value of i and N are -"+i+"  "+N);
            for(int j=0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();System.out.println("********2nd pattern***********");
     /*  patter 2 starts from here taking same N values
        patter 2 starts from here taking same N values
        eg N=4
        1
        1 2
        1 2 3
        1 2 3 4
        */

        for(int i=1 ; i<=N ; i++){
            for(int j=1 ; j<=i ; j++){
                if (j==i){
                    System.out.print(j);
                    break;
                }
                else {
                    System.out.print(j);
                    System.out.print(" ");
                }
            }
           System.out.println();
    }
 /*  patter 3 starts from here taking same N values
        patter 3 starts from here taking same N values
        eg N=4
1 2 3 4
1 2 3
1 2
1
        */
        System.out.println();System.out.println("********3rd pattern***********");

        for( int i=N ; i>0 ; i--){
            for(int j=1 ; j<=i ;j++){
                if (j==i){
                    System.out.print(j);
                    //  break;
                }
                else {
                    System.out.print(j);
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println();System.out.println("********4th pattern  - Full Numeric Pyramid ***********");
}}
