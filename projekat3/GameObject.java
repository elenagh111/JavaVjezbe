package projekat2;

public abstract class GameObject {
	private int x, y, width, height;
	private String type;
	
	public GameObject(String type, int x, int y, int width, int height) {
		this.type = type;
		this.x = x;
		this.y = y;
        this.width = width;
        this.height = height;
        
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public boolean intersects(GameObject other) {
		boolean xOverlap = Math.abs(this.x - other.x) < (this.width + other.width) / 2;
        boolean yOverlap = Math.abs(this.y - other.y) < (this.height + other.height) / 2;
        return xOverlap && yOverlap;
	        }
	
	@Override
	public String toString() {
		return type + " (" + x + "," + y + ") " + width + "x" + height;
	        }
	    }
