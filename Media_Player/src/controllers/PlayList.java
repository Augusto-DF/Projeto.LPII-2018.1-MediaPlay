package controllers;

import java.util.ArrayList;

public class PlayList {
	private String nome;
	private ArrayList<Music> pl = new ArrayList();
	
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
		int index = 0;
		for(int i = 0; i < pl.size(); i++) {
			if(pl.get(i).getNome() == nome) {
				index = i;
			}
		}		
		pl.remove(index);
	}
	
	/**
	 * Busca uma musica no Array de musicas.
	 * @param nome
	 * @return A musca referete ao nome.
	 */
	//public Music findMusic(String nome)/* throw <Alguma coisa>*/ {
		
	//}
	
	/**
	 * Executa a playlist
	 */
	public void play() {
		for(Music music : pl) {
			music.tocar();
		}
	}
	
	/**
	 * Limpa o Array de musicas
	 */
	public void clear() {
		for(int i = 0; i < pl.size(); i++) {
			pl.remove(i);
		}
	}
}
