//--------------------------------------------------------------
//Assignment 2
//Part:1
//Written by: Noor Hammodi 40061760 
//--------------------------------------------------------------
package books;

public class EducationalBook extends Book {
	
	//Attributes
	private int editionnum;
	private String specialityfield;
	
	//Constructor
	
		public EducationalBook () // Default Constructor
		{
			System.out.print("Creating a educational book object using a default constructor." );
		}
		
		public EducationalBook (String t, double p, int np,long pin, int issueY, String aName, int en, String sf) {
			super(t,p,np,pin,issueY,aName);
			
			System.out.println("Creating a educational book object using a parametized constructor.");
			
			editionnum=en;
			specialityfield=sf;
		}
		
		public EducationalBook (EducationalBook eb) // Copy Constructor 
		{
			System.out.println("Creating a educational book object using a copy constructor.");
			
			setTitle(eb.getTitle());
			setPrice(eb.getPrice());
			setNumofpages(eb.getNumofpages());
			setISBN(eb.getISBN());
			setIssueYear(eb.getIssueYear());
			setAuthorsName(eb.getAuthorsName());
			
			editionnum= eb.editionnum;
			specialityfield = eb.specialityfield;
			
			
		}
		
		// Accessor and Mutator
		
		public int getEditionNum() {
			return editionnum;
		}
		
		public void setEditionNum(int en) {
			editionnum=en;
		}
		
		public String getSpecialityField() {
			
			return specialityfield;
		}
		
		public void setSpecialityField (String sf) {
			
			specialityfield = sf;
			
		}
		
		//toString()
		
		public String toString() {
			
				return "The educational book's title is " + getTitle() + ", costs " + getPrice() +
						"$, the total number of pages is " + getNumofpages() + " pages and the edition number is " + editionnum 
						+". The speciality field of the journal is " + specialityfield + ".";
					
			}
		
		public boolean equals (Object x) {
			if (x==null || this.getClass() != x.getClass()) {
			
				return false;
				
			}
			
			else {
				EducationalBook eb =(EducationalBook)x;
				
				return (this.getTitle()==eb.getTitle() && this.getPrice()==eb.getPrice() && this.getNumofpages() == eb.getNumofpages()
						&& (this.editionnum == eb.editionnum) &&  (this.specialityfield== eb.specialityfield));
				
			}
			
			
		}
}
