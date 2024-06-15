import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double length;
        double diagonal = 0;
        String trash = "Y";
        double area;
        double perimeter;
        String playAgain = "";

        do {
            //Getting a valid width for the rectangle
            do {
                do {
                    System.out.println("Input the width of the rectangle: ");
                    if (in.hasNextDouble()) {
                        width = in.nextDouble();
                        if (width > 0) {
                            trash = "N";
                            in.nextLine();
                        } else {
                            System.out.println("The width can't be " + width + ". It has the be positive. Try again.");
                        }
                    } else {
                        System.out.println("This is not a valid input for the width. Try again.");
                        in.nextLine();
                    }
                } while (trash.equals("Y"));
            } while (width < 0);

            //Getting a valid height for the rectangle
            do {
                do {
                    trash = "Y";
                    System.out.println("Input the height of the rectangle: ");
                    if (in.hasNextDouble()) {
                        height = in.nextDouble();
                        if (height > 0) {
                            trash = "N";
                            in.nextLine();
                        } else {
                            System.out.println("The height can't be " + height + ". It has to be positive. Try again.");
                            in.nextLine();
                        }
                    } else {
                        System.out.println("This is not a valid input for height. Try again.");
                        in.nextLine();
                    }
                } while (trash.equals("Y"));
            } while (height < 0);

            //Getting the hypotenuse of the rectangle
            diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
            System.out.printf("The diagonal is %15.3f", diagonal);
            //Getting the area and perimeter of the triangle
            perimeter = 2 * width + 2 * height;
            area = width * height;
            System.out.printf("\nThe permiter of the rectangle is %15.3f", perimeter);
            System.out.printf("\nThe area of the rectangle is %15.3f", area);

            //Going again
            System.out.println("\nIf you would like to go again press Y.");
            playAgain = in.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));
    }
}