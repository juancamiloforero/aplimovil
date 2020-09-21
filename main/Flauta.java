package main;

public class Flauta extends Instrumento{
	private int tamaño;
	
	public Flauta(String marca, int tamaño) {
		super(marca);
		this.tamaño = tamaño;
	}
	
	@Override
	public void tocar() {
		System.out.println("Suena una flauta...");
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
}
