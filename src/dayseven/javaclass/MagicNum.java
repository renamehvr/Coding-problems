package dayseven.javaclass;

public class MagicNum {
    public static  int solve(int A) {
        String str = Integer.toBinaryString(A);
        int sum=0;
        int n= str.length();
        //  System.out.println("str "+str+" : lenth "+str.substring(n-1));

        for(int i=1 ; i<= n ; i++){
           // System.out.println(str.charAt(n-i));
            if((str.charAt(n-i))=='1'){
                sum = sum + (int)Math.pow(5,i);
              //  System.out.println("sum "+sum);
            }
        }
        return sum;

    }

    public static void main(String[] args) {

        System.out.println(solve(2));
    }


/*    public int solve(int n) {
        int ans = 0, x = 1;
        while(n > 0) {
            x *= 5;
            if(n%2 == 1)    ans += x;
            n /= 2;
        }
        return ans;
    }*/
}
