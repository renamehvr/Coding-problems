package arrayproblems;

public class MobilePhones {
    public static int[] solve(int[] A, int[] B) {
        int N = A.length;
        int Q=  B.length;
        int[] result = new int[Q];
        int[] prefixSum = new int[N];
        prefixSum[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i]= prefixSum[i-1]+A[i];
        }

        System.out.println("prefix sum array of prices of mobiles");
        for (int x: prefixSum) {
            System.out.print(x+" ");
        }
        System.out.println();

        for(int i=0 ; i<Q ; i++){    //Money
           // count=0;
           result[i]= binarySearch(prefixSum , B[i]); }
    return  result;
    }

    private static int binarySearch(int[] prefixSum, int i) {
        int s=0;
        int e=prefixSum.length-1;
        int mid=(s+e)/2;
        while (s<=e){
            mid=(s+e)/2;
            if (i == prefixSum[mid]){
                return mid+1;
            }
            else if (prefixSum[mid]<i){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return mid+1;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        int[] A = {23, 36, 58, 59};
        int[] B = {3, 207, 62, 654, 939, 680, 760};
        int[] results= new int[5];
        results = solve(A,B);
        System.out.println("*********ANSWER ARRAY is:*************");
        for (int x: results) {
            System.out.print(x+" ");
        }
    }
}


  /*  int[] result = new int[Q];
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
        return result;*/