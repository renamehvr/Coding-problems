package string.problems;

/*
You are given a string A.
Find the number of indices where the reverse of the given string and the original string are different.
1 <= Length of String A <= 105
Return an integer denoting the number of indices where the reverse and the original string are different.
*/

import java.util.Scanner;

public class ChangeInReverse {
    public static int countRev(String A) {
//    String revA = reverse(A);
    int count=0;
        for (int i = 0; i < A.length() ; i++) {
            if (A.charAt(i)!=A.charAt(A.length()-1-i)){
                count+=1;
            }
        }

    return count;
    }

   /* private static String reverse(String a) {
        String result="";
        for (int i = a.length()-1; i >= 0 ; i--) {
          result=  result.concat(String.valueOf(a.charAt(i)));

        }
        return  result;
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  String tem= sc.next();
         String tem= "scaler";
        // countRev(tem);
        System.out.println(countRev(tem));
    }
}
