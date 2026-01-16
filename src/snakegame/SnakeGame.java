package snakegame;

import javax.swing.*;
public class SnakeGame extends JFrame{

	public SnakeGame() {
		super("Snake Game");
		add(new Board());
		pack();  //refreshes frame to reflect our new changes
	

		setLocationRelativeTo(null);
		setResizable(false);
		
	}
public static void main(String args[]) {
	new SnakeGame().setVisible(true);;
}
}
