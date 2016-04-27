package lib;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

public class IORead implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener {
	public ArrayList<IOEvent> events = new ArrayList<IOEvent>();

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX());
		events.add(new IOEvent("mouseDragged", e.getX(), e.getY()));
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("mouseMoved", e.getX(), e.getY()));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("mouseClicked", e.getX(), e.getY()));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("mouseEntered", e.getX(), e.getY()));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("mouseExited", e.getX(), e.getY()));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("mousePressed", e.getX(), e.getY()));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("mouseReleased", e.getX(), e.getY()));
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("mouseWheelMoved", 100, 100));
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("keyPressed", e.getKeyChar()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("keyReleased", e.getKeyChar()));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		events.add(new IOEvent("keyTyped", e.getKeyChar()));
	}

}
