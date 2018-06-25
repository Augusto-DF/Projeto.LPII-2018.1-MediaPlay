package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import controllers.*;
import javazoom.jl.decoder.JavaLayerException;
import model.*;

public class Teste {
	public static void main(String[] args) throws IOException, JavaLayerException {
		Music mus1 = new Music("2.mp3", "/home/thiago/UFRN/LP2/Projeto.LPII-2018.1-MediaPlay/Media_Player/Musicas/2.mp3");
		Music mus2 = new Music("Rap do 17.mp3", "/home/thiago/UFRN/LP2/Projeto.LPII-2018.1-MediaPlay/Media_Player/Musicas/Rap do 17.mp3");
		PlayList pl = new PlayList("rap");
		pl.addMusic(mus1);
		pl.addMusic(mus2);
		try
		{
			pl.play();
		}
		catch (final Exception e) {
            throw new RuntimeException(e);
		}
		
		
		
		
		
		
	}
}


