package List;

import java.util.Scanner;

public class YearAndCentury {

    public static void main(String[] args) {
        int leapYear = 1996;
        boolean leap = false;

        if(leapYear % 4 == 0){

        }
        if (leapYear% 100 == 0){

            if(leapYear % 400 == 0){
                leap = true;
            }
            else {
                leap = false;
            }
        }
    }
}
