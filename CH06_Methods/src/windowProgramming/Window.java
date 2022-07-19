package windowProgramming;

public class Window {
	//가로 세로 길이와 위치
	
	private int width;
	private int height;
	private boolean isVisible;
	private int top;
	private int left;
	
	public Window() {
		// 기본 생성자는 생략되어 있음
	}
	
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getTop() {
		return top;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getLeft() {
		return left;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	
	}


