package string.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class pascalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int temp=0;
        //  int[][] arr = new int[][];
        ArrayList<ArrayList<Integer>> Alist = new ArrayList<ArrayList<Integer>>(T);
        for(int i=0 ; i<T ; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0 ; j<=i ; j++){
                if(i==0)
                {list.add(0,1);
                    break; }
                if(i==1) {list.add(0,1); list.add(1,1); break; }

                if(j==0 || j==i){
                    list.add(j,1);
                    continue;
                }
                temp = Alist.get(i-1).get(j)+Alist.get(i-1).get(j-1);
                list.add(j,temp);

            }
            Alist.add(list);
        }
        for (ArrayList<Integer> l : Alist){
            System.out.println(l);
        }

    }
}
