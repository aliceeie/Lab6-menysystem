import java.util.Scanner;

/**
 * En generell produkt (en vara) har ett produktnummer, produktnamn, pris och
 * en skanner för att kunna hämta nödvändig data från användaren.
 * Den har också en print-metod för att kunna skriva ut sin egen data,
 * aka sina egna egenskaper.
 */
public abstract class Product {

	protected Scanner input = new Scanner(System.in);
	protected String itemNumber;
	protected String productName;
	protected String prize;
	
	public abstract void print();
}
