package arrayproblems;

import java.util.ArrayList;

public class MatrixRotation {
    public static void solve(ArrayList<ArrayList<Integer>> A) {
    }

    public static void main(String[] args) {
        int[][] M = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = new int[3][3];
      // matrix = {{1,2,3},{4,5,6},{7,8,9}};
     //   ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
       // matrix.add(new ArrayList<Integer>().add());
       // System.out.println(solve(matrix));
        int row = M.length;
        int col=M[0].length;
        int temp = 0;
        int k=-1;
        for (int i=col-1; i>=0;i--){
            k++;
            for(int j=0 ; j<row ; j++){
               res[j][i] =  M[k][j];
            }
        }

        for (int [] r : res)
        {
            // traverses through number of rows
            for (int element : r)
            {
                // 'element' has current element of row index
                System.out.print( element  + "\t");
            }
            System.out.println();
        }


    }
}
