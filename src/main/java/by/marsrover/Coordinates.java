package by.marsrover;

public class Coordinates {
	private int myposX;
	private int myposY;
	private int mapSizeX;
	private int mapSizeY;
	private Direction direction;

	public Coordinates(int mapSizeX, int mapSizeY, int myposX, int myposY, Direction direction) {
		this.mapSizeX = mapSizeX;
		this.mapSizeY = mapSizeY;
		this.myposX = myposX;
		this.myposY = myposY;
		this.direction = direction;
	}

	public void moveForward() {
		switch (direction) {
			case North:
				myposY++;
				break;
			case South:
				myposY--;
				break;
			case East:
				myposX++;
				break;
			case West:
				myposX--;
				break;
		}
	}

	public void moveBackward() {
		switch (direction) {
			case North:
				myposY--;
				break;
			case South:
				myposY++;
				break;
			case East:
				myposX--;
				break;
			case West:
				myposX++;
				break;
		}
	}

	public void changeDirectionLeft() {
		switch (direction) {
			case North:
				direction = Direction.West;
				break;
			case South:
				direction = Direction.East;
				break;
			case East:
				direction = Direction.North;
				break;
			case West:
				direction = Direction.South;
				break;
		}
	}

	public void changeDirectionRight() {
		switch (direction) {
			case North:
				direction = Direction.East;
				break;
			case South:
				direction = Direction.West;
				break;
			case East:
				direction = Direction.South;
				break;
			case West:
				direction = Direction.North;
				break;
		}
	}

	public int getMapSizeX() {
		return mapSizeX;
	}

	public void setMapSizeX(int mapSizeX) {
		this.mapSizeX = mapSizeX;
	}

	public int getMapSizeY() {
		return mapSizeY;
	}

	public void setMapSizeY(int mapSizeY) {
		this.mapSizeY = mapSizeY;
	}

	public int getMyposX() {
		return myposX;
	}

	public void setMyposX(int myposX) {
		this.myposX = myposX;
	}

	public int getMyposY() {
		return myposY;
	}

	public void setMyposY(int myposY) {
		this.myposY = myposY;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
}
