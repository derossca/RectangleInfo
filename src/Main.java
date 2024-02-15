//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //PSEUDO CODE GOES HERE

        //Declaring variables
        Scanner in = new Scanner(System.in);
        int height = 0;
        int width = 0;
        int diagonal = 0;
        String trash = "";
        Boolean done = false;

        //do while loops for height requiring input from user
        //WHY CAN'T I GET IT TO NOT DO A NEGATIVE NUMBER???
        do
        {
            System.out.println("Enter the height of the rectangle:");
            if(in.hasNextInt())
            {
                height = in.nextInt();
                in.nextLine(); // clearing buffer
                done = true;
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
            if(in.hasNextInt())
            {
                width = in.nextInt();
                in.nextLine(); // clearing buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid positive whole number, not " + trash);
            }
        } while(!done);


    }
}