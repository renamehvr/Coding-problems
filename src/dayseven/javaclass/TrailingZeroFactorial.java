package dayseven.javaclass;

public class TrailingZeroFactorial {

    public static void main(String[] args) {
        System.out.println(solve(25));
    }

    private static int solve(int current) {
        int count = 0;
        int temp = 0;
        while (current > 1) {
            temp = current;
            while (temp % 5 == 0) {
                count++;
                temp /= 5;
            }

            if (current % 5 == 0)  current -= 5;
            else current--;
        }
        return count;
    }
}

