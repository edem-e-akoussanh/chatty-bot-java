import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int desk1 = (num1/2) + (num1 % 2);
        int desk2 = (num2/2) + (num2 % 2);
        int desk3 = (num3/2) + (num3 % 2);

        System.out.print(desk1 + desk2 + desk3);
    }
}