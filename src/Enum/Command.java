package Enum;

public enum Command {
	TURNLEFT("L", "TURN_LEFT"),
	TURNRIGHT("R", "TURN_RIGHT"),
	MOVEFORWARD("M", "MOVE_FORWARD");
	
	String key;
	String value;
	
	Command(String key, String value){
		this.key = key;
		this.value = value;
	}
}
