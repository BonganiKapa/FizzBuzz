import java.util.Scanner;
import java.util.Arrays;

public class FizzBuzz {

    public static void main(String[] args) {

        int limit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit:");
        limit = scanner.nextInt();

        String [] arr = new String[limit];

        int begin = 1;

        for (int i = begin; i <= arr.length; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                arr[i - 1] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                arr[i - 1] = "Fizz";
            }
            else if (i % 5 == 0) {
                arr[i - 1] = "Buzz";
            }
            else {
                arr[i - 1] = String.valueOf(i);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
