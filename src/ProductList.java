import java.util.ArrayList;
import java.util.Scanner;

/**
 * En ProductList listar olika varor. Varorna kategoriseras 
 * i olika kategorier; books och movies.
 * Den har ett antal add-metoder som lägger till nya varor och
 * den har ett antal print-metoder som skriver ut varor.
 */
public class ProductList {
	
	final Scanner input = new Scanner(System.in);
	private ArrayList<Book> books = new ArrayList<Book>();			//arrayList där alla böcker sparas
	private ArrayList<Movie> movies = new ArrayList<Movie>();   	//arrayList där alla filmer sparas
	private ArrayList<Clothes> clothes = new ArrayList<Clothes>(); //sparar kläder
	private ArrayList<Food> food = new ArrayList<Food>();			//sparar maten

	//ADD-METODER
	public void addBook() {
		System.out.println("\nLÄGG TILL BOK" +
							"\n=============");		
		books.add(new Book());							//Lägger till en ny bok i vår ArrayList books
	}
	
	public void addMovie() {
		System.out.println("\nLÄGG TILL FILM" +
							"\n==============");
		movies.add(new Movie());
	}
	
	public void addClothes() {
		System.out.println("\nLÄGGTILL NYA KLÄDER" +
							"\n===================");
		clothes.add(new Clothes());
	}
	
	public void addFood() {
		System.out.println("\nLÄGG TILL NYA MATVAROR" +
							"\n======================");
		food.add(new Food());
	}
	
	
	//PRINT-METODER
	public void printBooks() {						//Skriver ut alla böcker och deras egenskaper
		System.out.println("\nBÖCKER:");
		System.out.println("Nmr, Titel, Författare, Pris, Miljömärkt");
		for(int i = 0; i < books.size(); i++) {
			books.get(i).print();
		}
	}
	
	public void printMovies() {
		System.out.println("\nFILMER:");
		System.out.println("Nmr, Titel, Regissör, Pris");
		for(int i = 0; i < movies.size(); i++) {
			movies.get(i).print();
		}
	}
	
	public void printClothes() {
		System.out.println("\nKLÄDER:");
		System.out.println("Nmr, Sort, Storlek, Pris");
		for(int i = 0; i < clothes.size(); i++) {
			clothes.get(i).print();
		}
	}
	
	public void printFood() {
		System.out.println("\nMATVAROR:");
		System.out.println("Nmr, Sort, Märke, Ursprungsland, Pris, Miljömärkt");
		for(int i = 0; i < food.size(); i++) {
			food.get(i).print();
		}
	}
	
	
	public void printAll() {						//Skriver ut alla varor och deras egenskaper
		printBooks();
		printMovies();
		printClothes();
		printFood();
	}
}
