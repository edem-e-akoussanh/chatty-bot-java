import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int num = scanner.nextInt();
        int nextEven = 0;
        int rem = num % 2;

        if (rem == 0) {
            nextEven = num + 2;
        } else {
            nextEven = num + rem;
        }

        System.out.print(nextEven);
    }
}
