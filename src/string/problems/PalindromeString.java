package string.problems;

import java.util.Scanner;

public class PalindromeString {
    public static String reverse(String str){
       /* if(str.length()==1){
           return str;
        }
        */
        if(str.length()==2){
            return "" + str.charAt(1) + str.charAt(0);
            // return str.substring(1)+str.charAt(0);
        }
        String temp = str.substring(str.length()-1);
        return str.substring(str.length()-1) + reverse(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
       // System.out.println(reverse("abcdefgh"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String temp;
        while(T>0){
            temp = sc.nextLine();
            if(temp.equals(reverse(temp))){
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
            T--;
        }
    }

}
