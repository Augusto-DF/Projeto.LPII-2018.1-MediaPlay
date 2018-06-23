package controllers;

import java.util.ArrayList;

public class Vip extends User{
	
	ArrayList<PlayList> playLists = new ArrayList();
	
	public Vip(String nome, String senha, boolean vip) {
		super(nome, senha, vip);
	}
	
	/**
	 * Recebe uma PlayList e adiciona ao ArrayList (playLists)
	 * Obs.: No caso da adição é interessante receber o objeto PlayList em vez de só o nome.
	 */
	public void addPlayList() {
		
	}
	
	/**
	 * Remove uma PlayList do Array apartir de seu nome.
	 * @param nome
	 */
	public void removePlayList(String nome) {
		
	}
	
	/**
	 * Busca uma PlayList no Array.
	 * Obs.: No caso da play list n existir é invocado uma excessão que eu n lembro qual é.
	 * @param nome
	 * @return O objeto PlayList
	 */
	//public PlayList findPlayList(String nome)/*throw <Alguma coisa>*/ {
		
	//}
	
	/**
	 * Limpa o vetor de PlayList.
	 */
	public void clear() {
		
	}
	
	/**
	 * Lista o nome de todas as Play Lists de um usuário vip.
	 * @return Array de string com cada nome de Play List
	 */
	public ArrayList<String> getPlayLists(){
		ArrayList <String> names = new ArrayList();
		for(int i = 0; i < playLists.size(); i++) {
			names.add(playLists.get(i).getNome());
		}
		return names;
	}
}
