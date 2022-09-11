package br.edu.fatec.biblioteca.main;

public class Livro {
	private String titulo;
	private String genero;
	private String autor;
		
		public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void imprimirDados() {
		System.out.println("Título do livro: " + getTitulo());
		System.out.println("Gênero do livro: " + getGenero());
		System.out.println("Autor(a) do livro: " + getAutor());
		}

		}
		

	
	
		