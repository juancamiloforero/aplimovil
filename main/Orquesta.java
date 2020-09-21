package main;
import java.util.ArrayList;

public class Orquesta {
	private ArrayList<Instrumento> misInstrumentos;
	
	public Orquesta(ArrayList<Instrumento> instrumentos) {
		this.misInstrumentos = instrumentos;
	}
	
	public void tocarOrquesta() {
		System.out.println("Suena la orquesta con sus instrumentos: ");
		for(int i = 0; i < this.misInstrumentos.size(); i++) {
			this.misInstrumentos.get(i).tocar();
		}
		System.out.println("----------------------------------------");
	}
}
