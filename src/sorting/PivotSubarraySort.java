package sorting;

/*
Given an Array of size N rearrange the subarray from [s to e] such that
All elements <= A[s]  Go to LEFT
in CS e left
All elements < A[s] Go to RIGHT

EXAMPLE::

INPUT A=        { 4 ,1,5,6,7,8,2,3,1,7}          [S,E]=[5,3]  = {5,6,7,8,2,3}
OUTPUT A=      { 4 ,1,2,3,5,6,7,8,1,7}

 */
public class PivotSubarraySort {
    public static void main(String[] args) {
        int[] A=new int[]{4 ,1,5,6,7,8,2,3,1,7};

    }

    //its same method that we have in pivotSort with additional contraint that is subarray
    public static int partition(int[] A,int s,int e){
// initializing left and right pointers
       int l,r,temp;
       l=s+1;
       r = e;
        while (l<r){
            // checking left side or array
            if (A[s]>=A[l]){
                l++;
            }

            if (A[s]<A[r]){
                r--;
            }
            else{
                temp=A[r];
                A[r] =A[l];
                A[l] = temp;
                r--;
                l++;
            }
        }
        temp=A[r];
        A[l] = A[s];
        A[s] = temp;
        return A[r];
    }
}
