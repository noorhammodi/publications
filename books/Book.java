//--------------------------------------------------------------
//Assignment 2
//Part:1
//Written by: Noor Hammodi 40061760 
//--------------------------------------------------------------
package books;

import paperpublication.PaperPublication;

public class Book extends PaperPublication{
	
	// Attributes
	protected long ISBN;
	protected int issueyear;
	protected String authorsname;
	
	// Constructors 
	
	public Book() // Default Constructor 
	{
		System.out.println("Creating a book object using a default constructor ");
	}
	
	public Book(String t, double p, int np,long pin, int issueY, String aName) {
		super(t,p,np);
		System.out.println("Creating a book object using a parametized constructor.");
		
		ISBN=pin;
		issueyear=issueY;
		authorsname=aName;
		
	}
	
	public Book(Book b) // Copy constructor
	{
		System.out.println("Creating a book object using a copy constructor.");
		
		setTitle(b.getTitle());
		setPrice(b.getPrice());
		setNumofpages(b.getNumofpages());
		
		ISBN = b.ISBN;
		issueyear =b.issueyear;
		authorsname =b.authorsname;
		
	}
	
	//Accessors and Mutators 
	
	public long getISBN() {
		
		return ISBN;	
	}
	
	public void setISBN(long pin) {
		
		ISBN =pin;
	}
	
	public int getIssueYear() {
		
		return issueyear;
	}
	
	public void setIssueYear(int issueY) {
		
		issueyear=issueY;
	}
	
	public String getAuthorsName() {
		
		return authorsname;
	}
	public void setAuthorsName(String aName) {
		
		authorsname=aName;
		
	}
	
	// toString()
	
	public String toString() {
		return "The book's title is " + getTitle() + ", costs " + getPrice() +
				"$, the total number of pages is " + getNumofpages() + " pages and the ISBN is" + ISBN 
				+ ". The book was issued in " + issueyear + " and it was written by " + authorsname + " ." ;
	}
	
	// Equals()
	
	public boolean equals (Object x) {
		if (x==null || this.getClass() != x.getClass()) {
		
			return false;
			
		}
		
		else {
			
			Book bo = (Book)x;
			return ((this.getTitle() == bo.getTitle()) && (this.getPrice() == bo.getPrice()) && (this.getNumofpages() == bo.getNumofpages())
					&& (this.ISBN == bo.ISBN) && (this.issueyear == bo.issueyear) && (this.authorsname == bo.authorsname));
		}
		
	
	}
	
}