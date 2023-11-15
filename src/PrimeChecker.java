import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập một số nguyên (nhập 0 để thoát): ");
            int numberToCheck = scanner.nextInt();

            if (numberToCheck == 0) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            if (isPrime(numberToCheck)) {
                System.out.println(numberToCheck + " là số nguyên tố.");
            } else {
                System.out.println(numberToCheck + " không là số nguyên tố.");
            }
        }

        // Đóng Scanner sau khi sử dụng để tránh rò rỉ tài nguyên
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Số 1 và số âm không phải là số nguyên tố
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Nếu số chia hết cho một số nằm trong khoảng từ 2 đến căn bậc hai của nó, thì không phải số nguyên tố
            }
        }

        return true; // Nếu không chia hết cho bất kỳ số nào, thì là số nguyên tố
    }
}
