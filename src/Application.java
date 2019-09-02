import java.util.ArrayList;
import java.util.Scanner;

import Enum.Command;
import Objects.Instruction;
import Objects.Rover;

public class Application {

	static int NUMBER_OF_ROVERS = 2;
	
	public static void main(String args[]) {
	    Scanner scanner = new Scanner(System.in);
	    //get info of the plateau
	    String plateauInput = scanner.nextLine();
	    String[] plateauInfo = plateauInput.split(" ");
	    ArrayList<Instruction> instructions = new ArrayList<Instruction>();
	    //get info of the rover and commands for each rover
	    for(int i = 0; i < NUMBER_OF_ROVERS; ++i) {
		    String roverInput = scanner.nextLine().toUpperCase();
		    String commandsInput = scanner.nextLine().toUpperCase();
		    instructions.add(new Instruction(roverInput, commandsInput));
	    }
	    for(Instruction instruction: instructions) {
	    	String[] roverInfo = instruction.getRoverInfo();
	    	String commandsInput = instruction.getCommandsInput();
	    	//construct a rover
	    	Rover rover = new Rover(Integer.parseInt(roverInfo[0]), Integer.parseInt(roverInfo[1]), roverInfo[2], Integer.parseInt(plateauInfo[0]), Integer.parseInt(plateauInfo[1]));
		    //execute the commands
		    for(int i = 0; i < commandsInput.length(); ++i) {
		    	Character command = commandsInput.charAt(i);
		    	switch(command){
		    	case 'L':
		    		rover.executeCommand(Command.TURNLEFT);
		    		break;
		    	case 'R':
		    		rover.executeCommand(Command.TURNRIGHT);
		    		break;
		    	case 'M':
		    		rover.executeCommand(Command.MOVEFORWARD);
		    		break;
		    	default:
		    		System.out.println("Command not found.");
		    	}
		    }
		    //print out final location
		    rover.printCurrentLocation();
	    }
	    scanner.close();
	}
}
