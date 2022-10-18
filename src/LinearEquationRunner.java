import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        // Welcome the user and ask for coordinates
        System.out.println("Welcome to the Linear Equation Calculator!");
        System.out.print("Enter first coordinate: ");
        String coordinate1 = myScanner.nextLine();
        System.out.print("Enter second coordinate: ");
        String coordinate2 = myScanner.nextLine();

        int x1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf("(") + 1,coordinate1.indexOf(",")));
        int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(" ") + 1, coordinate1.indexOf(")")));
        int x2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf("(") + 1, coordinate2.indexOf(",")));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(" ") + 1, coordinate2.indexOf(")")));

        LinearEquation linear1 = new LinearEquation(x1, y1, x2, y2);
        System.out.println(linear1.lineInfo());














    }
}
