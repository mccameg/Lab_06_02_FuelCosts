import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    double gallonsInTank = 0;
	    double milesPerGallon = 0;
	    double gasPrice = 0;
	    double costPerHundredMiles = 0;
	    double milesTilEmpty = 0;
	    double gallonsNeeded = 0;
	    String trash = "";

        Scanner in = new Scanner(System.in); // Creating the scanner and telling it to read from console

        System.out.print("How many gallons of gas are currently in the tank?: "); //prompt to tell the user what to enter
        if (in.hasNextDouble()) // if the input is a valid number, the code in the if block will execute
        {
            gallonsInTank = in.nextDouble(); // if the input is valid, the input will be stored in gallonsInTank
            in.nextLine(); // clears the buffer
        }
        else // if the input is invalid (not a number), the code in the else block will execute
        {
            trash = in.nextLine(); // if the input is invalid, it will be stored in trash
            System.out.println("Must enter a valid number for gallons of gas in the tank: " + trash); // output tells the user that their input was invalid and echoes their response back to them
        }

        System.out.print("What is the fuel efficiency of your car in miles per gallon?: "); //prompt to tell the user what to enter
        if (in.hasNextDouble()) // if the input is a valid number, the code in the if block will execute
        {
            milesPerGallon = in.nextDouble(); // if the input is valid, the input will be stored in milesPerGallon
            in.nextLine(); // clears the buffer
        }
        else // if the input is invalid (not a number), the code in the else block will execute
        {
            trash = in.nextLine(); // if the input is invalid, it will be stored in trash
            System.out.println("Must enter a valid number for fuel efficiency: " + trash); // output tells the user that their input was invalid and echoes their response back to them

        }

        System.out.print("What is the current price of one gallon of gas?: "); //prompt to tell the user what to enter
        if (in.hasNextDouble()) // if the input is a valid number, the code in the if block will execute
        {
            gasPrice = in.nextDouble(); // if the input is valid, the input will be stored in gasPrice
            in.nextLine(); // clears the buffer
        }
        else // if the input is invalid (not a number), the code in the else block will execute
        {
            trash = in.nextLine(); // if the input is invalid, it will be stored in trash
            System.out.println("Must enter a valid number for gas price: " + trash); // output tells the user that their input was invalid and echoes their response back to them

        }

        gallonsNeeded = 100 / milesPerGallon; // calculates the gallons of gas needed to travel 100 miles
        costPerHundredMiles = gallonsNeeded * gasPrice; // calculates the cost to travel 100 miles
        System.out.println("The cost to drive 100 miles is $" + costPerHundredMiles); // outputs the cost to drive 100 miles
        milesTilEmpty = gallonsInTank * milesPerGallon; // calculates the number of miles until empty
        System.out.println("The car can travel " + milesTilEmpty + " more miles with the gas that is in the tank."); // outputs how many miles until empty

    }
}
