package dayseven.javaclass;


public class recursionDemo {

    public static int increment(int n )
    { int count =0;
        int sum=0;
        if( n ==0 ){
       return 0;
        }
        if (n==1) return 1;
       // sum+=sum+
    //    System.out.println(sum);
        return   increment(n-1) + increment(n-2);
       // System.out.println(sum);

    }

    public static void main(String[] args) {
        //increment(5);
        for(int x=0 ; x <= 5 ; x++){
            System.out.println(increment(x));
        }
    }
}
