package dayseven.javaclass;

public class TwoDArray {
    public static void prind2darray(int [][] arr){
        int row = arr.length;
        int col=arr[0].length;

        for (int c=0 ; c<col ; c++){
            if(c%2==0){
            for (int r=0; r<row ; r++){
                System.out.print(arr[r][c]+" ");
            }
                System.out.println();
            }
            else {
                for (int r=row-1; r>=0 ; r--){
                    System.out.print(arr[r][c]+" ");
                }
                System.out.println();
            }
        }
     }
    public static void main(String[] args) {
        int[][] demo2d = { { 1, 2, 3 }, { 4, 5, 6 } , {7,8,9}  , {10,11,12}};
        prind2darray(demo2d);
    }
}



/*

        for(int i=0 ; i<arr.length ; i++){

        for(int j=0 ; j<arr[i].length ; j++){
        System.out.println(arr[j][i]);}

        if(j%2==0){ {
        for(int j=arr[i].length-1 ; j>=0 ; j--){
        System.out.println(arr[j][i]);
        }
        }
        //if(i < arr.length) i=i+1
        }
        }*/
