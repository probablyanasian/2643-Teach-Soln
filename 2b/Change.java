import java.util.Scanner;

public class Change {
   public static void main(String[] args) {
        final double price = 5.15;
        Scanner scan = new Scanner(System.in);

        double change = (scan.nextDouble()*100-price*100);  // 2.30 -> 230
        System.out.println(change);
        
        int dollars = (int)change/100;  // 2
        change -= dollars*100; // 30
        System.out.printf("Dollars: %d\n", dollars);

        int quarters = (int)change/25;  
        change -= quarters*25;
        System.out.printf("Quarters: %d\n", quarters);

        int dimes = (int)change/10;
        change -= dimes*10;
        System.out.printf("Dimes: %d\n", dimes);

        int nickels = (int)change/5;
        change -= nickels*5;
        System.out.printf("Nickels: %d\n", nickels);

        System.out.printf("Pennies: %.0f\n", change);
   }

   public static void alternative(String[] args) {
      final double price = 5.15;
      Scanner scan = new Scanner(System.in);

      double change = (scan.nextDouble()*100-price*100);  // 2.30 -> 230
      System.out.println(change);
   }
}