
public class Movie extends Product{
	
	private String director;
	
	/**
	 * En Movie har en titel, regissör och ett pris.
	 */
	public Movie() {								//Hämtar alla bokens egenskaper från användaren
		System.out.println("Varunummer: ");
		this.itemNumber = input.nextLine();
		
		System.out.print("Titel: ");
		this.productName = input.nextLine();
		
		System.out.print("Regissör: ");		
		this.director = input.nextLine();

		System.out.print("Pris: ");
		this.prize = input.nextLine();
	}

	public void print() {							//Skriver ut filmens egenskaper
		System.out.println(itemNumber + ", " +
							productName + ", " + 
							director + ", " + 
							prize + ".");
	}
}
