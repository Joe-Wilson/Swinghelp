package lib;

import java.awt.event.MouseWheelEvent;

public class IOEvent {
	private String type;
	private int x, y;
	private int button;
	private char key;
	private MouseWheelEvent wheelEvent;

	public IOEvent(String type, int x, int y) {
		this.type = type;
		this.x = x;
		this.y = y;
	}

	public IOEvent(String type, int x, int y, int button) {
		this.type = type;
		this.x = x;
		this.y = y;
		this.button = button;
	}

	public IOEvent(String type, char key) {
		this.type = type;
		this.key = key;
	}

	public IOEvent(String type, MouseWheelEvent wheelEvent) {
		this.type = type;
		this.wheelEvent = wheelEvent;
	}

	public String getType() {
		return type;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public char getKey() {
		return key;
	}

	public MouseWheelEvent getwheelEvent() {
		return wheelEvent;
	}

	public int getButton() {
		return button;
	}

}
