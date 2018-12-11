
public class Book extends Product{
	
	private String author;
	private String environmentalLabeled;
	
	/**
	 * En Book har en titel, författare, ett pris och kan vara miljömärkt.
	 */
	public Book() {										//Hämtar alla bokens egenskaper från användaren
		System.out.println("Varunummer: ");
		this.itemNumber = input.nextLine();
				
		System.out.print("Titel: ");
		this.productName = input.nextLine();
		
		System.out.print("Författare: ");		
		this.author = input.nextLine();

		System.out.print("Pris: ");
		this.prize = input.nextLine();
		
		System.out.print("Miljömärkt: ");
		this.environmentalLabeled = input.nextLine();
	}
	
	public void print() {								//Skriver ut bokens egenskaper
		System.out.println(itemNumber + ", " +
							productName + ", " + 
							author + ", " + 
							prize + ", " + 
							environmentalLabeled + ".");
	}
}
