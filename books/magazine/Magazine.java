//--------------------------------------------------------------
//Assignment 2
//Part:1
//Written by: Noor Hammodi 40061760 
//--------------------------------------------------------------
package magazine;

import paperpublication.PaperPublication;

public class Magazine extends PaperPublication {

	public static enum paperquality {High,Normal,Low};
	public static enum issuingfrequency {Weekly,Monthly,Yearly}; 
	
	// Attributes 
	private paperquality quality;
	private issuingfrequency frequency;
	
	// Constructors 
	
		public Magazine() // Default Constructor 
		{
			System.out.println("Creating a magazine object using a default constructor ");
		}

		public Magazine (String t, double p, int np, paperquality pq, issuingfrequency freq) {
			super(t,p,np);
			System.out.println("Creating a magazine object using a parametized constructor.");
			
			quality = pq;
			frequency = freq;
			
		}
		
		
		public Magazine(Magazine mag) // Copy constructor
			{
				System.out.println("Creating a magazine object using a copy constructor.");
				
				setTitle(mag.getTitle());
				setPrice(mag.getPrice());
				setNumofpages(mag.getNumofpages());
				
				quality = mag.quality;
				frequency = mag.frequency;
				
				
			}
		
		// Accessors and Mutators
		
		public paperquality getQuality() {
			return quality;
		}
		
		public void setQuality(paperquality pq) {
			quality =pq;
		}
		
		public issuingfrequency getFrequency() {
			return frequency;
		}
		
		public void setFrequency (issuingfrequency freq) {
			frequency = freq;
		}
		
		
		// toString()
		
				public String toString() {
					return "The magazine's title is " + getTitle() + ", costs " + getPrice() +
							"$, the total number of pages is " + getNumofpages() + " pages and the paper quality is " 
							+ quality + ". The issuing frequency is " + frequency + "."; 
				}
				
		// Equals()
				
				public boolean equals (Object x) {
					if (x==null || this.getClass() != x.getClass()) {
					
						return false;
						
					}
					
					else {
						
						Magazine mag = (Magazine)x;
						return ((this.getTitle() == mag.getTitle()) && (this.getPrice() == mag.getPrice()) && (this.getNumofpages() == mag.getNumofpages())
								&& (this.getFrequency()== mag.getFrequency()) && (this.getQuality() == mag.getQuality()));
					}
		}
			
		
}
