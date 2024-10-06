package TD1_4;

public class livre {
	private String titre;
	private String auteur;
	private float nbPages;
	private double prix;
	private boolean prixFixe;
	public  livre (String auteur , String titre) {
		this.auteur = auteur;
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public double getPrix() {
		return prix;
	}
	public String getTitre() {
		return titre;
	}
	public float getNbPages() {
		return nbPages;
	}
	public void setNbPages (float nb) {
		if (nb > 20) {
			nbPages = nb;
		}else {
			System.out.println("le nombre indiqué est faible");
		}
	}
	public void setAuteur (String auteur) {
		this.auteur = auteur;
	}
	public void setPrix (double prix) {
		if (prixFixe == false) {
			this.prix = prix;
			prixFixe = true;
		}else {
			System.out.println("le prix est déja fixé");
		}
	}
	public void setTitre (String titre) {
		this.titre = titre;
	}
	public String toString(String auteur , String titre , float nbPages) {
		String ch = "Livre intitulé "+titre+" de "+auteur+", contenant "+nbPages+" pages.";
		return ch;
	}
	public void decrire() {
		System.out.println(toString(auteur,titre,nbPages));
	}
	public livre(String titre , float nbPages) {
		this.titre = titre;
		this.nbPages = nbPages;
	}
	public livre(String titre , String auteur , float nbPages) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbPages = nbPages;
	}
	public livre() {
		titre = "";
		auteur = "";
		nbPages = 0;
		prix = 0;
	}
	public boolean testPrix() {
		if (prix > 0) {
			return true;
		}else {
			return false;
		}
	}
	
}
