package arrayproblems;

public class ArraysDemo {
    public static void main(String[] args) {
        //declaration and initialization of array
        int arr[]={1,2,3,4,5};
        System.out.println(arr);
        //getting the class name of Java array
       Class c=arr.getClass();
        String name=c.getName();
//printing the class name of Java array
        System.out.println(name);
        System.out.println(arr.getClass().getName());

        //clone function
        int clonearray[] = arr.clone();
        System.out.println(clonearray);
        System.out.println(arr==clonearray);

        //length function of array
        System.out.println("lenght of array is :"+arr.length);

        //System.arraycopy functionn
        int[] copyTo = new int[5];
        for(int x: copyTo) System.out.print(x+" ");
        System.out.println(copyTo);
        System.arraycopy(arr, 2, copyTo, 0, 2);
        System.out.println(copyTo);
            for(int x: copyTo) System.out.print(x+" ");
        System.out.println();
        //srcPos is source array zero based index to start  ; destPos is destination array's index copying wll start from here
        //length is how much length of data we need to copy
        System.arraycopy(arr, 0, copyTo, 3, 2);
        for(int x: copyTo) System.out.print(x+" ");

     //   System.arraycopy(arr, 4, copyTo, 0, 4); error
        System.arraycopy(arr, 2, copyTo, 2, 3);
    //    for(int x: copyTo) System.out.print(x+" ");
        System.out.println();
        //clone array using .arraycopy method
        System.arraycopy(arr, 0, copyTo, 0, arr.length);
        for(int x: copyTo) System.out.print(x+" ");
    }
}
