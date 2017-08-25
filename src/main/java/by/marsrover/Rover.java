package by.marsrover;

public class Rover {
	//coordinates
	private Coordinates coordinates;

	public Rover(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public void receiveCommands(String commands) throws Exception {
		for (char command : commands.toCharArray()) {
			receiveSingleCommand(command);
		}
	}

	public void receiveSingleCommand(char command) throws Exception {
		switch (Character.toUpperCase(command)) {
			case 'F':
				coordinates.moveForward();
				break;
			case 'B':
				coordinates.moveBackward();
				break;
			case 'L':
				coordinates.changeDirectionLeft();
				break;
			case 'R':
				coordinates.changeDirectionRight();
				break;
		}

		if (coordinates.getMyposX() > coordinates.getMapSizeX()) {
			coordinates.setMyposX(coordinates.getMapSizeX());
		}
		if (coordinates.getMyposY() > coordinates.getMapSizeY()) {
			coordinates.setMyposY(coordinates.getMapSizeY());
		}
		if (coordinates.getMyposX() < 0) {
			coordinates.setMyposX(0);
		}
		if (coordinates.getMyposY() < 0) {
			coordinates.setMyposY(0);
		}
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public Direction getCurrentDirection() {
		return getCoordinates().getDirection();
	}

	public int getMyPositionX() {
		return getCoordinates().getMyposX();
	}

	public int getMyPositionY() {
		return getCoordinates().getMyposY();
	}

	public static void main(String[] args) throws Exception {
		Rover rover = new Rover(new Coordinates(5, 5, 1, 2, Direction.North));
		rover.receiveCommands("LFLFLFLFF");
	}
}
