package br.edu.fatec.biblioteca.main;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Livro func = new Livro();
		func.setTitulo(JOptionPane.showInputDialog("Informe o Título do livro: "));
		func.setGenero(JOptionPane.showInputDialog("Informe o gênero do livro: "));
		func.setAutor(JOptionPane.showInputDialog("Informe o nome do autor(a) do livro: "));
		func.imprimirDados();

	}

}
