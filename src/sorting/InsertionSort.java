package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] A = new int[]{3,10,8,2,5,11,6};
        int temp;
        int index;
        for (int i = 1; i < A.length ; i++) {
            index=i;
            for (int j = i-1; j >=0 ; j--) {
                if (A[index]<A[j]){
                    temp=A[index];
                    A[index]=A[j];
                    A[j]=temp;
                    index--;
                }
                else break;
            }
        }

        System.out.println("sorted Array::");
        for (int j : A) {
            System.out.print(j);
            System.out.print(" ");
        }
    }
}
