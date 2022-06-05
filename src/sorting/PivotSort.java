package sorting;

/*
in this sorting we are selecting A[0] as pivot element and sort array according to it
end result will be all the element greater than pivor/A[0] will be on right side of it
and element <= A[0] will be on left side of pivot
so ultimately pivot element will be at right position

approach=
2 pointers approach
we are doing it with below constraints
TC :: O(N)
SC :: O(1)

 */
public class PivotSort {
    public static void main(String[] args) {
        int[] A= new int[]{10,2,5,12,14,3,1,11,6,14,7,15,21};

        //{10,2,5,12,14,3,1,11,6,14,7,15,10} case 1: duplicate element same as pivote element

        int left=1;
        int right=A.length-1;
        int temp;

        while (left<right){
            // checking left side or array
            if (A[0]>=A[left]){
                left++;
            }

            if (A[0]<A[right]){
                right--;
            }
            else{
                temp=A[right];
                A[right] =A[left];
                A[left] = temp;
                right--;
                left++;
            }
        }
        //once right and left pointer crosses each other we need to place A[0] to its right position
        //A[0].....right,left.....  => this is current scene we are swapping (A[0],A[right])
        temp=A[right];
        A[right] = A[0];
        A[0] = temp;

        //Printing array
        System.out.println("sorted array with reference to pivot element "+A[0]);
        for (int x: A) {
            System.out.print(x+" ");
        }
    }
}
