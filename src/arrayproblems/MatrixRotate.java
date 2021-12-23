package arrayproblems;

import java.util.ArrayList;

public class MatrixRotate {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        int k=1;
        for(int i=0; i < 3 ; i++){
            ArrayList<Integer> r =  new ArrayList<Integer>();
            for(int j=0 ; j < 3 ; j++){
                r.add(k);
                k++;
            }
            A.add(r);
        }
        for(int i=0; i < 3 ; i++)
            System.out.println(A.get(i).toString());
        System.out.println("**************************");
        solve(A);
    }

    private static void solve(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col= A.get(0).size();
        int k;
        for (int i = 0; i < row; i++) {
            k=0;
            for (int j = col-1; j >= 0 ; j--) {
                //A.get(i);
            //    System.out.print(A.get(i).get(j)+" ");


            }
            System.out.println();
        }

    }
}
