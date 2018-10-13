public class FizzBuzz {
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int EXPECTED_REMAINDER=0;
    private static final String RETURNING_STRING_WHEN_MULTIPLIE_OF_3="Fizz";
    private static final String RETURNING_STRING_WHEN_MULTIPLE_OF_5 = "Buzz";
    private static final String RETURNING_STRING_WHEN_MULTIPLE_OF_3_AND_5 = "FizzBuzz";


    public static String returnfizzBuzz(int number) {
        if(number%THREE==EXPECTED_REMAINDER&&number%FIVE==EXPECTED_REMAINDER){
            return RETURNING_STRING_WHEN_MULTIPLE_OF_3_AND_5;
        }
        else if (number%THREE==EXPECTED_REMAINDER) {
            return RETURNING_STRING_WHEN_MULTIPLIE_OF_3;
        }
        else if (number%FIVE==EXPECTED_REMAINDER){
            return RETURNING_STRING_WHEN_MULTIPLE_OF_5;
        }
        return String.valueOf(number);
    }
}
