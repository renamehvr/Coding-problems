package arrayproblems;

public class LargestSumContiguousSubarray {

    public static void main(String[] args) {
        int[] input= {1 , -1, 2, -1 ,5};
        int maxSum=0;
        for (int i = 0; i < input.length; i++) {
        if(maxSum<input[i]){
            maxSum=input[i];
        }
        if(i== input.length-1){
            break;
        }
        else {
            int tempSum=input[i];
            for (int j = i+1; j < input.length ; j++) {
                tempSum+=input[j];

                if (maxSum<tempSum){
                    maxSum=tempSum;
                }
            }
        }
        }
        System.out.println(maxSum);
    }
}
