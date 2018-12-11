
public class Food extends Product{
	
	private String land;
	private String brand;
	private String environmentalLabeled;
	/**
	 * En matvara har ett artikelnummer, en sort, ett märke, ett ursprungsland och pris
	 */
	public Food() {
		System.out.print("Varunummer: ");
		this.itemNumber = input.nextLine();
		
		System.out.print("Sort: ");
		this.productName = input.nextLine();
		
		System.out.print("Märke: ");		
		this.brand = input.nextLine();
		
		System.out.print("Ursprungsland: ");		
		this.land = input.nextLine();

		System.out.print("Pris: ");
		this.prize = input.nextLine();
		
		System.out.print("Miljömärkt: ");
		this.environmentalLabeled = input.nextLine();
	}
	
	
	public void print(){
		System.out.println(itemNumber + ", " +
							productName + ", " + 
							brand + ", " +
							land + ", " + 
							prize + ", " + 
							environmentalLabeled + ".");
	}

}
