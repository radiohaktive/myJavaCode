import java.text.DecimalFormat;

public class Auto {
	private String model;
	private int milesDriven;
	private double gallonsOfGas;

	//Constructors
	public Auto {
		model = "unknown";
	}

	public Auto( String startModel,
				 int startMilesDriven,
				 double startGallonsOfGas ) {
		model = startModel;
		setMilesDriven( startMilesDriven );
		setGallonsOfGas( startGallonsOfGas );
	}

	public String getModel() {
		return model;
	}

	public int getMilesDriven() {
		return milesDriven;
	}

	public int getGallonsOfGas() {
		return gallonsOfGas;
	}

	//Mutator methods, set methods
	public void setModel( String newModel ) {
		model = newModel;
	}

	public void setMilesDriven( int newMilesDriven ) {
		if( newMilesDriven >= 0 )
			milesDriven = newMilesDriven;
		else {
			System.err.println( "Miles cannot be negative." );
			System.err.println( "Value not changed." );
		}					
	}

	public void setGallonsOfGas( double newGallonsOfGas ) {
		if( newGallonsOfGas >= 0 )
			gallonsOfGas = newGallonsOfGas;
		else {
			System.err.println( "Gas cannot be negative." );
			System.err.println( "Value not changed." );
		}					
	}

	public double calculateMilesPerGallon() {
		if( gallonsOfGas != 0.0 )
			return milesDriven / gallonsOfGas;
		else
			return 0.0;
	}

	// toString; returns a String of instance variable values
	public String toString( ) {
		DecimalFormat gallonsFormat = new DecimalFormat( "#0.0" );
		return "Model: " + model
			+ "; miles driven: " + milesDriven
			+ "; gallons of gas: "
			+ gallonsFormat.format( gallonsOfGas );
	}

	// equals: returns true if fields of parameter object
	//         are equal to fields in this object
	public boolean equals( Object o ) {
		if( ! ( o instanceof Auto ) )
			return false;
		else {
			Auto objAuto = (Auto) o;
			if( model.equals( objAuto.model )
				&& milesDriven == objAuto.milesDriven
				&& Math.abs( gallonsOfGas - objAuto.gallonsOfGas )
				< 0.0001 )
				return true;
			else
				return false;
		}
	}
}
			
				
	   
		
				 
