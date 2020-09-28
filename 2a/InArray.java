import java.util.Scanner;

public class InArray {
   public static void main(String[] args) {
        int[] array = {124,634,4,2,12,214};
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        boolean isthere = false;
        for(int i = 0; i < array.length; i++) {
            if (input == array[i]) {
                isthere = true;
                System.out.println("Yes");
            }
        }
        if (!isthere) {
            System.out.println("No");
        }
   }
}
