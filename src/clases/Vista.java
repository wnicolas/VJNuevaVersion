package clases;

import javax.swing.*;

public class Vista extends JFrame{

	public Vista() {
		
		
		setTitle("Video Juego (Nueva versión)");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		LaminaDibujar miLaminaDibujar=new LaminaDibujar();
		add(miLaminaDibujar);
	}
	
}
