package dayseven.javaclass;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
       /* int N=12345;
        String numLength = Integer.toString(N);
        System.out.println(numLength);
    //    System.out.println(numLength.charAt(1));
        System.out.println(numLength.length());
        //Long.toString()*/
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long N =0L;
        while (T>0){
                N = sc.nextLong();
                System.out.println((Long.toString(N)).length());
                T--;
            }
    }
        }

