package algorithms;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(getFactorial2(5));

    }

    public static int getFactorial2(int n) {

        // Вычисление Факториала при помощи цикла for

        if (n <= 1) {
            return n;
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static int getFactorial1(int n) {

        // Рекурсивный метод вычисления Факториала

        if (n <= 1) {
            return n;
        } else {
            return n = n * getFactorial1(n - 1);
        }
    }
}













