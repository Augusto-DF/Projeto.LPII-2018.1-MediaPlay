package controllers;

public class User {
	private static int index = 1;
	private int id;
	private String nome;
	private String senha;
	private boolean vip;
	
	public User(String nome, String senha, boolean vip) {
		this.id = index;
		this.nome = nome;
		this.senha = senha;
		this.vip = vip;
		index++;
	}
	
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return vip (true para é vip, false para não é vip).
	 */
	public boolean isVip() {
		return vip;
	}
	
	/**
	 * @param vip
	 */
	public void setVip(boolean vip) {
		this.vip = vip;
	}	
}
