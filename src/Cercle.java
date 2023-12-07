public class Cercle extends Forme{
	private float rayon;
	
	public Cercle() {
		super();
		rayon = 0;
	}
		 
	public Cercle(float x, float y, float rayon) {
		super(x,y);
		this.rayon = rayon;
	}
	
	public void setRayon(float r) {
		rayon = r;
	}
	
	public float getRayon() {
		return rayon;
	}
	
	public float surface() {
		return (float) (3.14*rayon*rayon);
	}
	public float perimetre() {
		return (float) (2*rayon*3.14);
	}
	
	public String toString() {
		return "X="+this.getX()+", Y="+this.getY()+", Rayon="+rayon;
	}
	
}
