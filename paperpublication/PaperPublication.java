package paperpublication;

public class PaperPublication {

	// Attributes
	private String title;
	private double price;
	private int numofpages;
	
	// Constructors
	
	public PaperPublication() // Default Constructors 
	{
		System.out.println("Creating a paper publication using the default constructor.");
	}
	
	public PaperPublication(String t, double p, int np) { 
		System.out.println("Creating a paper publication using a parametized constructor.");
		
		title = t;
		price = p;
		numofpages = np;
		
	}
	
	
	public PaperPublication (PaperPublication pa) // Copy Constructor
	{
		System.out.println("Creating a paper publication using a copy constructor.");
		
		title = pa.title;
		price = pa.price;
		numofpages = pa.numofpages;
				
	}
	
	// Accessors and Mutators 
	
	public String getTitle() { 
		
		return title;
		
	}
	
	public void setTitle (String t ) {
		
		title =t;
	}
	
	public double getPrice() {
		
		return price;
	}
	
	public void setPrice(double p) {
		
		price= p;
	}
	
	public int getNumofpages () {
		
		return numofpages;
	}
	
	public void setNumofpages (int np) {
		
		numofpages = np;
	}
	
	//toString()
	
	public String toString() {
		
		return "This Paper Publication's title is " + title + " and the cost of it is " + price +
				"$. The total number of pages of this publication is " + numofpages + " pages.";
	}
	
	// Equals() 
	
	public boolean equals(Object x) {
		//if the passed object x is null and if the object passed is a different type than the calling object
		//if any of the conditions is true, then it would be false which is why it is || (or)
		
		if (x==null || this.getClass() != x.getClass()) {
			
			return false;
		}
		
		//Comparing the attributes of the objects to see if they have identical values (suggesting them to be equal)
		else
			
		{
			PaperPublication pa = (PaperPublication)x;
			return (this.title == pa.title && this.price == pa.price && this.numofpages == pa.numofpages);
		
	}
	
}
}

