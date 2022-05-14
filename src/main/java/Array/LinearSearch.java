//Linear Search//
/*
Let's assume we have an array 1-10 and will find out the number of last index which is in 9.
[1,2,3,4,5,6,7,8,8,9,10]
*/
//Binary Search//
/*
Let's assume have an array 1-10 and will find out the number of last index which is in 9
because it is faster and pick up the array items from right partition instead of left 5 to onward
 and narrow down every steps or half...
[1,2,3,4,5,6,7,8,8,9,10]
*/
package Array;

public class LinearSearch {

    public static int LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String a[]) {
        int [] a1 = {1,2,3,4,5,6,7,8,9,10};
        int key = 9;
        System.out.println(key+" is found at index: "+LinearSearch(a1, key));
    }
}
