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

        // Creating Points and Lines
        Point startPointLine1 = new Point(x1, y1);
        Point endPointLine1 = new Point(x2, y2);
        Line line1 = new Line(startPointLine1, endPointLine1);

        Point startPointLine2 = new Point(a1, b1);
        Point endPointLine2 = new Point(a2, b2);
        Line line2 = new Line(startPointLine2, endPointLine2);

        // calculating the lengths
        Double lengthOfaLine1 = line1.calculateLength();
        Double lengthOfaLine2 = line2.calculateLength();
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
