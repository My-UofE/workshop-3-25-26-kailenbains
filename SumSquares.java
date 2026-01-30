import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class SumSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        /*
        // Prompt for input
        System.out.print("Enter your name: ");

        // Read in line from standard input
        String name = in.nextLine();

        System.out.println("Hi " + name + "!");
        */

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        
        // Clear any remaining uncollected input
        in.nextLine();

        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);

        // Print sum of squares
        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");

        int total = 0;          // declare and initialise total
        int i = startNum;      // loop variable

        // While loop
        while (i <= endNum) {
            total = total + (i * i);
            i++;
        }

        System.out.println(total);  // print final sum
    }
}