/**
 * Aqui deixaremos exatamente como ta por enquanto, só pra fazer as declarações nas outras classes
 */
package controllers;

import java.io.*;
import javazoom.jl.player.Player;

public class Music {
	private String nome;
	private String caminho;
	
 
    public Music(String nome, String caminho){
    	this.nome = nome;
        this.caminho = caminho;     
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
	 * @return the caminho
	 */
	public String getCaminho() {
		return caminho;
	}


	/**
	 * @param caminho the caminho to set
	 */
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
}	
