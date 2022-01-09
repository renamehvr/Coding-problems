package dayseven.javaclass;

public class PerfectSquare {
    public static  int solve(int A) {
        int s=1;
        int e=A;
        int mid=(s+e)/2;
        boolean perfactSquareFlag=false;
        while(s<=e){
            mid=(s+e)/2;

            if(mid==A/mid) {
                return mid;
            }
            else if(mid>A/mid){
                e=mid-1; }
            else if(mid<A/mid) {
                s = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        System.out.println(solve(1065024));
    }
}


/* Binary search solution



        int s=1;
        int e=A;
        int mid=(s+e)/2;
        boolean perfactSquareFlag=false;
        while(s<=e){
           mid=(s+e)/2;

           if(mid*mid==A)
               return mid;
           else if(mid*mid>A)
               e=mid-1;
            else
                s=mid+1;
        }

     return -1;
 */


/*

Sqrn(N) solution

  for(int i=1 ; i <= A ; i++){
            if(i*i==A){
                return i;
            }
            else if(i*i>A){
                return -1;
            }
        }

 */