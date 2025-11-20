package projekat4;

public class CircleCollider implements Collidable {

    private double cx;
    private double cy;
    private double radius;

    public CircleCollider(double cx, double cy, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Poluprecnik mora biti veci od nule.");
        }
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
    }

    public double getCx() {
		return cx;
	}
	public double getCy() {
		return cy;
	}
	public double getRadius() {
		return radius;
	}

	@Override
	public boolean intersects(Collidable other) {

	    if (other instanceof CircleCollider) {
	        CircleCollider c = (CircleCollider) other;

	        double dx = this.cx - c.cx;
	        double dy = this.cy - c.cy;
	        double distanceSquared = dx * dx + dy * dy;
	        double radiusSum = this.radius + c.radius;

	        return distanceSquared <= radiusSum * radiusSum;
	    }

	    if (other instanceof RectangleCollider) {
	        return other.intersects(this);
	    }

	    return false;
	}
}