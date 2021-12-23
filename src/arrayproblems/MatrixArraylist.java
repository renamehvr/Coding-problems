package arrayproblems;

import java.util.ArrayList;

public class MatrixArraylist {
    public static void solve(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col= A.get(0).size();
        // System.out.print(col+"  "+row);
        ArrayList<ArrayList<Integer>> A2 = new ArrayList<ArrayList<Integer>>();
        //  int k=-1;
        //   for (int i=col-1; i>=0;i--){
        for(int j=0 ; j<row ; j++){
            //k++;
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int i=col-1; i>=0;i--){
                //  System.out.print(A.get(i).get(j));
                temp.add(A.get(i).get(j));
            }
            // System.out.println(temp.toString());
            A2.add(temp);
        }
        // return A2;
        // System.out.println((A2.get(0)).get(0)+" "+A2.get(1));
        //  System.out.print("[");
        for(int i=0; i < row ; i++){
          ///  for(int j=0 ; j < col ; j++){
                System.out.println(A2.get(i));
            //}
            //  System.out.print("]");
            // System.out.print("*"+A2.get(i));
        }
    }

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


}
