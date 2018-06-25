package controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;

public class PlayList {
	private String nome;
	private ArrayList<Music> pl = new ArrayList<Music>();
	
	public PlayList(String nome) {
		this.nome = nome;
	}	
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Adiciona uma musica no ArrayLIst pl.
	 * @param music
	 */
	public void addMusic(Music music) {
		pl.add(music);
	}
	
	/**
	 * Remove uma musica (a partir do nome) do ArrayList pl.
	 * @param name
	 */
	public void removeMusic(String nome) {
		for(int i = 0; i < pl.size(); i++) {
			if(pl.get(i).getNome() == nome) {
				pl.remove(i);
			}
		}		
	}
	
	/**
	 * Busca uma musica no Array de musicas.
	 * @param nome
	 * @return A musca referete ao nome.
	 */
	public Music findMusic(String nome)throws IOException{
		
		for (int i = 0; i < pl.size(); i++) {
			if(pl.get(i).getNome() == nome) {
				return pl.get(i);
			}
		}
		System.out.println("Musica " + nome + " não existe na Play List");
		return null;
	}
	
	/**
	 * Executa a playlist
	 * @throws JavaLayerException 
	 */
	public void play() throws JavaLayerException {
		try
		{
			for (int i = 0; i < pl.size(); i++) {
				FileInputStream input = new FileInputStream(pl.get(i).getCaminho()); 
	            MediaPlayer player = new MediaPlayer(input);

	            // start playing
	            player.play();
	            
	            Scanner sc = new Scanner(System.in);
	            
	            int choice = sc.nextInt();
	            
	            if(choice == 0) {
	            	sc.close();
	            	player.close();
	            }
			}
		}       
		catch (final Exception e) 
		{
            throw new RuntimeException(e);
        }
	}
	
	/**
	 * Limpa o Array de musicas
	 */
	public void clear() {
		pl.clear();
		System.out.println("Play List vazia");
	}
}
