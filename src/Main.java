//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Declaring variables
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double diagonal = 0;
        double area = 0;
        double perimeter = 0;
        String trash = "";
        boolean done = false;

        //do while loop for height requiring input from user
        do
        {
            System.out.println("Enter the height of the rectangle:");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine(); // clearing buffer
                if(height > 0)
                {
                done = true;
                }
                else
                {
                    System.out.println("Please enter a valid positive whole number, not " + height);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid positive whole number, not " + trash);
            }
        } while(!done);

        //resets sentinel
        done = false;

        //do while loop for width requiring input from user
        do
        {
            System.out.println("Enter the width of the rectangle:");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine(); // clearing buffer
                if(width > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Please enter a valid positive whole number, not " + width);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid positive whole number, not " + trash);
            }
        } while(!done);

        //computing the outputs then outputting the results
        area = height * width;
        perimeter = (2 * height) + (2 * width);
        diagonal = Math.sqrt((height * height) + (width * width));
        System.out.println("The area of the rectangle is " + area + " sq. and the perimeter is " + perimeter);
        System.out.println("The length of the diagonal of the rectangle is " + diagonal);
    }
}