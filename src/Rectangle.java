public class Rectangle extends Forme{
	private float largeur, longueur;
	
	public Rectangle() {
		super();
		largeur = longueur = 0;
	}
	public Rectangle(float x, float y, float largeur, float longueur) {
		super(x,y);
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	public void setLargeur(float larg) {
		largeur = larg;
	}
	public void setLongueur(float longu) {
		longueur = longu;
	}
	
	public float getLargeur() {
		return largeur;
	}
	public float getLongueur() {
		return longueur;
	}
	
	public float surface() {
		return largeur*longueur;
	}
	public float perimetre() {
		return (largeur + longueur)*2;
	}
	
	public String toString() {
		return "X="+this.getX()+", Y="+this.getY()+", Largeur="+largeur+", Longueur="+longueur;
	}
	
}
