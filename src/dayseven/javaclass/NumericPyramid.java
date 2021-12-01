package dayseven.javaclass;

public class NumericPyramid {
    public static void main(String[] args) {
        int N = 5;
        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = 2 * i - 1;          // for first row (i=1) max would be 2*1 +1 =3
            for (int j = 1; j < N - i + 1; j++) {
                System.out.print("0 ");
            }
            //System.out.print(max+" ");
            for (int x = 0; x < i; x++) {
                System.out.print(i + x + " ");
            }

            for (int x = max; x > i; x--) {

                System.out.print(x - 1 + " ");
            }
            for (int x=N+i-1 ; x < 2*N-1 ; x++){
                System.out.print("0 ");
            }
            System.out.println();
        }

        // else System.out.print("0 ");
    }}

