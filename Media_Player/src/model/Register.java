package model;

import java.util.ArrayList;

import controllers.User;
import controllers.Vip;

public class Register {
	FileManipulator file;
	
	public Register() {}
	
	/**
	 * Coloca todos os atributos de um usuário em uma string com a seguinte identação:
	 * <id;nome;senha;éVip;>
	 * @param user
	 * @return String com os atributos do usuário separados por ;
	 */
	public String stringUser(User user) {
		String strUsr = "<"+user.getId()+";"+user.getNome()
						+";"+user.getSenha()+";"+user.isVip()+";"+">";
		
		
		return strUsr;
	}
	
	/**
	 * Coloca todos os atributos de um usuário vip em uma string com a seguinte identação:
	 * <id;nome;senha;éVip;nome_de_cada_playlist(Separadas por ;)>
	 * @param vip
	 * @return String com os atributos do usuário separados por ;
	 */
	public String stringVip(Vip vip) {
		String strUsr = "<"+vip.getId()+";"+vip.getNome()
				+";"+vip.getSenha()+";"+vip.isVip()+";";

		ArrayList<String> playlists = vip.getPlayLists();
		for(int i = 0; i < playlists.size(); ++i)
		{
			strUsr += playlists.get(i)+";";
		}
		
		strUsr += ">";

		return strUsr;
	}	
	
	/**
	 * Busca no arquivo usuario.txt um usuário passado por parametro e caso não exista no arquivo ele adiciona o novo usuário, antes
	 * de registrar deve ser feita a verificação se o usuárioé ou não um usuário vip.
	 * @param user
	 * @param filename
	 */
	public void registerUser(User user, String filename) {		
		
		
		
	}
}



/*
 * Add o usuário ná arvore
 * public void registerUser(User user, Node tree) {		
		if(tree.searchNode(tree,user.getId()) == null) {
			tree.insert(new Node(user), tree);
		}		
	}
 */