import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> library = new ArrayList<ArrayList<String>>();			//Tvådimensionell arraylist där info om böckerna sparas
		final Scanner input = new Scanner(System.in);
		
		final Menu huvudmeny = new Menu("HUVUDMENY");
		
		huvudmeny.add(new AbstractMenuItem("Avsluta") {
			public void execute() { 							// Tom execute --> avlutar programmet
			}
		});
		
		final Menu varuMenu = new Menu("VARULISTA");			//SKapar en ny meny "Varulista"
		huvudmeny.add(varuMenu);								//Lägger till den nya menyn i huvudmenyn
		
		varuMenu.add(new AbstractMenuItem("Tillbaka") {
			public void execute() {	
				huvudmeny.execute();							//Kör modermenyns execute eftersom vi vill visa den igen
			}
		});
		
		
		final Menu addVaruMenu = new Menu("LÄGG TILL NY VARA");
		huvudmeny.add(addVaruMenu);
		
			addVaruMenu.add(new AbstractMenuItem("Tillbaka"){
	    		public void execute(){
	    			huvudmeny.execute();
	    		}
	    	});
			
			
		final Menu books = new Menu("LÄGG TILL BOK");
		addVaruMenu.add(books);
			
			books.add(new AbstractMenuItem("Tillbaka"){
	    		public void execute(){
	    			addVaruMenu.execute();
	    		}
	    	});
		
		
			books.add(new AbstractMenuItem("Bok") {
				public void execute() {
					System.out.println("Varunummer: ");
					int vara = input.nextInt();
					library.add("");							//Se till att varunummer 0 länkas till Arraylisten på plats 0 i ArrayListen
					
			//Ändra så den lägger till titel, författare, pris, miljömärkt i första ArrayLilsten på plats 1 i ArrayListen library
					
					System.out.println("Titel: ");
					varor[vara][1] = input.nextLine();
					
					System.out.println("Författare: ");
					varor[vara][1] = input.nextLine();
					
					System.out.println("Pris: ");
					varor[vara][1] = input.nextLine();
					
					System.out.println("Miljömärkt: ");
					varor[vara][1] = input.nextLine();	
					
					addVaruMenu.execute();
				}
	    	});	
	    	
		huvudmeny.execute();
	}

}
