package Objects;

import Enum.*;

//rover class
public class Rover {
	Coordinates coordinates;
	AspectKeeper aspectKeeper;
	Plateau map;
	
	public Rover(int x, int y, String aspect, int plateauWidth, int plateauHeight){
		this.coordinates = new Coordinates(x, y);
		this.aspectKeeper = new AspectKeeper(aspect);
	}
	
	public void executeCommand(Command command) {
		if(command.equals(Command.TURNLEFT) || command.equals(Command.TURNRIGHT)) {
			this.aspectKeeper.executeCommand(command);
		}else{
			this.moveForward();
		}
	}
	
	private void moveForward() {
		switch(aspectKeeper.getAspect()) {
		case NORTH:
			coordinates.increaseY();
			break;
		case EAST:
			coordinates.increaseX();
			break;
		case SOUTH:
			coordinates.decreaseY();
			break;
		case WEST:
			coordinates.decreaseX();
			break;
		}
	}
	
	public void printCurrentLocation() {
		System.out.println(this.coordinates.x + " " + this.coordinates.y + " " + this.aspectKeeper.getAspect().value);
	}
}
