package main;

public class Guitarra extends Instrumento implements Cuerdas{
	private int numeroTrastes;
	
	public Guitarra(String marca, int numeroTrastes) {
		super(marca);
		this.numeroTrastes = numeroTrastes;
	}
	
	@Override
	public void tocar() {
		System.out.println("Suena una Guitarra " + this.marca + "!");
	}

	@Override
	public void cambiarCuerdas() {
		System.out.println("Cambiando cuerdas de guitarra");
		
	}

	public int getNumeroTrastes() {
		return numeroTrastes;
	}

	public void setNumeroTrastes(int tipoMadera) {
		this.numeroTrastes = tipoMadera;
	}
}
