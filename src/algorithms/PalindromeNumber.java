package algorithms;

public class PalindromeNumber {

    public static void main(String[] args) {

        // Проверте Входящее чимло на полиндром
        // Есле число отрицательное перевернуть его

        System.out.println(palindromeNumber(010));;

    }

    public static boolean palindromeNumber(int number) {

        if (number < 0) {
            number = number * (-1);
            return palindrome(number);
        } else if (number == 0) {
            throw new RuntimeException("Число не может быть 0");
        } else {
            return palindrome(number);
        }
    }

    private static boolean palindrome(int number) {

        int copyNumber = number;
        int reversNumber = 0;

        while (copyNumber > 0) {
            reversNumber = reversNumber * 10 + copyNumber % 10;
            copyNumber = copyNumber / 10;
        }
        return reversNumber == number;
    }
}



