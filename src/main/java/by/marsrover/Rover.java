package by.marsrover;

public class Rover {
	//coordinates
	private Directions currentDirection;
	private Coordinates coordinates;

	public void receiveCommands(String commands) throws Exception {
		for (char command : commands.toCharArray()) {
			if (!receiveSingleCommand(command)) {
				break;
			}
		}
	}

	public boolean receiveSingleCommand(char command) throws Exception {
		switch (Character.toUpperCase(command)) {
			case 'F':
				return getCoordinates().moveForward();
			case 'B':
				return getCoordinates().moveBackward();
			case 'L':
				getCoordinates().changeDirectionLeft();
				return true;
			case 'R':
				getCoordinates().changeDirectionRight();
				return true;
			default:
				throw new Exception("Command " + command + " is unknown.");
		}
	}

	public static void main(String[] args) {
}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
}