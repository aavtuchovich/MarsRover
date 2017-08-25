package by.marsrover;

public class Coordinates {
	private Point x;
	private Point y;
	private Directions direction;

	public Coordinates(Point x, Point y, Directions direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}


	protected boolean move(Directions directionValue) {
		int xLocation = x.getLoc();
		int yLocation = y.getLoc();
		switch (directionValue) {
			case North:
				yLocation = y.getForwardLocation();
				break;
			case East:
				xLocation = x.getForwardLocation();
				break;
			case South:
				yLocation = y.getBackwardLocation();
				break;
			case West:
				xLocation = x.getBackwardLocation();
				break;
		}
		return false;
	}

	public boolean moveForward() {
		return move(direction);
	}

	public boolean moveBackward() {
		return false;
	}

	public void changeDirectionLeft() {
	}

	public void changeDirectionRight() {
	}
}
