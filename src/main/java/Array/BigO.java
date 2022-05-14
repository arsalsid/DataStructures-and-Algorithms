///-------Data Structures and Explanation-------///

//Array is used to add and remove items and it has fixed length
//LinkList if we have large kind of data so we use LinkList DS but accessing LL elements by index is slow.
//So, We have to learN BigO notations to evaluate how BigO can improve our performance of code
//Explanation of BigO what is this and why is it important for improving runtime complexity??
//O(n) Linear Curve grows as same rate
//O(log n) LogArithmetic curve slows down at some point so an algo that runs more
// scalable and efficient as compared to linear and quadratic....

package Array;
public class BigO {

    public void log(int[] numbers, String[] names) {
        //O(n +  n)
        System.out.println(); // 0(1)

      /* for(int i =0; i < numbers.length(); i++)
       System.out.println(numbers[i]);
*/
        for (int number : numbers) //O(n)
            System.out.println(number);

        for (int number : numbers) //O(n)
            System.out.println(number);

        for (String name : names) // O(m)
            System.out.println(name);

        System.out.println(); //O(1)

        // O(n ^ 2)
        //O(n ^ 3)
        for(int number : numbers) // O(n)
            System.out.println(number);

        for(int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                for (int third : numbers) // O(n)
                System.out.println(first + ", " +second);
    }


}
