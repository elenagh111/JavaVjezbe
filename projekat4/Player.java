package projekat4;

public class Player extends GameObject {

	private String imeIgraca;
	private int health;

	public Player(int x, int y, String objekatPravIliKrug, String imeIgraca, int health) {
		super(x, y, objekatPravIliKrug);
		this.imeIgraca = imeIgraca;
		this.health = health;
	}

	public String getImeIgraca() {
		return imeIgraca;
	}
	public void setImeIgraca(String imeIgraca) {
		this.imeIgraca = imeIgraca;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public boolean intersects(Collidable other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

}