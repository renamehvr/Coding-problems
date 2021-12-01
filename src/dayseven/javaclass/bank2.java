package dayseven.javaclass;

import java.util.Scanner;

public class bank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n =sc.nextLong();
        Long m =sc.nextLong();
        int a = 0;
        long b=0;
        while (m>0){
            a = sc.nextInt();
            b = sc.nextLong();
            if (a == 1) {
                n+=b;
                System.out.print(n);
            }
            else if(a == 2){
                if(a>n){
                    System.out.print("Insufficient Funds");
                }
                else{
                    n-=b;
                    System.out.print(n);
                }
            }
            m=m-1;
        }

    }
}
