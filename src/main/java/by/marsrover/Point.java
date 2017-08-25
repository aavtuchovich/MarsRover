package by.marsrover;

public class Point {
	private int loc;
	private int maxLoc;

	public int getLoc() {
		return loc;
	}

	public void setLoc(int loc) {
		this.loc = loc;
	}

	public int getMaxLoc() {
		return maxLoc;
	}

	public void setMaxLoc(int maxLoc) {
		this.maxLoc = maxLoc;
	}

	public Point(int locationValue, int maxLocationValue) {
		setLoc(locationValue);
		setMaxLoc(maxLocationValue);
	}

	public int getForwardLocation() {
		return (getLoc() + 1) % (getMaxLoc() + 1);
	}

	public int getBackwardLocation() {
		if (getLoc() > 0) return getLoc() - 1;
		else return getMaxLoc();
	}
}
