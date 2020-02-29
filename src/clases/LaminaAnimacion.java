package clases;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import interfaces.*;

public class LaminaAnimacion extends JPanel implements Runnable{
	
	private Image imagen;
	private String personaje;
	private String accion;
	private int indice=1;
		
	public LaminaAnimacion(String personaje, String accion) {
		this.personaje=personaje;
		this.accion=accion;
		arrancarHilo();
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		try {
			imagen=ImageIO.read(new File("PNG/"+personaje+"/"+accion+1+".png"));
			//imagen=ImageIO.read(new File("PNG/"+personaje+"/"+accion+indice+".png"));
		} catch (IOException e) {
			System.out.println("");
			}
			
		g.fillRect(0, 0, 800, 600);
		g.drawImage(imagen,0,0,imagen.getWidth(null),imagen.getHeight(null),0,0,imagen.getWidth(null),imagen.getHeight(null),this);
		repaint();
		
		
	}
	
	public void arrancarHilo() {
		Thread hilo=new Thread(this);
		hilo.start();
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(90);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Problema al entrar al hilo LaminaAnimacion");
			}
			indice++;
			if(indice>12) {
				indice=0;
			}
		}
		
	}

}
