package dayseven.javaclass;
/*

Write a program to input T numbers(N) from user and find reverse of the given number.
        Reverse(101)=101
        Reverse(105)=501
        Reverse(100)=001=1
*/
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long N , temp= 0L;
        while(T>0){
            String result="";
            N=sc.nextLong();
            while(N>0){
                temp = N%10;
                N/=10;
                if(result=="" && temp==0) continue;             //result=""
                else result=result+temp;
            }
            System.out.println(result);
            T--;
        }
    }
}
