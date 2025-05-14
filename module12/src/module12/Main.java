package module12;

public class Main {
    public static void main(String[] args) {
        int fibNum = 10;
        int decimal = 25;

        // Fibonacci
        System.out.println("Fibonacci Recursive (" + fibNum + "): " + Fibonacci.fibonacciRecursive(fibNum));
        System.out.println("Fibonacci Iterative (" + fibNum + "): " + Fibonacci.fibonacciIterative(fibNum));

        // Decimal to Binary
        System.out.println("Decimal to Binary Recursive (" + decimal + "): " + 
            (decimal == 0 ? "0" : DecimalToBinary.decimalToBinaryRecursive(decimal)));
        System.out.println("Decimal to Binary Iterative (" + decimal + "): " + DecimalToBinary.decimalToBinaryIterative(decimal));
    }
}
