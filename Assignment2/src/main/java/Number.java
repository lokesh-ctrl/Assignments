class Number {
    public static String isPrime(int number) {
        boolean isPrime = true;
        if (number<=0){
            throw new IllegalArgumentException("Number must be positive");
        }
        if (number == 1 || number == 2) {
            return "PRIME";
        }
        for (int iterator = number-1; iterator >= number / 2; iterator--) {
            if (number % iterator == 0) {
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
