package arrayproblems;

class Main
{
    // public class Solution {
    public static int[] solve(int[] A, int[] B) {
        int N = A.length;
        int Q=  B.length;
        int[] result = new int[Q];
        int count;
        for(int i=0 ; i<Q ; i++){    //Money
            count=0;
            for(int j=0 ; j<N ; j++){   //price of mobiles
                if(B[i]>A[j]){           //if Money available > price of current mobile price
                    B[i]-=A[j];         //update the remaining balance
                    count+=1;       //as we can buy A[j]th product so count increase
                }
            }
            result[i]=count;
        }
        return result;
    }
    //}
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] A = {3, 4, 4, 6}; int[] B = {20, 4, 10, 2};
        int[] results= new int[5];
        results = solve(A,B);
        for (int x: results) {
            System.out.print(x+" ");
        }
    }
}