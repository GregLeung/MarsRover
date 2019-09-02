package Enum;

public enum CardinalAspect {
	NORTH(0, "N"),
	EAST(1, "E"),
	SOUTH(2, "S"),
	WEST(3, "W");
	
	public int key;
	public String value;
	
	CardinalAspect(int key, String value){
		this.key = key;
		this.value = value;
	}
}
