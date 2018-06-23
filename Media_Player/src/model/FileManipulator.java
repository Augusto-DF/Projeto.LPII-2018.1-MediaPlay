package model;

import controllers.Music;
import java.io.*;
import java.util.ArrayList;

public class FileManipulator {
	File file;
	
	//Não faz sentido essa classe ter qualquer coisa no construtor dela, ja que ele só lê o arquivo:
	public FileManipulator() {}
	/**
	 * Lê um arquivo 
	 * @param filename
	 * @return ArrayList(String) com o conteúdo do arquivo
	 */
	public ArrayList<String> ReadFile(String filename){
		
		file = new File(filename);
		String line = " ";
		ArrayList<String> vector = new ArrayList();
		int index = 0;
		
		try{
			if(!file.exists()) {
				System.out.println("Arquivo não encontrado");
			}			
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while(true) {
				if(line != null) {
					line = br.readLine();
				}else {
					break;
				}
				vector.add(index, line);
				index++;
			}
			
			br.close();
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return vector;		
	}
	
	/**
	 * Lê um arquivo 
	 * @param filename
	 * @return String com o conteúdo da primeira linha do arquivo
	 */
	public String ReadLine(String filename){
		
		file = new File(filename);
		String line = " ";
		
		try{
			if(!file.exists()) {
				System.out.println("Arquivo não encontrado");
			}			
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			line = br.readLine();				
			
			br.close();
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return line;		
	}
	
	/**
	 * Escreve em um arquivo texto. 
	 * @param filename	- Nome do arquivo
	 * @param target	- Alvo que será escrito no arquivo.
	 * @param diretorio	- Diretório no qual o arquivo estará armazenado (Caso o dirétório não exista o programa irá cria-lo).
	 * @throws IOException
	 */
	public void WriteFile(String filename, String target, String diretorio)throws IOException {
		file = new File(filename);
		new File(diretorio).mkdir();
		
		if(file.exists()) {
			BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
					
			bw.append(target);
			bw.append("\n");
			
			bw.close();
			
		}else {
			System.out.println("Arquivo inexistente.");
		}
	}
}

