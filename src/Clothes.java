
public class Clothes extends Product{

	private String size;
	
	/**
	 * Ett klädesplagg har ett artikelnummer, en sort, storlek och pris
	 */
	public Clothes(){
		System.out.print("Varunummer: ");
		this.itemNumber = input.nextLine();
		
		System.out.print("Sort: ");
		this.productName = input.nextLine();
		
		System.out.print("Storlek: ");		
		this.size = input.nextLine();

		System.out.print("Pris: ");
		this.prize = input.nextLine();
	}
	
	
	public void print() {
		System.out.println(itemNumber + ", " +
							productName + ", " + 
							size + ", " + 
							prize + ".");
		
	}
	

}
