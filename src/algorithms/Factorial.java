package algorithms;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(getFactorial(15));

    }
    public static long getFactorial(int n) {

        if (n == 0 || n == 1) {
            return n;
        } else if (n < 0) {
            n = n * (-1);
            return factorial(n);
        } else {
            return factorial(n);
        }
    }
    public static long factorial(int n) {

        long fct = 1;
        for (int i = 1; i <= n ; i++) {
            fct = fct * i;
        }
        return fct;
    }

}
