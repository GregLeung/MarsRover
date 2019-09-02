package Objects;

public class Instruction {
	String roverInput;
    String commandsInput;
    String[] roverInfo;
    
    public Instruction(String roverInput, String commandsInput){
    	this.roverInput = roverInput;
    	this.commandsInput = commandsInput;
    	this.roverInfo = roverInput.split(" ");
    }
    
    public String getCommandsInput() {
		return commandsInput;
	}

	public String[] getRoverInfo() {
		return roverInfo;
	}
}
