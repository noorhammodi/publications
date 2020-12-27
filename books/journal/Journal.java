//--------------------------------------------------------------
//Assignment 2
//Part:1
//Written by: Noor Hammodi 40061760 
//--------------------------------------------------------------
package journal;


import paperpublication.PaperPublication;

public class Journal extends PaperPublication {
	
	//Attributes
	private int issuenumber;
	private String specialityfield;
	
	// Constructors 
	
		public Journal() // Default Constructor 
		{
			System.out.println("Creating a journal object using a default constructor ");
		}
		
		public Journal (String t, double p, int np, int in, String sf) {
			super(t,p,np);
			System.out.println("Creating a journal object using a parametized constructor.");
			
			issuenumber =in;
			specialityfield =sf;
			
		}
		
		public Journal(Journal j) // Copy constructor
		{
			System.out.println("Creating a journal object using a copy constructor.");
			
			setTitle(j.getTitle());
			setPrice(j.getPrice());
			setNumofpages(j.getNumofpages());
			
			issuenumber =j.issuenumber;
			specialityfield =j.specialityfield;
			
			
			
		}
		
		//Accessors and Mutators 
		
		public long getIssueNum() {
			
			return issuenumber;	
		}
		
		public void setIssueNum(int in) {
			
			issuenumber = in;
		}
		
		public String getSpecialityField() {
			
			return specialityfield;
		}
		
		public void setSpecialityField (String sf) {
			
			specialityfield = sf;
			
		}
		
		
		
		// toString()
		
		public String toString() {
			return "The journals's title is " + getTitle() + ", costs " + getPrice() +
					"$, the total number of pages is " + getNumofpages() + " pages and the issue number is" + issuenumber 
					+ ". The speciality field of the journal is " + specialityfield + ".";
		}
		
		// Equals()
		
		public boolean equals (Object x) {
			if (x==null || this.getClass() != x.getClass()) {
			
				return false;
				
			}
			
			else {
				
				Journal j = (Journal)x;
				return ((this.getTitle() == j.getTitle()) && (this.getPrice() == j.getPrice()) && (this.getNumofpages() == j.getNumofpages())
						&& (this.issuenumber == j.issuenumber) && (this.specialityfield== j.specialityfield));
			}
}
}
