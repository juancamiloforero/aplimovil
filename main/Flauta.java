package main;

public class Flauta extends Instrumento{
	private int tama�o;
	
	public Flauta(String marca, int tama�o) {
		super(marca);
		this.tama�o = tama�o;
	}
	
	@Override
	public void tocar() {
		System.out.println("Suena una flauta...");
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
}
