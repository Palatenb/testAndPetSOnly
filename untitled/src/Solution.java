import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.
     */


    public int solution(int number) {
        int x = 0;
        int sum = 0;
        while (x != number) {
            if (x % 3 == 0 || x % 5 == 0) {
                sum += x;
            }
            x++;
        }
        return sum;
    }

    public static boolean validatePin(String pin) {

        if(pin.length()==4 || pin.length()==6){
            try {return Integer.parseInt(pin.replace("+", "")) >= 0;}
            catch (Exception e){return false;}
        }
        return false;
    }
}
