package arrayproblems;

import java.util.Scanner;

public class InsertThat {
    public static void main(String[] args) {
        /*
        First line is N which means number of elements.
        Second line contains N space separated integers.
        Third line is X position where Y has to be inserted.
        Fourth line is Y which has to be inserted.

input -
5
2 3 1 4 2
3
5

output- 2 3 5 1 4 2       //5 is inserted without any replacement

        */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int X = sc.nextInt();    //X is postion number where we need to do insertions so that is basicallly index+1
        int Y = sc.nextInt();
        //A[X-1]=Y;

        // moving every integer to next index till we get index where we need to do insertions
        //using Array instead of arrayList<>();
        for (int i = N - 1; i >= 0; i--) {
            A[i + 1] = A[i];
            if (i == X - 1) {
                A[i] = Y;
                break;
            }
        }

        for (int i = 0; i < N + 1; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
