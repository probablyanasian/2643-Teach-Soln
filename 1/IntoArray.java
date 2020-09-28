import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

class IntoArray {
    public static void main(String[] args) {
        int[] arr = new int[7];
    
        try {
            File openfile = new File("file.txt");
            Scanner scan = new Scanner(openfile);
            arr[0] = scan.nextInt();
            arr[1] = scan.nextInt();
            arr[2] = scan.nextInt();
            arr[3] = scan.nextInt();
            arr[4] = scan.nextInt();
            arr[5] = scan.nextInt();
            arr[6] = scan.nextInt();
            scan.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e); // You don't have to do this, just my habits.
        }

        System.out.print(Arrays.toString(arr));
      
    }
}