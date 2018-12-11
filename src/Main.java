import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		
		//EN VARULISTA
		final ProductList varulista = new ProductList();			//Vårt meny-program har en varulista som är av typen ProductList
		
		//ALLA MENY-MENYER
		final Menu huvudmeny = new Menu("Huvudmeny");
		final Menu varulistaMenu = new Menu("Varulista");			//Skapar en ny meny "Varulista"
		final Menu addNewVaraMenu = new Menu("Lägg till ny vara");

		//UNDERMENYER TILL "HUVUDMENY"
		huvudmeny.add(new AbstractMenuItem("Avsluta") {
			public void execute() { 								// Tom execute --> avlutar programmet
			}
		});
		huvudmeny.add(varulistaMenu);								//Lägger till den nya menyn i huvudmenyn
		huvudmeny.add(addNewVaraMenu);

		//UNDERMENYER TILL "VARULISTA"
		varulistaMenu.add(new AbstractMenuItem("Tillbaka") {
			public void execute() {	
				huvudmeny.execute();								//Kör modermenyns execute eftersom vi vill visa den igen
			}
		});
		varulistaMenu.add(new AbstractMenuItem("Böcker") {
			public void execute() {
				varulista.printBooks();
				huvudmeny.execute();
			}
		});
		varulistaMenu.add(new AbstractMenuItem("Filmer") {
			public void execute() {
				varulista.printMovies();
				huvudmeny.execute();
			}
		});
		varulistaMenu.add(new AbstractMenuItem("Kläder") {
			public void execute() {
				varulista.printClothes();
				huvudmeny.execute();
			}
		});
		varulistaMenu.add(new AbstractMenuItem("Matvaror") {
			public void execute() {
				varulista.printFood();
				huvudmeny.execute();
			}
		});
		
		varulistaMenu.add(new AbstractMenuItem("Alla") {
			public void execute() {
				varulista.printAll();
				huvudmeny.execute();
			}
		});
		
		//UNDERMENYER TILL "LÄGG TILL NY VARA"
		addNewVaraMenu.add(new AbstractMenuItem("Tillbaka"){
    		public void execute(){
    			huvudmeny.execute();
    		}
	    });
		addNewVaraMenu.add(new AbstractMenuItem("Bok"){
			public void execute(){
				varulista.addBook();
				addNewVaraMenu.execute();
			}
		});
		addNewVaraMenu.add(new AbstractMenuItem("Film"){
			public void execute(){
				varulista.addMovie();
				addNewVaraMenu.execute();
			}
		});
		addNewVaraMenu.add(new AbstractMenuItem("Kläder"){
			public void execute(){
				varulista.addClothes();
				addNewVaraMenu.execute();
			}
		});
		addNewVaraMenu.add(new AbstractMenuItem("Mat"){
			public void execute(){
				
				varulista.addFood();
				addNewVaraMenu.execute();
			}
		});
	    
		//HÄR STARTAR PROGRAMMET PÅ RIKTIGT
		huvudmeny.execute();
	}
}
