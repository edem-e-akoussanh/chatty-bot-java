import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelDailyCost = scanner.nextInt();

        int totalFoodCost = foodCostPerDay * duration;
        int totalFlightCost = flightCost * 2;
        int totalHotelCost = hotelDailyCost * (duration - 1);

        System.out.print(totalFoodCost + totalFlightCost + totalHotelCost);
    }
}
