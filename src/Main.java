import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final ArrayList<ArrayList<String>> library = new ArrayList<ArrayList<String>>();		//Tvådimensionell arraylist där alla böcker sparas
		final ArrayList<String> book = new ArrayList<String>();									//arrayList där info om varje bok sparas
		final Scanner input = new Scanner(System.in);
		final Menu huvudmeny = new Menu("HUVUDMENY");
		
		huvudmeny.add(new AbstractMenuItem("Avsluta") {
			public void execute() { 							// Tom execute --> avlutar programmet
			}
		});
		
		final Menu varuMenu = new Menu("Varulista");			//Skapar en ny meny "Varulista"
		huvudmeny.add(varuMenu);								//Lägger till den nya menyn i huvudmenyn
		
		varuMenu.add(new AbstractMenuItem("Tillbaka") {
			public void execute() {	
				huvudmeny.execute();							//Kör modermenyns execute eftersom vi vill visa den igen
			}
		});
		varuMenu.add(new AbstractMenuItem("Böcker") {
			public void execute() {	
				System.out.println(book.toString() + "\n");			//FIXA PRINTEN
				huvudmeny.execute();
			}
		});
		
		
		final Menu addVaruMenu = new Menu("Lägg till ny vara");
		huvudmeny.add(addVaruMenu);
		
			addVaruMenu.add(new AbstractMenuItem("Tillbaka"){
	    		public void execute(){
	    			huvudmeny.execute();
	    		}
	    	});
			
			
		final Menu books = new Menu("Lägg till bok");
		addVaruMenu.add(books);
			
			books.add(new AbstractMenuItem("Tillbaka"){
	    		public void execute(){
	    			addVaruMenu.execute();
	    		}
	    	});
			
			books.add(new AbstractMenuItem("Bok") {
				public void execute() {
					System.out.println("Varunummer: ");		//FIXA SÅ MAN KAN SPARA PÅ VILKEN PLATS MAN VILL (vilket varunummer som helst)
					int varuNummer = input.nextInt();			//Sparar varunumret så vi kan se till att boken länkas till rätt plats i Arraylisten
					
					System.out.println("Titel: ");				//Titel kommer sparas på plats noll i ArrayListen book
					book.add(input.nextLine());
					
					System.out.println("Författare: ");		//HÄR ÄR DET KNAS MED SCANNERN
					book.add(input.nextLine());
					
					System.out.println("Pris: ");
					book.add(input.nextLine());
					
					System.out.println("Miljömärkt: ");
					book.add(input.nextLine());	
					
					library.add(varuNummer, book);				//Lägger till den aktuella boken på samma plats som varunumret säger
					addVaruMenu.execute();
				}
	    	});	
		
			final Menu movies = new Menu("Lägg till film");
			addVaruMenu.add(movies);
				
				movies.add(new AbstractMenuItem("Tillbaka"){
					public void execute(){
						addVaruMenu.execute();
					}
				});
	    	
		huvudmeny.execute();
	}

}
