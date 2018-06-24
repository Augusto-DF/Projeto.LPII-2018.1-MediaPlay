package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Vip extends User{
	
	ArrayList<PlayList> playLists = new ArrayList();
	
	public Vip(String nome, String senha, boolean vip) {
		super(nome, senha, vip);
	}
	
	public Vip(User user) {
		super(user.getNome(), user.getSenha(), true);
		user.setVip(true);
	}
	
	/**
	 * Cria e armazena uma playlist.
	 * Obs.: No caso da adição é interessante receber o objeto PlayList em vez de só o nome.
	 */
	public void createPlayList() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("Nome da nova Play List: ");
		name = sc.nextLine();
		
		playLists.add(new PlayList(name));
	}
	
	/**
	 * Remove uma PlayList do Array apartir de seu nome.
	 * @param nome
	 */
	public void removePlayList(String nome) {
		for(int i = 0; i < playLists.size(); i++) {
			if(playLists.get(i).getNome() == nome) {
				playLists.remove(i);
			}
		}		
	}
	
	/**
	 * Busca uma PlayList no Array.
	 * Obs.: No caso da play list n existir é invocado uma excessão que eu n lembro qual é.
	 * @param nome
	 * @return O objeto PlayList
	 */
	public PlayList findPlayList(String nome)throws IOException {
		for(int i = 0; i < playLists.size(); i++) {
			if(playLists.get(i).getNome() == nome) {
				return playLists.get(i);
			}
		}
		System.out.println("Play List inexistente");
		return null;
	}
	
	/**
	 * Limpa o vetor de PlayList.
	 */
	public void clear() {
		playLists.clear();
		System.out.println("Play List vazia");
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
