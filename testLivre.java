package TD1_4;

public class testLivre {
	public static void main (String [] args) {
		livre tab[] = new livre[10];
		tab[0] = new livre("L'alchimiste" , "Coelho" , 255);
		tab[1] = new livre("La Tunisie" , 508);
		tab[2] = new livre("Harry Potter" , "JK Rowling" , 0);
		for (int i=0 ; i<=2 ; i++) {
			System.out.println("Titre :"+tab[i].getTitre());
			System.out.println("Auteur :"+tab[i].getAuteur());
			System.out.println("Nb Pages :"+tab[i].getNbPages());
		}
		tab[1].setAuteur("Paulo Coelho");
		tab[2].setNbPages(461);
		for (int i=0 ; i<3 ; i++) {
			tab[i].decrire();
		}
		
			tab[1].setPrix(51000);
		
			tab[1].setPrix(5);
		
	}	
}
