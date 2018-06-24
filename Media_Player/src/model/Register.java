package model;

import java.util.*;
import java.lang.Object;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
		ArrayList<String> playlists = vip.getPlaylists();
		for(int i = 0; i < playlists.size(); ++i)
		{
			strUsr += playlists.get(i)+";";
		}
		
		strUsr += ">";

		return strUsr;
	}	
	
	/**
	 * Busca no arquivo usuario.txt um usuário passado por parametro e caso não exista no arquivo ele adiciona o novo usuário, antes
	 * de registrar deve ser feita a verificação se o usuário é ou não um usuário vip.
	 * @param user
	 * @param filename
	 */
	public void registerUser(User user, String filename) throws IOException {		
		try {
	            File f = new File("src/usuario.txt");
	            BufferedReader b = new BufferedReader(new FileReader(f));
	            String readLine = "";
	            System.out.println("Reading file using Buffered Reader");
	            while ((readLine = b.readLine()) != null) {
	            	b.skip('<'); b.skip('>');
	            	String str = readLine;
	            	List<String> userInfo = new ArrayList<String> ();
	            	userInfo = Arrays.asList(str.split(";"));
	           
	                System.out.println(userInfo.get(1));
	                System.out.println(userInfo.get(2));
	                System.out.println(userInfo.get(3));
	                System.out.println(userInfo.get(4));
	            }
	            b.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

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