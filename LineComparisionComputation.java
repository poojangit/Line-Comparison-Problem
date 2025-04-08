import java.util.Scanner;

public class LineComparisionComputation {
    // Main method
    public static void main(String[] args) {
        // Displaying a welcome message
        System.out.println("Welcome to Line Comparison Computation");
        Scanner sc = new Scanner(System.in);
        // taking the user input for length 1
        System.out.println("Enter x1 coordinate : ");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 coordinate: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y1 coordinate : ");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 coordinate : ");
        int y2 = sc.nextInt();

        // taking the user input for length 2
        System.out.println("Enter a1 coordinate: ");
        int a1 = sc.nextInt();
        System.out.println("Enter a2 coordinate: ");
        int a2 = sc.nextInt();
        System.out.println("Enter b1 coordinate: ");
        int b1 = sc.nextInt();
        System.out.println("Enter b2 coordinate: ");
        int b2 = sc.nextInt();

        // calculating the lengths
        Double lengthOfaLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        Double lengthOfaLine2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("The length of a line 1 : " + lengthOfaLine1);
        System.out.println("The length of line 2 : " + lengthOfaLine2);
        // compare the two lengths using the equals method
        if (lengthOfaLine1.equals(lengthOfaLine2)) {
            System.out.println("The given to lengths are equal");
        } else
            System.out.println("Not equal");

        // Using Java compareTo method to compare 2 Lengths ispreferable.
        int comparisonResult = lengthOfaLine1.compareTo(lengthOfaLine2);
        System.out.println(comparisonResult);
        if (comparisonResult == 0) {
            System.out.println("Two lines are equal and results 0");
        } else if (comparisonResult > 0) {
            System.out.println("The line 1 is greater than the line 2");
        } else {
            System.out.println("The line 1 is shorter than the line 2");
        }

        sc.close();
    }

}
