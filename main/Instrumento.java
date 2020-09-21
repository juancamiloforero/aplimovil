package main;

public class Instrumento {
	protected String marca;
	
	public Instrumento(String nombre) {
		this.marca = nombre;
	}
	
	public void tocar() {
		System.out.println("Suena un instrumento");
	}
	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
