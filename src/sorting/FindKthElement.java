package sorting;

public class FindKthElement {
    public static void main(String[] args) {
        int[] A = {5,3,1,9,4,12,2,19,31,7,0,6,241};
        find(A,6);
    }

    private static void find(int[] A, int B) {
        int n=A.length;
        int p=B;
        int tmp=0;
        int swapcount=0;
        for (int i = 0; i < n ; i++) {
            B--;
            for (int j = 1; j < n-i; j++) {

                if(A[j-1] < A[j]){
                    tmp = A[j];
                    A[j] = A[j-1];
                    A[j-1] =tmp;
                    swapcount++;
                }
            }
            if (B==0) {
                System.out.println("smallest "+p+"th number is "+A[n-p]);
                System.out.println("total swaps ="+swapcount);
            }
        }
        for (int x: A) {
            System.out.print(x+" ");
        }
      //   System.out.println("total swaps ="+swapcount);
    }
}
