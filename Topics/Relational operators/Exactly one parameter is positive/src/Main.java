import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        Boolean res1 = num1 > 0 || num2 > 0 || num3 > 0;
        Boolean res2 = num1 > 0 && num2 > 0;
        Boolean res3 = num1 > 0 && num3 > 0;
        Boolean res4 = num2 > 0 && num3 > 0;

        Boolean result = res1 && !(res2 || res3 || res4);

        System.out.print(result);
    }
}