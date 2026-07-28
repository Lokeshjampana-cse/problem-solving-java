import java.util.Arrays;

public class DigitSum {
    public static void main(String[] args) {
        int number = 123456;

        // Sum of EVEN digits: 2 + 4 + 6 = 12
        int evenSum = String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .filter(digit -> digit % 2 == 0)
                .sum();

        // Sum of ODD digits: 1 + 3 + 5 = 9
        int oddSum = String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .filter(digit -> digit % 2 != 0)
                .sum();

        System.out.println("Even digits sum: " + evenSum);
        System.out.println("Odd digits sum: " + oddSum);
    }
}