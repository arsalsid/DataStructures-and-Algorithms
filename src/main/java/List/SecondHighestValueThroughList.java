package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondHighestValueThroughList {

    public static void main(String[] args) {

        //Let takes sum variable
        int sum = 0;

        //Take a list and add values
        List<Integer> listValue = new ArrayList<Integer>();
        listValue.add(8);
        listValue.add(6);
        listValue.add(4);
        listValue.add(3);
        listValue.add(2);
        listValue.add(5);

        //use built-in function of collection sort
        Collections.sort(listValue);

        // //Take a loop for getting value of list size
        for(int i = 1; i<listValue.size(); i++) {

            //store value of array in sum variable
            sum = sum + listValue.get(i);
        }
        //print the value which stored in sum var getting from loop....
        System.out.println("ListValue : " + sum);
    }
}
