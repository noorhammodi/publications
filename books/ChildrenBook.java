//--------------------------------------------------------------
//Assignment 2
//Part:1
//Written by: Noor Hammodi 40061760 
//--------------------------------------------------------------
package books;

public class ChildrenBook extends Book {
	
	//Attributes
	private int minimumage;

	//Constructor
	
	public ChildrenBook () // Default Constructor
	{
		System.out.print("Creating a children's book object using a default constructor." );
	}
	
	public ChildrenBook (String t, double p, int np,long pin, int issueY, String aName, int min) {
		super(t,p,np,pin,issueY,aName);
		
		System.out.println("Creating a children's book object using a parametized constructor.");
		
		minimumage=min;
		
	}
	
	public ChildrenBook (ChildrenBook cb) // Copy Constructor 
	{
		System.out.println("Creating a children's book object using a copy constructor.");
		
		setTitle(cb.getTitle());
		setPrice(cb.getPrice());
		setNumofpages(cb.getNumofpages());
		setISBN(cb.getISBN());
		setIssueYear(cb.getIssueYear());
		setAuthorsName(cb.getAuthorsName());
		
		minimumage = cb.minimumage;
		
		
		
	}
	
	// Accessor and Mutator
	
	public int getMinAge() {
		return minimumage;
	}
	
	public void setMinAge(int min) {
		minimumage=min;
	}
	
	//toString()
	
	public String toString() {
		
			return "The children book's title is " + getTitle() + ", costs " + getPrice() +
					"$, the total number of pages is " + getNumofpages() + " pages and it is suitable for ages" + 
					minimumage + "and up." ;
		}
		
	//Equals()
	
	public boolean equals (Object x) {
		if (x==null || this.getClass() != x.getClass()) {
		
			return false;
			
		}
		
		else {
			ChildrenBook cb =(ChildrenBook)x;
			
			return (this.getTitle()==cb.getTitle() && this.getPrice()==cb.getPrice() && this.getNumofpages() == cb.getNumofpages()
					&& this.minimumage == cb.minimumage);
			
		}
		
	}
}

