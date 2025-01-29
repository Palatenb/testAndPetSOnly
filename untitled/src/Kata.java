import java.util.Arrays;

public class Kata {

    public static String createPhoneNumber(int[] numbers) {
        if(numbers.length<9){return "Non a number!";}
        return "(" + numbers[0] + numbers [1] + numbers[2] + ") "
                + numbers[3] + numbers[4] + numbers[5] + "-" +numbers[6] +numbers[7]
                +numbers[8]+numbers[9];
    }
}
