package main;

public class Bateria extends Instrumento{
	private int numeroTambores;
	
	public Bateria(String marca, int numeroTambores) {
		super(marca);
		this.numeroTambores = numeroTambores;	
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando la bateria");
	}

	public int getNumeroTambores() {
		return numeroTambores;
	}

	public void setNumeroTambores(int numeroTambores) {
		this.numeroTambores = numeroTambores;
	}
}
