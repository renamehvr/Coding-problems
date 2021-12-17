package recursion.function;

import java.util.ArrayList;


class Solution {

    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList res = new ArrayList<ArrayList<Integer>>();
        long temp=0l;
//ArrayList line = new ArrayList<Integer>();
        for(int i=0 ; i < A ; i++){
            ArrayList line = new ArrayList<Integer>();
            temp=0;
            for(int j=0 ; j <A ; j++ ){
//System.out.print(j);
                if(i==0 ){
                    if(j==0)
                        line.add(1);
                    else  line.add(0);
                }
                else {
                    //for(int k=0;k<i;k++){
                    if(i>=j){
                        temp =(int) combination(i,j);
                        line.add(temp);
                    }

                    else {temp=0; line.add(temp);}
//System.out.print(temp);

                }
            }
            res.add(line);
//276 2024 10626 42504 134596 346104 735471 1307504 1961256 2496144
// //2704156 2496144 1961256 1307504 735471 346104 134596 42504 10626 2024 276 24 1 ]
        }
//System.out.println(combination(13,1));
///System.out.println(factorial(13));
//System.out.println(factorial(1));
//System.out.println(factorial(12));
        return res;

    }
    public static void main(String[] args) {
        System.out.println(solve(25));

    }
    public static double factorial(long n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static double combination(long n, long r){
        if(r==0) return 1;
        else if(r==1 || n-r==1) return n;
        else if(r==n) return 1;
        long rem = n-r;
        return factorial(n)/(factorial(rem)*factorial(r));
    }
}

