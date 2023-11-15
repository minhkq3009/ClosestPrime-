import java.util.Scanner;

public class ClosestPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên x: ");
        int x = scanner.nextInt();

        int closestPrime = findClosestPrime(x);

        if (closestPrime != -1) {
            System.out.println("Số nguyên tố nhỏ hơn và gần x nhất là: " + closestPrime);
        } else {
            System.out.println("Không có số nguyên tố nhỏ hơn và gần x nhất.");
        }

        scanner.close();
    }

    public static int findClosestPrime(int x) {
        for (int i = x - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1; 
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

