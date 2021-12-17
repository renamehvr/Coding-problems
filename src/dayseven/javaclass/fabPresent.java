package dayseven.javaclass;

import java.util.Scanner;

public class fabPresent {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int curr=0; int prev1=0; int prev2=0;
        int T= sc.nextInt();
        while(T>0){
            int N= sc.nextInt();
            curr=1;prev1=1;prev2=0;
            T--;
            String flag="No";
            while(N==curr || N > curr || N==0){
                if(N==curr || N==0 || N==1){
                    flag="Yes";
                   // System.out.println(flag);
                    break;
                }

                else{prev2 = prev1;
                    prev1 = curr;
                    curr =prev2+prev1; }

            } System.out.println(flag);
        }
    }
}