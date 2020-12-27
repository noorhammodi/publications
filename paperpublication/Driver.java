//--------------------------------------------------------------
//Assignment 2
//Part:2
//Written by: Noor Hammodi 40061760 
//--------------------------------------------------------------
package paperpublication;

import books.Book;
import books.ChildrenBook;
import books.EducationalBook;
import journal.Journal;
import magazine.Magazine;
import magazine.Magazine.issuingfrequency;
import magazine.Magazine.paperquality;

public class Driver {
 
	public static void main(String[] args) {
		
		// Create six various objects using the toString()
		
		System.out.println("Creating an object from each of the six classes...");
		
		PaperPublication p1 = new PaperPublication ("National News", 10, 30);
		System.out.println(p1 + "\n");
		
		Book b1 = new Book ("National News", 10, 30, 12345678, 1998, "Noor");
		System.out.println(b1 + "\n");
		
		ChildrenBook cb1 = new ChildrenBook ("National News", 10, 30, 12345678, 1998, "Noor", 3);
		System.out.println(cb1 + "\n");
		
		EducationalBook eb1 = new EducationalBook ("National News ", 10, 30, 12345678, 1998, "Noor",5, "engineering");
		System.out.println(eb1 + "\n");
		
		Journal j1 = new Journal ("National News ", 10, 30,5, "engineering");
		System.out.println(j1 + "\n");
		
		Magazine m1 = new Magazine ("National News ", 10, 30,paperquality.Low, issuingfrequency.Monthly);
		System.out.println(m1 + "\n");
		
		// Testing the equality of some of the created objects using the equals()
		
		// 1) Testing Equality between two objects of the same class
		// Comparing some of the paper publications
		
		System.out.println("\nComparing some of the paper publications");
		System.out.println("==========================================");
		
		if(j1.equals(m1)) {
			System.out.print("The journal and magazine (j1 & m1) are equal to each other.");
			}
		else
			System.out.print("The journal and magazine (j1 & m1) are not equal to each other.");
			
		if(cb1.equals(eb1)) {
			System.out.print("The children's book and educational book (cb1 & eb1) are equal to each other.\n");
		}
		else
		System.out.print(" The children's book and educational book (cb1 & eb1) are not equal to each other.\n");
		
		
		
		// 2) Testing Equality between father and child class (vice versa)
		// Comparing paper publications of different classes 
		
		System.out.println("\nComparing some of the paper publications from different classes ");
		System.out.println("==========================================");
		
		//The following are the changes to the classes to "try" to make them equal
		
		b1.setTitle("National News");
		j1.setTitle("National News");
		
		b1.setPrice(10);
		j1.setPrice(10);
		
		b1.setNumofpages(5);
		j1.setNumofpages(5);
		
		if(b1.equals(j1)) {
			System.out.println("The  book and journal (b1 & j1) are equal to each other.");
		}
		else
		System.out.println(" The book and journal (b1 & j1) are not equal to each other.");
		
		
		
		}
		
	// creating an object array
			PaperPublication[]publicationsArray= {p1,b1,cb1,eb1,j1,m1};

			int most=publicationsArray[0].getNumofpages();
			int mostIndex=0;
			for (int i=0;i<publicationsArray.length;i++) {
				if(publicationsArray[i].getNumofpages()<most) {
					mostIndex=i;
				}
			}
			System.out.println("The publication at position"+ mostIndex + "of the array has the most pages.");
			//least pages 
			
			int least=publicationsArray[0].getNumofpages();
			int leastIndex=0;
			for (int i=0;i<publicationsArray.length;i++) {
				if(publicationsArray[i].getNumofpages()<least) {
					mostIndex=i;
				}
			}
			System.out.println("The publication at position"+ mostIndex + "of the array has the least pages.");
			
			
			
			
			
	//copy constructor	
	public static Drive[] copyBooks (Drive[]cp) {
		Drive[] publicationsArray=cp;
		return cp;
	}
	
	

	}

