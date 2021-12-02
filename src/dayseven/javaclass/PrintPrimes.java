package dayseven.javaclass;

//You are given an integer N you need to print all the Prime Numbers between 1 and N.
import java.lang.*;
import java.util.*;
public class PrintPrimes {

        public static void main(String[] args) {
         //   Scanner sc = new Scanner(System.in);
         //   int N = sc.nextInt();
            int N=13;

            for (int i =2 ; i<=N ; i++){
                if(prime(i)){
                    System.out.println(i);
                }
            }
        }
        public static boolean prime(int n){
            for (int x=2 ; x*x<=n ; x++){
                if(n%x==0){
                    return false;
                }
            }
            return true;
        }
    }

