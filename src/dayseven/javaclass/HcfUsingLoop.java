package dayseven.javaclass;

import java.util.Scanner;

public class HcfUsingLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            int T= sc.nextInt();
            int temp=0;
            while(T>0){
                T--;
                int a= sc.nextInt();
                int b=sc.nextInt();
                if(a>b) {
                    temp = b;
                    b=a;
                    a = temp;
                }

                for (int i=a ; i>=1 ; i--){
                    if(b%i==0 && a%i==0){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
