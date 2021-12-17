package dayseven.javaclass;

import java.util.Scanner;

public class EasyPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long result=1L;
       // Math.pow(A,B);   returns double
       // System.out.println((long) Math.pow(A,B));

        for(int i=1 ; i <=B ;i++){
            result*=A;
        }
        System.out.println(result);
    }
}
