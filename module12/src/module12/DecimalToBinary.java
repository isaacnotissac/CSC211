package module12;

public class DecimalToBinary {

    public static String decimalToBinaryRecursive(int n) {
        if (n == 0) {
            return "";
        }
        return decimalToBinaryRecursive(n / 2) + (n % 2);
    }
    public static String decimalToBinaryIterative(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        return binary.toString();
    }
}
