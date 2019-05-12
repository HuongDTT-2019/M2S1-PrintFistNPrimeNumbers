public class printNPrimeNumbers {
    static void printIsPrime(int n) {
        int number = 2;
        int primeCount = 0;
        while (primeCount < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                primeCount++;
            }
            number++;
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 20;
        printIsPrime(n);
    }
}
