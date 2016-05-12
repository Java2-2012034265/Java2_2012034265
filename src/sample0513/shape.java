package sample0513;

abstract public class shape{
	protected int x, y;
	
	public shape() { x = 0; y = 0; }
	
	public shape(int _x, int _y)
	{
	x = _x; this.y = y;
	}
	
	public void move(int _x, int _y) {this.x += _x; y += _y;}
}
