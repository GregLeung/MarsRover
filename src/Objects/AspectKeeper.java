package Objects;
import Enum.*;

public class AspectKeeper {
	Node north = new Node(CardinalAspect.NORTH);
	Node east = new Node(CardinalAspect.EAST);
	Node south = new Node(CardinalAspect.SOUTH);
	Node west = new Node(CardinalAspect.WEST);
	Node currentAspect;
	
	private static class Node{
		CardinalAspect aspect;
		Node clockwiseNode;
		Node antiClockwiseNode;
	
		private Node(CardinalAspect aspect){
			this.aspect = aspect;
		}
	}
	
	public AspectKeeper(String currentAspect) {
		north.clockwiseNode = east;
		north.antiClockwiseNode = west;
		east.clockwiseNode = south;
		east.antiClockwiseNode = north;
		south.clockwiseNode = west;
		south.antiClockwiseNode = east;
		west.clockwiseNode = north;
		west.antiClockwiseNode = south;

		switch(currentAspect) {
		case "N":
			this.currentAspect = north;
			break;
		case "E":
			this.currentAspect = east;
			break;
		case "S":
			this.currentAspect = south;
			break;
		case "W":
			this.currentAspect = west;
			break;
		default:
			System.out.println("Aspect not found.");
		}	
	}
		
	public CardinalAspect getAspect() {
		return this.currentAspect.aspect;
	}
	
	public void executeCommand(Command command) {
		switch(command) {
		case TURNLEFT:
			this.currentAspect = this.currentAspect.antiClockwiseNode;
			break;
		case TURNRIGHT:
			this.currentAspect = this.currentAspect.clockwiseNode;
			break;
		default:
			System.out.println("Command not found.");
		}
	}
	
}
