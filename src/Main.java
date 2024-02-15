//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //PSEUDO CODE GOES HERE

        //Declaring variables
        Scanner in = new Scanner(System.in);
        double height = 0;
        double width = 0;
        double diagonal = 0;
        double area = 0;
        double perimeter = 0;
        String trash = "";
        boolean done = false;

        //do while loops for height requiring input from user
        //WHY CAN'T I GET IT TO NOT DO A NEGATIVE NUMBER???
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
                    System.out.println("Please enter a valid postive whole number, not " + height);
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid positive whole number, not " + trash);
            }
        } while(!done);

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
        System.out.println("The are of the rectangle is " + area + " and the perimeter is " + perimeter);
        System.out.println("The length of the diagonal of the rectangle is " + diagonal);
    }
}