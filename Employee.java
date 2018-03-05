// Employee.java

public class Employee {

    // initialize instance variables
    private int Number;
    private String Name;
    private double Salary;
    private double newSalary;

    // set method for Name
    public void setName( String Name ) {
	this.Name = Name;
    } // end method setName

    // get method for Name
    public String getName() {
	return Name;
    } // end method getName
    
    // set method for EmployeeNumber
    public void setNumber( int Number ) {
	this.Number = Number;
    } // end method setNumber

    // get method for EmployeeNumber
    public int getNumber() {
	return Number;
    } // end method getNumber

    // set method for Salary
    public void setSalary( double Salary ) {
	this.Salary = Salary;
    } // end method setSalary

    // get method for Salary
    public double getSalary() {
	return Salary;
    } // end method getSalary
    
} // end class Employee	
    
