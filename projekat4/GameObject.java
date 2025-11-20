package projekat4;

public abstract class GameObject implements Collidable {


	private int x;
	private int y;
    private String objekatPravIliKrug ;

	public GameObject(int x, int y, String objekatPravIliKrug) {
		super();
		this.setX (x);
		this.setY (y);
		this.setObjekatPravIliKrug (objekatPravIliKrug);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (y>0) {
			throw new IllegalArgumentException("Ne mozete unijeti broj manji od nule");
		}
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (x>0) {
			throw new IllegalArgumentException("Ne mozete unijeti broj manji od nule");
	}
	}
	
	public String getObjekatPravIliKrug() {
		return objekatPravIliKrug;
	}

	public void setObjekatPravIliKrug(String objekatPravIliKrug) {
		this.objekatPravIliKrug = objekatPravIliKrug;
	
}
	
	public abstract String getDisplayName();

	@Override
	public String toString() {
		return "{ 'GameObject': , 'x':" + getX()+ "','y':" + getY()+ "', objekatPravIliKrug':" + getObjekatPravIliKrug()+ "}";
	}
	
}