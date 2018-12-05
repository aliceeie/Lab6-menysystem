
public class Main {

	public static void main(String[] args) {

		
		Menu testMenu = new Menu("En liten testmeny");
		
		testMenu.add(new AbstractMenuItem("Avsluta") {  		//anonym klass
			public void execute() { // Gör ingenting.
			}
		});
		
		testMenu.add(new AbstractMenuItem("Skriv ut hej") { 	//anonym klass
		    public void execute() {
		       System.out.println("Hej!!!");
		    }
		});
		Menu underTestMenu = new Menu("UnderTestMenu");
		testMenu.add(underTestMenu);
		
		underTestMenu.add(new AbstractMenuItem("Tillbaka") {
			public void execute() {
			}
		});
			
		
		
		
		
		testMenu.execute();
		
		//testMenu.add(testMenu); // Wow, en cirkulär meny!
	}

}
