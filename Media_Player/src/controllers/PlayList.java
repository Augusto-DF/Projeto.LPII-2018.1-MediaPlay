package controllers;

import java.io.IOException;
import java.util.ArrayList;

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
	 */
	public void play() {
		if(pl != null) {
			for(Music music : pl) {
				System.out.println(music.getNome());
				music.tocar();
			}
		}else {
			System.out.println("Play list vazia");
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
