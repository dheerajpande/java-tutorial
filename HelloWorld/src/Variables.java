import java.util.Arrays;
public class Variables {
    public static void printInteger() {
        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public static void printIntArray() {
        // initialize array
        int[] rollNumbers = {6, 9, 3, 4};
        System.out.println(Arrays.toString(rollNumbers));

        // sort Array
        Arrays.sort(rollNumbers);
        System.out.println(Arrays.toString(rollNumbers));

        // Array initializing with new
        int[] ticketNumbers = new int[]{9, 5, 1};
        System.out.println(Arrays.toString(ticketNumbers));
    }

    public static void printString() {
        String name = "Roy";
        System.out.println(name);
    }
}
