package controlStatements.forLoopDemo;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 51;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not a prime");
    }
}
