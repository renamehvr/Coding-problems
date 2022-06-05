package arrayproblems;

public class LargestSumContiguousSubarray {

    public static void main(String[] args) {
        int[] A = {1 , 2 , 3, 4 ,-10};
        int maxSum=0;
        for (int i = 0; i < A.length; i++) {
        if(maxSum< A[i]){
            maxSum= A[i];
        }
        if(i== A.length-1){
            break;
        }
        else {
            int tempSum= A[i];
            for (int j = i+1; j < A.length ; j++) {
                tempSum+= A[j];
               maxSum= Math.max(maxSum,tempSum);
            }
        }
        }
        System.out.println(maxSum);
    }
}
