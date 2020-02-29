package clases;

import java.applet.AudioClip;

import interfaces.Estrategia;

public class SonidoSaltar implements Estrategia{

	@Override
	public void dameSonido() {
		AudioClip sonido;
		sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/saltar.wav"));
		sonido.play();
	}

}
