package recursion.function;

public class TowerOfHanoi {

    public static void main(String[] args) {
        toh(2,"A","C","B");
    }

    private static void toh(int n, String source, String destination, String helper ) {
        if(n==0) {
            return;
        }

        toh(n-1,source,helper,destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        toh(n-1,helper,destination,source);
    }
}
