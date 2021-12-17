package arrayproblems;

import java.util.Scanner;

/*
* First line is N which means number of elements.
Second line contains N space separated integers.
Third line is X position which has to be deleted.
*
Input 1:
5
2 3 1 4 2
3
*
Output 1:
2 3 4 2
* */
public class RemoveThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int X = sc.nextInt();    //X is postion number where we need to do deletions so that is no libarary functions
        System.out.println("value of x "+X+" and value at X is "+A[X-1]);
        for(int i=0 ; i <= N-2 ;i++){
           // System.out.println("inside");
            if(i >= X - 1){
                A[i]=A[i+1];
            //    System.out.println("inside");
            }
        }
        //printing output or modified after deleting
        for (int i = 0; i < N-1; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
