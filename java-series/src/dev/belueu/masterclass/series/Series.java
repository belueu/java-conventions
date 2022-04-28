package dev.belueu.masterclass.series;

public class Series {

    public static void nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.print(sum + ", ");
        }
    }

    public static void factorial(int n) {
        int result = 1;
        System.out.print(0 + ", ");
        for (int i = 1; i <= n; i++) {
            result = result * i;
            System.out.print(result + ", ");
        }
    }

    public static void fibonacci(int n) {
        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNumber + ", ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}
