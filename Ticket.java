// Ticket.java
// java program that calculates a person's court costs and ticket costs based on how fast they were going, how many tickets they already have and predetermined rates for court costs and speeding violations

import java.util.Scanner;

public class Ticket {
    public static void main( String[] args ) {

	Scanner input = new Scanner( System.in );

	int speedLimit, speedActual, speedOver;
	double actualTicketCost, ticketCost, netCost, minorCourtCost, courtCost, maxOffense, tickets;
	double totalCost;

	// initialize variables
	ticketCost = 10;
	minorCourtCost = 20;
	courtCost = 50;
	
	// prompt for actual speed limit
	System.out.printf( "What was the speed limit? " ); 
	speedLimit = input.nextInt();

	// prompt for driver's speed
	System.out.printf( "How fast was the offender travelling? " );
	speedActual = input.nextInt();

	// prompt for # of ticket's offender has received
	System.out.printf( "How many tickets does the offender have? " );
	tickets = input.nextDouble();

	// calculate how many mph over the speed limit the offender was driving
	speedOver = (speedActual - speedLimit);

	// calculate how much the speeding ticket costs based on speedOver
	actualTicketCost = (ticketCost * speedOver);

	// control flow statement to calculate total court cost based on courtCost, minorCourtCost and the number of tickets, while maxing out after # of tickets exceeds 3 tickets

	// explicitly declare variables as needed
	maxOffense = ((3 * minorCourtCost) + courtCost);
	totalCost = 0;

	// begin if-then-else statement to calculate courtCost
	if( tickets < 3 ) {
	    totalCost = courtCost + (tickets * minorCourtCost);
	} else if ( tickets >= 3 ) {
	    totalCost = maxOffense;
	} // end if-then-else

	netCost = (actualTicketCost + totalCost);

	// print the number of previous tickets, how many miles over the speed limit the offender was traveling, how much the ticket costs are, the court costs are and the total cost
	System.out.printf( "The offender has %.0f previous tickets.%n", tickets );
	System.out.printf( "The offender was travelling %dmph over the speed limit.%n", speedOver );
	System.out.printf( "The cost of the tickets are:$%.2f%n", actualTicketCost );
	System.out.printf( "The total court costs are: $%.2f%n", totalCost );
	System.out.printf( "The total costs to be paid by the offender are: $%.2f%n", netCost );
    } // end method main
} // end class Ticket
	    
	    
