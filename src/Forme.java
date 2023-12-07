abstract class Forme {
	private float x,y;
	
	public Forme() {
		this.x = 0;
		this.y = 0;
	}
	public Forme(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(float X) {
		x = X;
	}
	public void setY(float Y) {
		y = Y;
	}
	
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	
	public void deplacer(double dx, double dy) {
		x += dx;
		y += dy;
	}
	public abstract float surface();
	public abstract float perimetre();
}
