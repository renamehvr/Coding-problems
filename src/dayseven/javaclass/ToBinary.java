package dayseven.javaclass;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        String a="";
        StringBuilder sb = new StringBuilder();
        while(A>0){
       //  a += A%2;
            sb.append(A%2);
         A=A/2;
        }
        System.out.println(sb.reverse());
        
    }
}

