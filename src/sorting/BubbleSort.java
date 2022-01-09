package sorting;

public class BubbleSort {
    public  static void sort(int[] A){
        int n=A.length;
        int tmp=0;
        boolean noSwapFlag;
        for (int i = 0; i < n ; i++) {
            noSwapFlag=true;
            for (int j = 0; j < n-i-1; j++) {
              /*  if (A[j] > A[j + 1]) {
                    noSwapFlag=false;
                    tmp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = tmp; }
            }*/
                if (A[j] < A[j + 1]) {
                    noSwapFlag=false;
                    tmp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = tmp; }
            }
            //if no swap happen then we can break loop there to optimise the solution
            if(noSwapFlag==true){
                break;
            }
            System.out.println("current array after "+(i+1)+"th iteration");
            for (int a: A) {
                System.out.print(a+" ");
            }
            System.out.println();
        }}
    public static void main(String[] args) {
      //  int[] A = new int[5,3,1,9,4]
        int[] A = {5,3,1,9,4,12,2,19,31,7,0,6,241};
sort(A);
    }
}
