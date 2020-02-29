package clases;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import interfaces.Estrategia;

public class LaminaDibujar extends JPanel implements KeyListener{

	LaminaAnimacion miLaminaAnimacion;
	
	public LaminaDibujar() {
		setLayout(new GridLayout());
		
		miLaminaAnimacion=new LaminaAnimacion("Knight","Idle/idle");
		add(miLaminaAnimacion,BorderLayout.CENTER);
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()=='a') {
			System.out.println("Entró en el evento");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
}
