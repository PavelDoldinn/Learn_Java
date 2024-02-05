package florithms;

public class Factorial {

    public static void main(String[] args) {



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













