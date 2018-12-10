import java.util.ArrayList;
import java.util.Scanner;


	
public class Menu implements MenuItem {
	
	private String title;
	private ArrayList<MenuItem> menyval;
	private Scanner input = new Scanner(System.in);
	
	     /**
	* Skapar en tom meny med den givna rubriken.
	*/
	public Menu(String title) {
		
		this.title = title;
		menyval = new ArrayList<MenuItem>();
		}
	
	/**
	* Lägger till ett menyval till menyn.
	*/
	public void add(MenuItem item) {
		menyval.add(item);
	}
	public String getTitle() {
		return title;
	}
	/**
	* Exekverar menyn enligt loopen definierad i punkterna (1) till (4).
	* (1) Skriver ut menyns rubrik med stora bokstäverunderstruket med
	* ’=’. Därefter följer en numrerad lista över alla menyelement i
	* denna meny, numrerade från 0.
	* (2) Användaren får sedan välja ett av alternativen genom att ange
	* talet framför menyvalet. Vad händer om man inte anger ett giltigt
	* tal? Användarens menyval exekveras.
	* (3) Om menyval 0 valts så returnerar metoden. 0 motsvarar
	* alltså alltid av avsluta/tillbaka/återgå.
	* (4) gå till (1)
	*/
	public void execute() {
		System.out.println(title);
		System.out.println("===============");
		   
		for(int x=0; x<menyval.size(); x++){
			System.out.println(x + ": " + menyval.get(x).getTitle());
		} 
		menyval.get(input.nextInt()).execute();
	}
}
