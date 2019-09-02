package Objects;

public class Coordinates {
	int x;
	int y;
	
	Coordinates(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void increaseX() {
		this.x++;
	}
	
	public void increaseY() {
		this.y++;
	}
	
	public void decreaseX() {
		this.x--;
	}
	
	public void decreaseY() {
		this.y--;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
