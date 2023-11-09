package personnages;

public class Humain {
	private char nom;
	private char boisson;
	private float argent;
	

	public Humain (char nom, char boisson, float argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}
	
	public void parler (String texte) {
		System.out.println(this.nom +"texte");
	}
	
	public String toString() {
		
		String str =  ("bonjour! je m'apelle"+this.nom + "et j'aime boire du" + this.boisson);
		return str;
	}
	
	
	public float perdre_argent(float blé) {
		this.argent= argent-blé;
		return this.argent;
	}
	
	public float gagner_argent(float blé) {
		this.argent= argent+blé;
		return this.argent;
	}
	public char getnom() {
		return this.nom;
	}
	public char getBoisson() {
		return this.boisson;
	}
	
	public float getargent() {
		return this.argent;
	}
		
	
	
	

}
