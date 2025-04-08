import java.util.Scanner;

public class LineComparisionComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 coordinate : ");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 coordinate: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y1 coordinate : ");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 coordinate : ");
        int y2 = sc.nextInt();
        double lengthOfaLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The length of a line : " + lengthOfaLine);
        sc.close();
    }
}
