import java.util.Scanner;

public class AverageSquares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt();
        in.nextLine(); // clear buffer

        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");

        double total = 0.0;
        int count = 0;
        int i = startNum;

        // do-while loop
        do {
            total = total + (i * i);
            count++;
            i++;
        } while (i <= endNum);

        double average = total / count;
        System.out.println(average);
    }
}