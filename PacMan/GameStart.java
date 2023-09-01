package pacman;

import javax.swing.JFrame;

public class GameStart extends JFrame{

	public GameStart() {
		add(new GameSystem());
	}
	
	
	public static void main(String[] args) {
		GameStart pac = new GameStart();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(380,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}

}
