package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] A;
        A = new int[]{8, 16, 80, 32, 8, 38, 40, 65, 18, 1, 36, 44, 9, 85, 58, 59, 49, 20, 87, 60, 17, 11, 39, 6, 46, 26, 81, 92};

        System.out.println("current array ::");
        for (int a: A) {
            System.out.print(a+" ");
        }
        System.out.println();

        int N= A.length;
        int min;
        int min_index;
        for (int i = 0; i < N-1; i++) {
            min=A[i];
            min_index=i;
            for (int j = i+1; j < N ; j++) {
                if(min>A[j])
                    swap(A,min_index,j);
                min=A[min_index];
            }
            System.out.println("Array after "+i+"th pass ::");
            for (int j : A) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("sorted Array::");
        for (int j : A) {
            System.out.print(j);
            System.out.print(" ");
        }
    }
    public static void swap(int[] A , int min , int new_min){
        int temp;
        temp = A[min];
        A[min] = A[new_min];
        A[new_min] = temp;
    }
}

