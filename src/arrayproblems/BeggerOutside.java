package arrayproblems;

import java.util.ArrayList;

class BeggarOutside {

    public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
//input or size of begger's pot's array it will hold current status of begger's sum
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = A-1; i >=0 ; i--) {
                res.add(0);
            }

        int first; int last; int amount;
        while(A>0){
            //pick array from input and divide them in parts substring + amount in this way
            for(int i=0 ; i<3 ; i++){
                first = B.get(i).get(0)-1;
                last =  B.get(i).get(1)-1;
                amount = B.get(i).get(2);
                for(int j=first ; j<=last ; j++){
                    //res.set(j)+=amount;
                    res.set(j, (res.get(j))+amount);
                }
                System.out.println(res.toString());
            }
            A--;
        }
        return res;
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
       // solve(5,A);
        System.out.println(solve(10,A).toString());
    }
}
