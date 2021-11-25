import java.util.Scanner;

public class karakter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			
		for (int i =0; i <10; i++) {
			
	Scanner scan = new Scanner(System.in);	
	System.out.println("Skriv poengsum");
	
	
		int n = scan.nextInt();
			

		if (n >= 90 && n<= 100) {
			System.out.println("Karakter: A");
		}
		
		else if (n >= 80 && n< 90) {
			System.out.println("Karakter: B");}	
		
		else if (n >= 60 && n< 80) {
			System.out.println("Karakter: C");  }	
		
		else if (n >= 50 && n< 60) {
			System.out.println("Karakter: D");	}
		
		else if (n >= 40 && n< 50) {
			System.out.println("Karakter: E");	}
		
		else if (n >= 0 && n< 40) {
			System.out.println("Karakter: F");	  }
		
		else {
			System.out.println("Ikke gydlig poengsum");	  }

		
		
		
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}
