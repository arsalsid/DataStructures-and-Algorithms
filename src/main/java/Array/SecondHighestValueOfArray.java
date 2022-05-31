package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighestValueOfArray {
    public static void main(String[] args) {

        //Declaration of Array
        int[] number = {2,4,6,7,8,3};

        //Let takes sum variable
        int sum = 0;

        //Use built-in function for sorting the values of array
        Arrays.sort(number);

        //Print the sorted array
        System.out.println("Value of Sorted Array[] :" + Arrays.toString(number));

        //Take a loop for getting value of array length
        for (int i = 1; i<number.length; i++){

            //store value of array in sum variable
            sum = sum + number[i];
        }

        //print the value which stored in sum var getting from loop....
        System.out.println("Test number:" + sum);

    }
}
