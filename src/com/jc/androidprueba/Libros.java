package com.jc.androidprueba;

public class Libros {
	String titulo;
	String autor;
	String  tema;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public Libros(String titulo, String autor, String tema) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tema = tema;
	}
	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", autor=" + autor + ", tema="
				+ tema + "]";
	}
	

}
