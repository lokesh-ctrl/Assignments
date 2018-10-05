public class PrimeNumber {
    public static String findPrime(int number) {
        boolean isPrime = true;
        if (number<=0){
            throw new IllegalArgumentException("Number must be positive");
        }
        if (number == 1 || number == 2) {
            return "PRIME";
        }
        for (int i = number-1; i >= number / 2; i--) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return "PRIME";
        } else {
            return "NOT PRIME";
        }
    }
}
