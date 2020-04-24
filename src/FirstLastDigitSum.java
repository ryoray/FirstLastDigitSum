public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int digit;

        while (number != 0) {
            digit = number / 10;
            if (digit == 0) {
                break;
            }
            number /= 10;
        }
        int sum = (number + lastDigit);
        return sum;
    }
}
