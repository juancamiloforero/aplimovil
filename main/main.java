package main;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
	
		Violin violin1 = new Violin("Stradivarius", "Caoba");
		Guitarra guitarra1 = new Guitarra("Gibson", 24);
		
		ArrayList<Instrumento> auxInstrumentos = new ArrayList<Instrumento>();
		auxInstrumentos.add(violin1);
		auxInstrumentos.add(guitarra1);
		
		// Polimorfismo
		Orquesta miOrquesta = new Orquesta(auxInstrumentos);
		miOrquesta.tocarOrquesta();
		
		// Interface
		guitarra1.cambiarCuerdas();
		violin1.cambiarCuerdas();
	}
}
