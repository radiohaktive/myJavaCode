// Television.java
/* constructor that initializes two fields, brand and price, and
   has methods toString and equals */

public class Television {
	private String brand;
	private double price;

	private final double MAXPRICE = 1000;

	// Constructors;
	// initializes brand to "generic";
	// price is autoinitialized to 0.0
	public Television() {
		brand = "generic";
	} 

	public String getBrand() {
		return brand;
	} // end method getBrand

	public double getPrice() {
		return price;
	} // end method getPrice

	public Television( String startBrand,
					   double startPrice ) {
		brand = startBrand;
		setPrice( startBrand );
	}

	// Mutator methods: allows client to set model
	public void setBrand( String newBrand ) {
		brand = newBrand;
	}

	public void setPrice( double newPrice ) {
		price = newPrice;
	}

	// toString: returns a String of instance variable values
	public String toString() {
		DecimalFormat priceFormat = new DecimalFormat( "$0.00" );
		return "Brand: " + brand
			+ ";price: " + priceFormat.format(price);
	}

	// equals: returns true if fields of parameter object
	//         are equal to fields in this object
	public boolean equals( Object o ) {
		if( ! ( o instanceof Television ) )
			return false;
		else {
			Television objTelevision = (Television) o;
			if( brand.equals( objTelevision.brand )
				&& price == objTelevision.price )
				return true;
			else
				return false;
		}
	}
}
							  
			
		
