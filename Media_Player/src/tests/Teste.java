package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import controllers.*;
import javazoom.jl.decoder.JavaLayerException;
import model.*;

public class Teste {
	public static void main(String[] args) throws IOException, JavaLayerException {
//================Teste Musica ===============================
		//Music music1 = new Music("2", "/home/mattheus30/Área de Trabalho/Faculdade/2018.1/LP II/Projeto.LPII-2018.1-MediaPlay/Media_Player/Musicas/2.mp3");
		//music1.tocar();		//OK
		//music1.para();		//n-OK
//============================================================
//================Teste PlayList==============================
		Music music2 = new Music("Rap do 17", "/home/mattheus30/eclipse-workspace/Media_Player/Musicas/Rap do 17.mp3");
		PlayList pl = new PlayList("rap");
		//pl.addMusic(music1);	//OK
		//pl.addMusic(music2);	//OK
		
		//pl.play();				//OK
		//if(pl.findMusic("Rap do 17") != null) {
		//	pl.findMusic("Rap do 17").tocar();	//OK
		//}			
		//pl.removeMusic("Rap do 17");	//OK
		//pl.play();			//OK
		//pl.clear();			//OK
//============================================================
//=====================Teste Usuário==========================
		User user1 = new User("Augusto", "123", false); //OK
		User user2 = new User("Tiago", "1234", true);	//OK
//============================================================
//=======================Teste Vip============================
		Vip v1 = new Vip(user1);
//============================================================
		
		try {
			
            FileInputStream input = new FileInputStream(music2.getCaminho()); 
            MediaPlayer player = new MediaPlayer(input);

            // start playing
            player.play();
            
            Scanner sc = new Scanner(System.in);
            
            int choice = sc.nextInt();
            
            if(choice == 0) {
            	player.close();
            }
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}


