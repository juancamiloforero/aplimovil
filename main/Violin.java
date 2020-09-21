package main;

public class Violin extends Instrumento implements Cuerdas{
	private String tipoMadera;
	
	public Violin(String marca, String tipoMadera) {
		super(marca);
		this.tipoMadera = tipoMadera;
	}
	
	@Override
	public void tocar() {
		System.out.println("Suena un Violín " + this.marca + "...");
	}

	@Override
	public void cambiarCuerdas() {
		System.out.println("Cambiando cuerdas de Violín");
		
	}

	public String getTipoMadera() {
		return tipoMadera;
	}

	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}
}
