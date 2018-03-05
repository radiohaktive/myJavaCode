// EmployeeTest.java

// import Scanner object
import java.util.Scanner;

public class EmployeeTest {
    public static void main( String[] args ) {

	// new Scanner object
	Scanner input = new Scanner( System.in );

	// create an Employee object and assign it to myEmployee
	Employee Employee1 = new Employee();
	Employee Employee2 = new Employee();
	Employee Employee3 = new Employee();
	Employee Employee4 = new Employee();
	Employee Employee5 = new Employee();
	Employee Employee6 = new Employee();
	Employee Employee7 = new Employee();
	Employee Employee8 = new Employee();
	Employee Employee9 = new Employee();
	Employee Employee10 = new Employee();	

	String theName;
	int theNumber;
	double theSalary;

	// EMPLOYEE 1
	// prompt and read theName
	System.out.print( "Employee's full name: " );
	theName = input.nextLine();
	Employee1.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input.nextInt();
	Employee1.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input.nextDouble();
	Employee1.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	System.out.println();

	Scanner input2 = new Scanner( System.in );
	
	// EMPLOYEE2
       	// prompt and read theName
	System.out.print( "Employee full name: " );
	theName = input2.nextLine();
	Employee2.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input2.nextInt();
	Employee2.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input2.nextDouble();
	Employee2.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	// blank line
	System.out.println();

	Scanner input3 = new Scanner( System.in );

	// EMPLOYEE 3
	// prompt and read theName
	System.out.print( "Employee's full name: " );
	theName = input3.nextLine();
	Employee3.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input3.nextInt();
	Employee3.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input3.nextDouble();
	Employee3.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	// blank line
	System.out.println();

	Scanner input4 = new Scanner( System.in );

	// EMPLOYEE 4
	// prompt and read theName
	System.out.print( "Employee's full name: " );
	theName = input4.nextLine();
	Employee4.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input4.nextInt();
	Employee4.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input4.nextDouble();
	Employee4.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	// blank line
	System.out.println();

	Scanner input5 = new Scanner( System.in );

	// EMPLOYEE 5
	// prompt and read theName
	System.out.print( "Employee's full name: " );
	theName = input5.nextLine();
	Employee5.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input5.nextInt();
	Employee5.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input5.nextDouble();
	Employee5.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	// blank line
	System.out.println();

	Scanner input6 = new Scanner( System.in );

	// EMPLOYEE 6
	// prompt and read theName
	System.out.print( "Employee's full name: " );
	theName = input6.nextLine();
	Employee6.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input6.nextInt();
	Employee6.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input6.nextDouble();
	Employee6.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	// blank line
	System.out.println();

	Scanner input7 = new Scanner( System.in );

	// EMPLOYEE 7
	// prompt and read theName
	System.out.print( "Employee's full name: " );
	theName = input7.nextLine();
	Employee7.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input7.nextInt();
	Employee7.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input7.nextDouble();
	Employee7.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	// blank line
	System.out.println();

	Scanner input8 = new Scanner( System.in );
	
	// EMPLOYEE 8
	// prompt and read theName
	System.out.print( "Employee's full name: " );
	theName = input8.nextLine();
	Employee8.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input8.nextInt();
	Employee8.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input8.nextDouble();
	Employee8.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	// blank line
	System.out.println();

	Scanner input9 = new Scanner( System.in );

	// EMPLOYEE 9
	// prompt and read theName
	System.out.print( "Employee's full name: " );
	theName = input9.nextLine();
	Employee9.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input9.nextInt();
	Employee9.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input9.nextDouble();
	Employee9.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	// blank line
	System.out.println();

	Scanner input10 = new Scanner( System.in );

	// EMPLOYEE 10
	// prompt and read theName
	System.out.print( "Employee's full name: " );
	theName = input10.nextLine();
	Employee10.setName( theName );
	// prompt and read theNumber
	System.out.print( "Employee number: " );
	theNumber = input10.nextInt();
	Employee10.setNumber( theNumber );
	// prompt and read theSalary
	System.out.print( "Annual salary: " );
	theSalary = input10.nextDouble();
	Employee10.setSalary( theSalary );
	// set negative salary to $0.00
	if( theSalary < 0 ) {
	    theSalary = 0.0;
	} // end if
	// blank line
	System.out.println();	

	// print results
	System.out.printf( "Employee1: %s, ID#: %d, Salary: $%.2f%n", Employee1.getName(), Employee1.getNumber(), Employee1.getSalary());
	System.out.printf( "Employee2: %s, ID#: %d, Salary: $%.2f%n", Employee2.getName(), Employee2.getNumber(), Employee2.getSalary());
	System.out.printf( "Employee3: %s, ID#: %d, Salary: $%.2f%n", Employee3.getName(), Employee3.getNumber(), Employee3.getSalary());
	System.out.printf( "Employee4: %s, ID#: %d, Salary: $%.2f%n", Employee4.getName(), Employee4.getNumber(), Employee4.getSalary());
	System.out.printf( "Employee5: %s, ID#: %d, Salary: $%.2f%n", Employee5.getName(), Employee5.getNumber(), Employee5.getSalary());
	System.out.printf( "Employee6: %s, ID#: %d, Salary: $%.2f%n", Employee6.getName(), Employee6.getNumber(), Employee6.getSalary());
	System.out.printf( "Employee7: %s, ID#: %d, Salary: $%.2f%n", Employee7.getName(), Employee7.getNumber(), Employee7.getSalary());
	System.out.printf( "Employee8: %s, ID#: %d, Salary: $%.2f%n", Employee8.getName(), Employee8.getNumber(), Employee8.getSalary());
	System.out.printf( "Employee9: %s, ID#: %d, Salary: $%.2f%n", Employee9.getName(), Employee9.getNumber(), Employee9.getSalary());
	System.out.printf( "Employee10: %s, ID#: %d, Salary: $%.2f%n", Employee10.getName(), Employee10.getNumber(), Employee10.getSalary());

	// increase salaries by 10%
	System.out.println( "Increase salaries by 10%" );
	
	System.out.printf( "Employee1: %s, ID#: %d, Salary: $%.2f%n", Employee1.getName(), Employee1.getNumber(), (Employee1.getSalary() * 1.1) );
	System.out.printf( "Employee2: %s, ID#: %d, Salary: $%.2f%n", Employee2.getName(), Employee2.getNumber(), (Employee2.getSalary() * 1.1) );
	System.out.printf( "Employee3: %s, ID#: %d, Salary: $%.2f%n", Employee3.getName(), Employee3.getNumber(), (Employee3.getSalary() * 1.1));
	System.out.printf( "Employee4: %s, ID#: %d, Salary: $%.2f%n", Employee4.getName(), Employee4.getNumber(), (Employee4.getSalary() * 1.1));
	System.out.printf( "Employee5: %s, ID#: %d, Salary: $%.2f%n", Employee5.getName(), Employee5.getNumber(), (Employee5.getSalary() * 1.1));
	System.out.printf( "Employee6: %s, ID#: %d, Salary: $%.2f%n", Employee6.getName(), Employee6.getNumber(), (Employee6.getSalary() * 1.1));
	System.out.printf( "Employee7: %s, ID#: %d, Salary: $%.2f%n", Employee7.getName(), Employee7.getNumber(), (Employee7.getSalary() * 1.1));
	System.out.printf( "Employee8: %s, ID#: %d, Salary: $%.2f%n", Employee8.getName(), Employee8.getNumber(), (Employee8.getSalary() * 1.1));
	System.out.printf( "Employee9: %s, ID#: %d, Salary: $%.2f%n", Employee9.getName(), Employee9.getNumber(), (Employee9.getSalary() * 1.1));
	System.out.printf( "Employee10: %s, ID#: %d, Salary: $%.2f%n", Employee10.getName(), Employee10.getNumber(), (Employee10.getSalary() * 1.1));
	
    } // end method main
} // end class EmployeeTest

       

	
