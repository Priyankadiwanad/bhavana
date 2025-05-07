package mehe.priya;

public class App {
    // Recursive implementation
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    // Iterative implementation
    public static int gcdIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 56, num2 = 98;
        System.out.println("GCD (Recursive) of " + num1 + " and " + num2 + " is: " + gcdRecursive(num1, num2));
        System.out.println("GCD (Iterative) of " + num1 + " and " + num2 + " is: " + gcdIterative(num1, num2));
    }
}